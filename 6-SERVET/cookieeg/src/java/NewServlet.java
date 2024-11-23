import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
public class NewServlet extends HttpServlet {
    @Override
    public void doPost(HttpServletRequest request, HttpServletResponse response) throws
    ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>AK</title>");
            out.println("</head>");
            out.println("<body>");
            String n = request.getParameter("uid");
            String v = request.getParameter("pv");
            Cookie c = new Cookie(n,v);
            response.addCookie(c);
            out.println("cookies added");
            c.setMaxAge(60 * 90);
            out.println("max age of cookies" + c.getMaxAge());
            Cookie c1[] = request.getCookies();
            for (int i = 0; i <= c1.length; i++) {
                out.println("name=" + c1[i].getName());
                out.println("value=" + c1[i].getValue());
            }
            out.println("</body>");
            out.println("</html>");
        }
    }
}