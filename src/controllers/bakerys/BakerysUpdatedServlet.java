package controllers.bakerys;

import java.io.IOException;
import java.sql.Timestamp;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import models.Bakery;
import utils.DBDAOShow;

/**
 * Servlet implementation class BakerysUpdatedServlet
 */
@WebServlet("/bakerys/update")
public class BakerysUpdatedServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;

    /**
     * @see HttpServlet#HttpServlet()
     */
    public BakerysUpdatedServlet() {
        super();

    }

    /**
     * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
     */
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        int s = Integer.parseInt(request.getParameter("id"));
        Bakery pan = DBDAOShow.getBakery(s);

        Timestamp currentTime = new Timestamp(System.currentTimeMillis());
        pan.setUpdated_at(currentTime);




        request.getSession().removeAttribute("id");
    }

}
