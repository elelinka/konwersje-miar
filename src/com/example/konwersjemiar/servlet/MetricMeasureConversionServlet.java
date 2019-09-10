package com.example.konwersjemiar.servlet;

import com.example.konwersjemiar.service.MetricMeasureConversionService;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.math.BigDecimal;

@WebServlet("/metric-converter")
public class MetricMeasureConversionServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        MetricMeasureConversionService service = new MetricMeasureConversionService();

        request.setCharacterEncoding("UTF-8");
        String meter = request.getParameter("meterValue");
        String centimeter = request.getParameter("centimeterValue");
        String millimeter = request.getParameter("millimeterValue");

        response.setCharacterEncoding("UTF-8");
        response.setContentType("text/html");
        PrintWriter writer = response.getWriter();

        if (isMeter(meter, centimeter, millimeter)) {
            BigDecimal meterValue = BigDecimal.valueOf(Double.parseDouble(meter));
            writer.println("<h2>Podana wartość w przeliczeniu na:<h2>");
            writer.println("Metry: " + meterValue.toPlainString() + "<br>");
            writer.println("Centrymetry: " + service.convertMetersToCentimeters(meterValue).toPlainString() + "<br>");
            writer.println("Milimetry: " + service.convertMetersToMillimeters(meterValue).toPlainString() + "<br>");
        } else if (isCentimeter(meter, centimeter, millimeter)) {
            BigDecimal centimeterValue = BigDecimal.valueOf(Double.parseDouble(centimeter));
            writer.println("<h2>Podana wartość w przeliczeniu na:<h2>");
            writer.println("Metry: " + service.convertCentimetersToMeters(centimeterValue).toPlainString() + "<br>");
            writer.println("Centrymetry: " + centimeterValue.toPlainString() + "<br>");
            writer.println("Milimetry: " + service.convertCentimetersToMillimeters(centimeterValue).toPlainString() + "<br>");
        } else if (isMillimeter(meter, centimeter, millimeter)) {
            BigDecimal millimeterValue = BigDecimal.valueOf(Double.parseDouble(millimeter));
            writer.println("<h2>Podana wartość w przeliczeniu na:<h2>");
            writer.println("Metry: " + service.convertMillimetersToMeters(millimeterValue).toPlainString() + "<br>");
            writer.println("Centrymetry: " + service.convertMillimetersToCentimeters(millimeterValue).toPlainString() + "<br>");
            writer.println("Milimetry: " + millimeterValue.toPlainString() + "<br>");
        } else {
            writer.println("<h2>Uzupełnij tylko jedno pole!</h2>");
        }
    }

    private boolean isMeter(String meter, String centimeter, String millimeter) {
        return !(meter.isEmpty()) && centimeter.isEmpty() && millimeter.isEmpty();
    }

    private boolean isCentimeter(String meter, String centimeter, String millimeter) {
        return !(centimeter.isEmpty()) && meter.isEmpty() && millimeter.isEmpty();
    }

    private boolean isMillimeter(String meter, String centimeter, String millimeter) {
        return !(millimeter.isEmpty()) && meter.isEmpty() && centimeter.isEmpty();
    }
}
