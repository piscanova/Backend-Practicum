/*
 * The MIT License
 *
 *   Copyright (c) 2015, Mahmoud Ben Hassine (mahmoud.benhassine@icloud.com)
 *
 *   Permission is hereby granted, free of charge, to any person obtaining a copy
 *   of this software and associated documentation files (the "Software"), to deal
 *   in the Software without restriction, including without limitation the rights
 *   to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 *   copies of the Software, and to permit persons to whom the Software is
 *   furnished to do so, subject to the following conditions:
 *
 *   The above copyright notice and this permission notice shall be included in
 *   all copies or substantial portions of the Software.
 *
 *   THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 *   IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 *   FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 *   AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 *   LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 *   OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN
 *   THE SOFTWARE.
 */

package io.github.benas.todolist.web.servlet;

/**
 * Servlet that controls the "index" page.
 */

import io.github.todolist.core.service.api.GeoStatService;
import org.json.JSONObject;
import org.springframework.context.ApplicationContext;
import org.springframework.web.context.support.WebApplicationContextUtils;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import static io.github.benas.todolist.web.util.Views.INDEX_PAGE;

@WebServlet(name = "IndexServlet", urlPatterns = {"/", "/index"})
public class IndexServlet extends BaseUseCaseServlet {
    private GeoStatService geoStatService;

    @Override
    public void init(ServletConfig servletConfig) throws ServletException {
        super.init(servletConfig);
        ApplicationContext applicationContext = WebApplicationContextUtils.getWebApplicationContext(servletConfig.getServletContext());
        geoStatService = applicationContext.getBean(GeoStatService.class);
    }

    public GeoStatService getGeoStatService() {
        return geoStatService;
    }
    @Override
    protected String performDoGet(HttpServletRequest request, HttpServletResponse response) {
        request.setAttribute("indexTabStyle", "active");
        System.out.println("Get json");
        JSONObject jsonObject = getGeoStatService().getAllCountriesCounts();
        request.setAttribute("malwareMap", jsonObject);
        return INDEX_PAGE;
    }
}

/*@WebServlet(name = "IndexServlet", urlPatterns = {"/", "/index"})
public class IndexServlet extends HttpServlet {
    private GeoStatService geoStatService;
    @Override
    public void init(ServletConfig servletConfig) throws ServletException {
        super.init(servletConfig);
        ApplicationContext applicationContext = WebApplicationContextUtils.getWebApplicationContext(servletConfig.getServletContext());
        geoStatService = applicationContext.getBean(GeoStatService.class);
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setAttribute("indexTabStyle", "active");

*//*        JSONObject jsonObject = new JSONObject();
        jsonObject.put("HK", 100);
        jsonObject.put("PT", 3500);
        jsonObject.put("HN", 0);
        jsonObject.put("PY", 17);
        jsonObject.put("HR", 566);
        jsonObject.put("HT", 2);
        jsonObject.put("YE", 2);
        jsonObject.put("HU", 11178676);
        jsonObject.put("RU", 262648802);
        request.setAttribute("malwareMap", jsonObject);*//*
        System.out.println("Finish storing json");
        request.getRequestDispatcher(INDEX_PAGE).forward(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse) throws ServletException, IOException {
        doGet(httpServletRequest, httpServletResponse);
    }

    public GeoStatService getGeoStatService() {
        return geoStatService;
    }

}*/
