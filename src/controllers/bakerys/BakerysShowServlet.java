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
 * Servlet implementation class BakerysShowServlet
 */
@WebServlet("/bakerys/show")
public class BakerysShowServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;

    /**
     * @see HttpServlet#HttpServlet()
     */
    public BakerysShowServlet() {
        super();
    }

    /**
     * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
     */
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

      //DAOクラスから呼び出し、listに入れる

        int s = Integer.parseInt(request.getParameter("id"));

        Bakery list = DBDAOShow.getBakery(s);

        //ビューにlistを変数panに入れて渡す
        request.setAttribute("pan", list);

        RequestDispatcher rd = request.getRequestDispatcher("/WEB-INF/views/bakerys/show.jsp");
        rd.forward(request, response);
    }

}
