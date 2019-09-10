package com.example.konwersjemiar.servlet;

import com.example.konwersjemiar.service.WeightMeasureConversionService;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.math.BigDecimal;

@WebServlet("/weight-converter")
public class WeightMeasureConversionServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        WeightMeasureConversionService service = new WeightMeasureConversionService();

        request.setCharacterEncoding("UTF-8");
        String kilogram = request.getParameter("kilogramValue");
        String gram = request.getParameter("gramValue");
        String milligram = request.getParameter("milligramValue");

        response.setCharacterEncoding("UTF-8");
        response.setContentType("text/html");
        PrintWriter writer = response.getWriter();

        if (!(kilogram.isEmpty()) && gram.isEmpty() && milligram.isEmpty()) {
            BigDecimal kilogramValue = BigDecimal.valueOf(Double.parseDouble(kilogram));
            writer.println("<h2>Podana wartość w przeliczeniu na:<h2>");
            writer.println("Kilogramy: " + kilogramValue.toPlainString() + "<br>");
            writer.println("Gramy: " + service.convertKilogramsToGrams(kilogramValue).toPlainString() + "<br>");
            writer.println("Miligramy: " + service.convertKilogramsToMilligrams(kilogramValue).toPlainString() + "<br>");
        } else if (!(gram.isEmpty()) && kilogram.isEmpty() && milligram.isEmpty()) {
            BigDecimal gramValue = BigDecimal.valueOf(Double.parseDouble(gram));
            writer.println("<h2>Podana wartość w przeliczeniu na:<h2>");
            writer.println("Kilogramy: " + service.convertGramsToKilograms(gramValue).toPlainString() + "<br>");
            writer.println("Gramy: " + gramValue.toPlainString() + "<br>");
            writer.println("Miligramy: " + service.convertGramsToMilligrams(gramValue).toPlainString() + "<br>");
        } else if (!(milligram.isEmpty()) && kilogram.isEmpty() && gram.isEmpty()) {
            BigDecimal milligramValue = BigDecimal.valueOf(Double.parseDouble(milligram));
            writer.println("<h2>Podana wartość w przeliczeniu na:<h2>");
            writer.println("Kilogramy: " + service.convertMilligramsToKilograms(milligramValue).toPlainString() + "<br>");
            writer.println("Gramy: " + service.convertMilligramsToGrams(milligramValue).toPlainString() + "<br>");
            writer.println("Miligramy: " + milligramValue.toPlainString() + "<br>");
        } else {
            writer.println("<h2>Uzupełnij tylko jedno pole!</h2>");
        }
    }
}
