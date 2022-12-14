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

public class ServletJuego extends HttpServlet {

  protected void processRequest(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    response.setContentType("text/html;charset=UTF-8");
    try (PrintWriter out = response.getWriter()) {
      HttpSession session = request.getSession(true);
      if (session.getAttribute("vidas") != null && session.getAttribute("palabraRandom") != null && session.getAttribute("palabraSeparada") != null && session.getAttribute("posiciones") != null && session.getAttribute("ganado") != null && session.getAttribute("perdido") != null ) {
        int vidas = (Integer) session.getAttribute("vidas");
        String palabraRandom = (String) session.getAttribute("palabraRandom");
        char palabraSeparada[] = (char[]) session.getAttribute("palabraSeparada");
        ArrayList<Integer> posiciones = (ArrayList<Integer>) session.getAttribute("posiciones");
        boolean ganado = (boolean) session.getAttribute("ganado");
        boolean perdido = (boolean) session.getAttribute("perdido");
        session.setAttribute("vidas", vidas);
        session.setAttribute("palabraRandom", palabraRandom);
        session.setAttribute("palabraSeparada", palabraSeparada);
        session.setAttribute("posiciones", posiciones);
        session.setAttribute("ganado", ganado);
        session.setAttribute("perdido", perdido);
      } else {
        String palabraRandom = new AlmacenPalabras().palabraRandom();
        char palabraSeparada[] = new char[palabraRandom.length()];
        ArrayList<Integer> posiciones = new ArrayList<Integer>();
        int vidas = palabraRandom.length() / 2;
        boolean ganado = false;
        boolean perdido = false;
        session.setAttribute("vidas", vidas);
        session.setAttribute("palabraRandom", palabraRandom);
        session.setAttribute("palabraSeparada", palabraSeparada);
        session.setAttribute("posiciones", posiciones);
        session.setAttribute("ganado", ganado);
        session.setAttribute("perdido", perdido);
      }
      out.println("<!DOCTYPE html>");
      out.println("<html>");
      out.println("<head>");
      out.println("<title>Servlet ServletJuego</title>");
      out.println("</head>");
      out.println("<body>");
      if (session.getAttribute("ganado") != null && (boolean) session.getAttribute("ganado")) {
        out.println("<p>Has ganado</p>");
      }
      if (session.getAttribute("perdido") != null && (boolean) session.getAttribute("perdido")) {
        out.println("<p>Has perdido! La palabra era " + (String) session.getAttribute("palabraRandom") + "</p>");
      }
      out.println("<table style='border-collapse: collapse'><tr>");
      for (int i = 0; i < ((String) session.getAttribute("palabraRandom")).length(); i++) {
        if (((ArrayList<Integer>) session.getAttribute("posiciones")).contains(i)) {
          out.println("<td style='width:30px;border:solid 1px; text-align:center'>" + ((char[]) session.getAttribute("palabraSeparada"))[i] + "</td>");
        } else {
          out.println("<td style='width:30px;border:solid 1px; text-align:center'><a href='" + request.getContextPath() + "/ServletComprobar?pos=" + i + "'>Ver</a></td>");
        }
      }
      out.println("</tr></table>");
      out.println("<ul>");
      out.println("<li>" + (Integer) session.getAttribute("vidas") + " vidas restantes</li>");
      out.println("<form method='POST' action='" + request.getContextPath() + "/ServletComprobar'>");
      out.println("<li> Tu respuesta <input style='width:100px' type='text' name='palabra'> <input type='submit' name='comprobar' value='Comprobar'></li>");
      out.println("</form>");
      out.println("</ul>");
      out.println("</body>");
      out.println("</html>");
    }
  }

  @Override
  protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    processRequest(request, response);
  }

  @Override
  protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    processRequest(request, response);
  }

  @Override
  public String getServletInfo() {
    return "Servlet Juego";
  }
}
