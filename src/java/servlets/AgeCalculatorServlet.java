package servlets;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author 747787
 */
public class AgeCalculatorServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        getServletContext().getRequestDispatcher("/WEB-INF/agecalculator.jsp").forward(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String ageStr = request.getParameter("age");
        int age = 0;
//         int age = Integer.parseInt(ageStr);
        try {

            if (ageStr == null || ageStr.equals("")) {
                request.setAttribute("message", "You must give your current age");
                getServletContext().getRequestDispatcher("/WEB-INF/agecalculator.jsp").forward(request, response);
                return;
            }
            age = Integer.parseInt(ageStr);
        } catch (NumberFormatException e) {
            request.setAttribute("message", "You must give your current age");
            getServletContext().getRequestDispatcher("/WEB-INF/agecalculator.jsp").forward(request, response);
            return;
        }

        int newAge = age + 1;
        request.setAttribute("age", newAge);
        getServletContext().getRequestDispatcher("/WEB-INF/age.jsp").forward(request, response);

    }

}
