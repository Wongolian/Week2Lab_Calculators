/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servlets;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Steven
 */
public class ArithmeticCalculatorServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
//        processRequest(request, response);
        getServletContext().getRequestDispatcher("/WEB-INF/arithmeticcalculator.jsp").forward(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
//        processRequest(request, response);

        String fvalue = request.getParameter("first");
        String lvalue = request.getParameter("last");
        String action = request.getParameter("action");

        if (fvalue.equals("") && lvalue.equals("")) {
            request.setAttribute("answer", "Result: ---");
            getServletContext().getRequestDispatcher("/WEB-INF/arithmeticcalculator.jsp").forward(request, response);
            return;

        } else if (fvalue.equals("") || lvalue.equals("")) {
            request.setAttribute("fvalue", fvalue);
            request.setAttribute("lvalue", lvalue);
            request.setAttribute("answer", "Result: invalid");
            getServletContext().getRequestDispatcher("/WEB-INF/arithmeticcalculator.jsp").forward(request, response);
            return;
        }

        double num1 = Double.parseDouble(fvalue);
        double num2 = Double.parseDouble(lvalue);
        double num3;

        switch (action) {
            case "add":
                num3 = num1 + num2;
                request.setAttribute("fvalue", fvalue);
                request.setAttribute("lvalue", lvalue);
                request.setAttribute("answer", "Result: " + num3);
                break;
            case "sub":
                num3 = num1 - num2;
                request.setAttribute("fvalue", fvalue);
                request.setAttribute("lvalue", lvalue);
                request.setAttribute("answer", "Result: " + num3);
                break;
            case "multi":
                num3 = num1 * num2;
                request.setAttribute("fvalue", fvalue);
                request.setAttribute("lvalue", lvalue);
                request.setAttribute("answer", "Result: " + num3);
                break;
            case "modu":
                num3 = num1 % num2;
                request.setAttribute("fvalue", fvalue);
                request.setAttribute("lvalue", lvalue);
                request.setAttribute("answer", "Result: " + num3);
                break;
            default:
                break;

        }

        getServletContext().getRequestDispatcher("/WEB-INF/arithmeticcalculator.jsp").forward(request, response);

    }

}
