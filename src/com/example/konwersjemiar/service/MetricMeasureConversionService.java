package com.example.konwersjemiar.service;

public class MetricMeasureConversionService {
    public double convertMetersToCentimeters(double mValue) {
        double cmValue = mValue * 100;
        return cmValue;
    }
    public double convertMetersToMillimeters(double mValue) {
        double mmValue = mValue * 1000;
        return mmValue;
    }

    public double convertCentimetersToMeters(double cmValue) {
        double mValue = cmValue / 100;
        return mValue;
    }

    public double convertCentimetersToMillimeters(double cmValue) {
        double mmValue = cmValue * 100;
        return mmValue;
    }
}
