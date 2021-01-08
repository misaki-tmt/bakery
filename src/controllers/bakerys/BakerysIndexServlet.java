package controllers.bakerys;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import models.Bakery;
import utils.DBDAO;

/**
 * Servlet implementation class BakerysIndexServlet
 */
@WebServlet("/bakery/index")
public class BakerysIndexServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;

    /**
     * @see HttpServlet#HttpServlet()
     */
    public BakerysIndexServlet() {
        super();

    }

    /**
     * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
     */
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

      //DAOクラスから呼び出し、listに入れる
        String s = "select * from bakerys";
        List<Bakery> list = DBDAO.getBakery(s);

        //ビューにlistを変数panに入れて渡す
        request.setAttribute("pan", list);

        System.out.println(list.get(0).getName());
        RequestDispatcher rd = request.getRequestDispatcher("/WEB-INF/views/bakerys/index.jsp");
        rd.forward(request, response);

    }
    }
