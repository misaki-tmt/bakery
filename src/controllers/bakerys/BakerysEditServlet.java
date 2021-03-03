package controllers.bakerys;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import models.Bakery;
import utils.DBDAOShow;

/**
 * Servlet implementation class BakerysEditServlet
 */
@WebServlet("/bakerys/edit")
public class BakerysEditServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;

    /**
     * @see HttpServlet#HttpServlet()
     */
    public BakerysEditServlet() {
        super();

    }

    /**
     * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
     */
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        System.out.println(request.getParameter("id"));
        int s = Integer.parseInt(request.getParameter("id"));

        Bakery pan = DBDAOShow.getBakery(s);

        request.getSession().setAttribute("bakery", pan);

        RequestDispatcher rd = request.getRequestDispatcher("/WEB-INF/views/bakerys/edit.jsp");
        rd.forward(request,response);

    }

}
