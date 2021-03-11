package controllers.bakerys;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import utils.DBDAODestroy;

/**
 * Servlet implementation class BakerysDestroyServlet
 */

@WebServlet("/destroy")
public class BakerysDestroyServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;

    /**
     * @see HttpServlet#HttpServlet()
     */
    public BakerysDestroyServlet() {
        super();

    }

    /**
     * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
     */
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

      int s = (int)request.getSession().getAttribute("id");
      DBDAODestroy.getBakery(s);

      request.getSession().removeAttribute("id");
      response.sendRedirect(request.getContextPath() + "/bakerys/index");

    }

}
