/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author shahm
 */
public class myservlet3 extends HttpServlet {
@Override
public void doPost(HttpServletRequest request,HttpServletResponse response)
throws ServletException, IOException
 {
response.setContentType("text/html");
PrintWriter out = response.getWriter();
String user=request.getParameter("user");
out.println("<h2> Welcome "+user+"</h2>");
 }
@Override
public void doGet(HttpServletRequest request,HttpServletResponse response)
throws ServletException, IOException
{
response.setContentType("text/html");
PrintWriter out = response.getWriter();
String user=request.getParameter("user");
out.println("<h2> Hello "+user+"</h2>");
}
}
