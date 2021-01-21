import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "PizzaOrderServlet", urlPatterns = "/pizza-order")
public class PizzaOrderServlet extends HttpServlet {
    protected void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {


        req.getRequestDispatcher("pizza-order.jsp").forward(req, res);

    }
    protected void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {

    String size = req.getParameter("size");
    String crust = req.getParameter("crust");
    String sauce = req.getParameter("sauce");
    String address = req.getParameter("address");
    String topping = req.getParameter("topping");


    System.out.println("Pizza Size: " + size);
    System.out.println("Pizza Crust: " + crust);
    System.out.println("Pizza Sauce: " + sauce);
    System.out.println("Pizza topping: " + topping);
    System.out.println("Delivering to: " + address);
    System.out.println();
    System.out.println();



    req.getRequestDispatcher("pizza-order.jsp").forward(req,res);

    }


}
