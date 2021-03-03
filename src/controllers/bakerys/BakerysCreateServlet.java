package controllers.bakerys;

import java.io.IOException;
import java.sql.Timestamp;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import models.Bakery;
import utils.DBDAOPOST;
/**
 * Servlet implementation class BakerysCreateServlet
 */
@WebServlet("/bakerys/create")
public class BakerysCreateServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;

    /**
     * @see HttpServlet#HttpServlet()
     */
    public BakerysCreateServlet() {
        super();

    }

    /**
     * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
     */
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        String s = "insert into bakerys (name, address, time, holiday, tel, hpadd, map, memo) values (?,?,?,?,?,?,?,?)";

        Bakery pan = new Bakery();

        pan.setName(request.getParameter("name"));
        pan.setAddress(request.getParameter("address"));
        pan.setTime(request.getParameter("time"));
        pan.setHoliday(request.getParameter("holiday"));
        pan.setTel(request.getParameter("tel"));
        pan.setHpadd(request.getParameter("hpadd"));
        pan.setMap(request.getParameter("map"));
        pan.setMemo(request.getParameter("memo"));

        Timestamp currentTime = new Timestamp(System.currentTimeMillis());
        pan.setCreated_at(currentTime);
        pan.setUpdated_at(currentTime);

        DBDAOPOST.getBakery(s, pan);

        response.sendRedirect(request.getContextPath() + "/bakerys/index");
    }

}
