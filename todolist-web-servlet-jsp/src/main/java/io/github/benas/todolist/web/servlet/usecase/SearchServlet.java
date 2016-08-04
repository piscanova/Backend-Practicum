package io.github.benas.todolist.web.servlet.usecase;

import io.github.benas.todolist.web.servlet.BaseUseCaseServlet;
import io.github.benas.todolist.web.util.Views;
import io.github.todolist.core.domain.Pure;
import io.github.todolist.core.service.api.PureService;
import org.springframework.context.ApplicationContext;
import org.springframework.web.context.support.WebApplicationContextUtils;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.List;

/**
 * Created by thanksgiving on 8/2/16.
 */
@WebServlet(name = "SearchServlet", urlPatterns = {"/search"})
public class SearchServlet extends BaseUseCaseServlet {
    private PureService pureService;

    @Override
    public void init(ServletConfig servletConfig) throws ServletException {
        super.init(servletConfig);
        ApplicationContext applicationContext = WebApplicationContextUtils.getWebApplicationContext(servletConfig.getServletContext());
        pureService = applicationContext.getBean(PureService.class);
    }

    @Override
    protected String performDoGet(HttpServletRequest request, HttpServletResponse response) {
        String ip = request.getParameter("ip");
        int page = Integer.parseInt(request.getParameter("page"));
        if (ip == null || !validIp(ip)) {
            request.setAttribute("error", "Input ip is not valid");
        } else {
            List<Pure> files = getPureService().getPureByIp(ip, page);
        }
//        request.setAttribute("IpSearchResult", );

        return Views.SEARCH_PAGE;
    }

    private boolean validIp(String ip) {
        String[] ips = ip.split(".");
        if (ips.length != 4) return false;
        for (String sub : ips) {
            long subIp = Long.parseLong(sub);
            if (subIp < 0 || subIp > 255) return false;
        }
        return true;
    }

    public PureService getPureService() {
        return pureService;
    }
}
