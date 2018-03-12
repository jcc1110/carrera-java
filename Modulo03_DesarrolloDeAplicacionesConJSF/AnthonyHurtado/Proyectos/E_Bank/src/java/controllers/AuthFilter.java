package controllers;
import java.io.IOException;
import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebFilter(filterName = "AuthFilter", urlPatterns = {"/*"})
public class AuthFilter implements Filter {
    @Override
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
        try {
            HttpServletRequest reqt = (HttpServletRequest) request;
            HttpServletResponse resp = (HttpServletResponse) response;
            HttpSession ses = reqt.getSession(false);
            String reqURI = reqt.getRequestURI();
            
            // reqURI.indexOf("/index.xhtml") >= 0 || 
                    //(ses != null && ses.getAttribute("usuario") != null) || 
                    //reqURI.indexOf("/public/") >= 0 || 
                    //reqURI.contains("javax.faces.resource")
            
            if (
                    reqURI.contains("javax.faces.resource") || 
                    reqURI.contains("/public/") ||
                    (ses != null && ses.getAttribute("usuario") != null) ||
                    reqURI.contains("/faces/views/online/dashboard.xhtml")
             ) {
                chain.doFilter(request, response);
            } else {
                resp.sendRedirect(reqt.getContextPath() + "/faces/views/public/login.xhtml");
            }
        } catch (IOException | ServletException e) {
            System.out.println(e.getMessage());
        }
    }

    @Override
    public void destroy() { }

    @Override
    public void init(FilterConfig filterConfig) { }
}
