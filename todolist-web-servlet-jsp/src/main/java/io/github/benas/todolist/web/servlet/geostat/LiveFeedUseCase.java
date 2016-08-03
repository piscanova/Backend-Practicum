package io.github.benas.todolist.web.servlet.geostat;

import io.github.benas.todolist.web.servlet.BaseUseCaseServlet;
import io.github.benas.todolist.web.util.Views;
import org.json.JSONArray;
import org.json.JSONObject;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Created by Paranjay on 8/2/2016.
 */
@WebServlet(name = "LiveFeedUseCaseServlet", urlPatterns = {"/liveFeed"})
public class LiveFeedUseCase extends BaseUseCaseServlet {
    @Override
    protected String performDoGet(HttpServletRequest request, HttpServletResponse response) {
        JSONArray jsonArray = getLiveFeedService().getAllLiveFeed();
        // add .json to parse as string
        request.setAttribute("feed", jsonArray);
        return Views.FEED_PAGE;
    }

}
