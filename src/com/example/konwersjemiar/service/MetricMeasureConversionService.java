package com.example.konwersjemiar.service;

import java.math.BigDecimal;

public class MetricMeasureConversionService {
    public BigDecimal convertMetersToCentimeters(BigDecimal mValue) {
        BigDecimal cmValue = mValue.multiply(BigDecimal.valueOf(100));
        return cmValue;
    }

    public BigDecimal convertMetersToMillimeters(BigDecimal mValue) {
        BigDecimal mmValue = mValue.multiply(BigDecimal.valueOf(1000));
        return mmValue;
    }

    public BigDecimal convertCentimetersToMeters(BigDecimal cmValue) {
        BigDecimal mValue = cmValue.divide(BigDecimal.valueOf(100));
        return mValue;
    }

    public BigDecimal convertCentimetersToMillimeters(BigDecimal cmValue) {
        BigDecimal mmValue = cmValue.multiply(BigDecimal.valueOf(10));
        return mmValue;
    }

    public BigDecimal convertMillimetersToCentimeters(BigDecimal mmValue) {
        BigDecimal cmValue = mmValue.divide(BigDecimal.valueOf(10));
        return cmValue;
    }

    public BigDecimal convertMillimetersToMeters(BigDecimal mmValue) {
        BigDecimal mValue = mmValue.divide(BigDecimal.valueOf(1000));
        return mValue;
    }
}
