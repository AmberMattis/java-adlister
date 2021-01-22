import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "CorrectGuessServlet", urlPatterns = "/correct")
public class CorrectGuessServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String message = "Correct Guess =D";
        req.setAttribute("message", message);

        req.getRequestDispatcher("result.jsp").forward(req,resp);
    }
}
