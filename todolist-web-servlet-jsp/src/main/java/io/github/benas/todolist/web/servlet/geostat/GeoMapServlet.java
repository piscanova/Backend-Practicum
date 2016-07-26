package io.github.benas.todolist.web.servlet.geostat;

import io.github.todolist.core.service.api.GeoStatService;
import org.json.JSONObject;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Created by thanksgiving on 7/25/16.
 */
@WebServlet(name = "GeoMapServlet", urlPatterns = {"/map"})
public class GeoMapServlet extends HttpServlet {
    private GeoStatService geoStatService;
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        System.out.println("Enter map serlvet");
        JSONObject jsonObject = geoStatService.getAllCountriesCounts();
        response.setContentType("application/json");
        response.getWriter().write(jsonObject.toString());
    }

    @Override
    protected void doPost(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse) throws ServletException, IOException {
        doGet(httpServletRequest, httpServletResponse);
    }
}
