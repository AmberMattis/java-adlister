import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "PageCounterServlet", urlPatterns = "/pagecount")
public class PageCounterServlet extends HttpServlet {

    private int pageCount;

    private void resetCount(){
        pageCount = 0;
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        resp.setContentType("text/html");
        PrintWriter out = resp.getWriter();


        String reset = req.getParameter("reset");

        if(reset != null){
            resetCount();
        }
        pageCount++;

        out.println("<h1> This page has " + pageCount + " hits!</h1>");
        }

    }
