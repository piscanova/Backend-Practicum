package io.github.benas.todolist.web.servlet.usecase;

import io.github.benas.todolist.web.servlet.BaseUseCaseServlet;
import org.json.JSONObject;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Created by Paranjay on 7/26/2016.
 */
@WebServlet(name = "FileTypeUseCaseServlet", urlPatterns = {"/filetype"})
public class FileTypeUseCase extends BaseUseCaseServlet {
    @Override

    protected String performDoGet(HttpServletRequest request, HttpServletResponse response) {
        System.out.println("Enter file type serlvet");
        JSONObject jsonObject = getFileTypeService().getAllFiletypeCounts();
        // add .json to parse as string
        String res = jsonObject.toString() + ".json";
        return res;
    }


}
