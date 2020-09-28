/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servlets;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author 759005
 */
public class ArithmeticCalculatorServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
            request.setAttribute("result", "Result:---");
        getServletContext().getRequestDispatcher("/WEB-INF/arithmeticCalculator.jsp").forward(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        try {
            int first = Integer.parseInt(request.getParameter("first"));
            int second = Integer.parseInt(request.getParameter("second"));
            String operator = request.getParameter("operator");

            request.setAttribute("first", first);
            request.setAttribute("second", second);
            switch (operator) {
                case "+":
                    request.setAttribute("result", "Result: " + (first + second));
                    break;
                case "-":
                    request.setAttribute("result", "Result: " + (first - second));
                    break;
                case "*":
                    request.setAttribute("result", "Result: " + (first * second));
                    break;
                case "%":
                    request.setAttribute("result", "Result: " + (first % second));
                    break;
            }

            getServletContext().getRequestDispatcher("/WEB-INF/arithmeticCalculator.jsp").forward(request, response);
        } catch (NumberFormatException e) {
            request.setAttribute("result", "Result: Invalid");
            getServletContext().getRequestDispatcher("/WEB-INF/arithmeticCalculator.jsp").forward(request, response);
        }

    }

}
