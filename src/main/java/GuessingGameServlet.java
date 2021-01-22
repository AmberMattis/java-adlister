import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "GuessingGameServlet", urlPatterns = "/guess")
public class GuessingGameServlet extends HttpServlet {
    protected void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
    req.getRequestDispatcher("guess.jsp").forward(req,res);
    }

    protected void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
    int userNumber = Integer.parseInt(req.getParameter("number"));
    int randomNum = (int)(Math.random()*3) + 1;

    if(userNumber == randomNum){
        res.sendRedirect("/correct");
    }else{
        res.sendRedirect("/incorrect");
    }

    System.out.println(randomNum);

    }

}


