package servlets;

import beans.AlmacenPalabras;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class ServletComprobar extends HttpServlet {

  protected void processRequest(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    response.setContentType("text/html;charset=UTF-8");
    HttpSession session = request.getSession(true);
    try (PrintWriter out = response.getWriter()) {
      if ((boolean) session.getAttribute("ganado") || (boolean) session.getAttribute("perdido")) {
        session.setAttribute("ganado", false);
        session.setAttribute("perdido", false);
      }
      if (request.getParameter("pos") != null) {
        if ((Integer) session.getAttribute("vidas") > 0) {
          int vidas = (Integer) session.getAttribute("vidas");
          ArrayList<Integer> posiciones = (ArrayList<Integer>) session.getAttribute("posiciones");
          posiciones.add(Integer.parseInt(request.getParameter("pos")));
          vidas--;
          session.setAttribute("vidas", vidas);
          session.setAttribute("posiciones", posiciones);
        } else {
          session.setAttribute("perdido", true);
        }
      }
      if (request.getParameter("comprobar") != null) {
        if ((Integer) session.getAttribute("vidas") > 0) {
          if (request.getParameter("palabra").equalsIgnoreCase((String) session.getAttribute("palabraRandom"))) {
            session.setAttribute("ganado", true);
          } else {
            int vidas = (Integer) session.getAttribute("vidas");
            vidas--;
            session.setAttribute("vidas", vidas);
          }
        } else {
          session.setAttribute("perdido", true);
        }
      }
      if ((boolean) session.getAttribute("ganado") || (boolean) session.getAttribute("perdido")) {
        String palabraRandom = new AlmacenPalabras().palabraRandom();
        char palabraSeparada[] = new char[palabraRandom.length()];
        ArrayList<Integer> posiciones = new ArrayList<Integer>();
        int vidas = palabraRandom.length() / 2;
        session.setAttribute("vidas", vidas);
        session.setAttribute("palabraRandom", palabraRandom);
        session.setAttribute("palabraSeparada", palabraSeparada);
        session.setAttribute("posiciones", posiciones);
      }
      for (int i = 0; i < ((String) session.getAttribute("palabraRandom")).length(); i++) {
        ((char[]) session.getAttribute("palabraSeparada"))[i] = ((String) session.getAttribute("palabraRandom")).charAt(i);
      }
      response.sendRedirect(request.getContextPath() + "/ServletJuego");
    }
  }

  @Override
  protected void doGet(HttpServletRequest request,HttpServletResponse response) throws ServletException, IOException {
    processRequest(request, response);
  }

  @Override
  protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    processRequest(request, response);
  }

  @Override
  public String getServletInfo() {
    return "Servlet Comprobar palabra";
  }
}
