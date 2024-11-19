import java.io.*;
import javax.servlet.*;
public class NewServlet implements Servlet {
    ServletConfig config = null;
    public void init(ServletConfig config) {
        this.config = config;
        System.out.println("servlet is initialized");
    }
    //initializes the servlet. It is the life cycle method of servlet and invoked by the web container only once.
    public void service(ServletRequest req, ServletResponse res) throws IOException, ServletException {
        res.setContentType("text/html");
        PrintWriter out = res.getWriter();
        out.print("<html><body>");
        out.print("<b>hello simple servlet</b>");
        out.print("</body></html>");
    }
    //provides response for the incoming request. It is invoked at each request by the web container. 
    public void destroy() {
        System.out.println("servlet is destroyed");   
    }
    //is invoked only once and indicates that servlet is being destroyed. 
    public ServletConfig getServletConfig() {
        return config;
    }
    //returns the object of ServletConfig.
    public String getServletInfo() {
        return "copyright 2007-1016";
    }
    //returns information about servlet such as writer, copyright, version etc. 
}


// Run on web browser
//http://localhost:8080/Servletcongigeg/NewServlet