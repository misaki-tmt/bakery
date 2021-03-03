package controllers.bakerys;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import models.Bakery;

/**
 * Servlet implementation class BakerysNewServlet
 */
@WebServlet("/bakery/new")
public class BakerysNewServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;

    /**
     * @see HttpServlet#HttpServlet()
     */
    public BakerysNewServlet() {
        super();

    }

    /**
     * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
     */
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        //変数panに入れて渡す
        request.setAttribute("bakery", new Bakery());

        RequestDispatcher rd = request.getRequestDispatcher("/WEB-INF/views/bakerys/new.jsp");
        rd.forward(request, response);
    }

}
