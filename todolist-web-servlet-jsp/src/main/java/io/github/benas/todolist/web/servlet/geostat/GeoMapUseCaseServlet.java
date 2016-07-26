package io.github.benas.todolist.web.servlet.geostat;

import io.github.benas.todolist.web.servlet.BaseUseCaseServlet;
import org.json.JSONObject;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Created by thanksgiving on 7/25/16.
 */
@WebServlet(name = "GeoMapUseCaseServlet", urlPatterns = {"/map"})
public class GeoMapUseCaseServlet extends BaseUseCaseServlet {
    @Override
    protected String performDoGet(HttpServletRequest request, HttpServletResponse response) {
        System.out.println("Enter map serlvet");
        JSONObject jsonObject = getGeoStatService().getAllCountriesCounts();
        // add .json to parse as string
        String res = jsonObject.toString() + ".json";
        return res;
    }
}
