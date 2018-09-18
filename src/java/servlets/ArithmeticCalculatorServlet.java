/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servlets;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author 747787
 */
@WebServlet(name = "ArithmeticCalculatorServlet", urlPatterns = {"/ArithmeticCalculatorServlet"})
public class ArithmeticCalculatorServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        request.setAttribute("product", "---");
        getServletContext().getRequestDispatcher("/WEB-INF/arithmeticcalculator.jsp").forward(request,response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String numOneStr = request.getParameter("numOne");
        String numTwoStr = request.getParameter("numTwo");
       int numOne = 0;
       int numTwo = 0;
       int product = 0;
        try{
        
        if(numOneStr == null || numOneStr.equals("") || numTwoStr == null || numTwoStr.equals("")){
          request.setAttribute("product", "invalid");
            getServletContext().getRequestDispatcher("/WEB-INF/arithmeticcalculator.jsp").forward(request,response);
            return;
        }
        numOne = Integer.parseInt(numOneStr);
        numTwo = Integer.parseInt(numTwoStr);
        }catch(NumberFormatException e){
                      request.setAttribute("product", "invalid");
            getServletContext().getRequestDispatcher("/WEB-INF/arithmeticcalculator.jsp").forward(request,response);
            return;
        }
        if(request.getParameter("operation").equals("+")){

           product = numOne+numTwo; 
        }
        if(request.getParameter("operation").equals("-")){
           product = numOne-numTwo; 
        }
        if(request.getParameter("operation").equals("*")){
           product = numOne*numTwo; 
        }
        if(request.getParameter("operation").equals("%")){
           product = numOne%numTwo; 
        }
         
         
        
       request.setAttribute("numOne",numOne );
       request.setAttribute("numTwo",numTwo );
        request.setAttribute("product", product);
                getServletContext().getRequestDispatcher("/WEB-INF/arithmeticcalculator.jsp").forward(request,response);

    }


} 
