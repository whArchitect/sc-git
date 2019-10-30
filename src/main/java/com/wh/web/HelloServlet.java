package com.wh.web;


import javax.servlet.annotation.WebServlet;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * @author wh
 * @data 2019/10/29 9:11
 * @description
 */
@WebServlet(urlPatterns = ("/helloS"))
public class HelloServlet extends javax.servlet.http.HttpServlet {
    @Override
    protected void doPost(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response) throws javax.servlet.ServletException, IOException {
        doGet(request, response);
    }

    @Override
    protected void doGet(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response) throws javax.servlet.ServletException, IOException {
        //设置请求和响应的编码
        request.setCharacterEncoding("utf-8");
        response.setContentType("text/html;charset=utf-8");
        String[] fruit = request.getParameterValues("fruit");
        StringBuilder stringBuilder = new StringBuilder();
        for (String s : fruit) {
            System.out.print(s + "\t");
            stringBuilder.append(s + "\t");
        }
        PrintWriter printWriter = response.getWriter();
        printWriter.print(stringBuilder.toString());
    }
}
