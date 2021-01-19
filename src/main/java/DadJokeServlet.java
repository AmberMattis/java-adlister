import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "DadJokeServlet", urlPatterns = "/dadjoke")
public class DadJokeServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        //returning html text
        resp.setContentType("text/html");

        //get print write
        PrintWriter out = resp.getWriter();

        //Check if any value was passed as a paramenter
            //create a string

        //http://localhost:8080/dadjoke?joke=thirsty
        //line 23 is capturing thirsty
        String joke = req.getParameter("joke");

        //setting a defualt value equal to joke
        if(joke == null ){
            joke = "Hungry";
        }

        //prints to html the parament
        out.println("<h1>Hi " + joke + " I'm Dad!</h1>");
    }
}
