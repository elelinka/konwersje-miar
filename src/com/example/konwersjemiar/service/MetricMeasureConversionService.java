package com.example.konwersjemiar.service;

import java.math.BigDecimal;

public class MetricMeasureConversionService {
    public BigDecimal convertMetersToCentimeters(BigDecimal mValue) {
        return mValue.multiply(BigDecimal.valueOf(100));
    }

    public BigDecimal convertMetersToMillimeters(BigDecimal mValue) {
        return mValue.multiply(BigDecimal.valueOf(1000));
    }

    public BigDecimal convertCentimetersToMeters(BigDecimal cmValue) {
        return cmValue.divide(BigDecimal.valueOf(100));
    }

    public BigDecimal convertCentimetersToMillimeters(BigDecimal cmValue) {
        return cmValue.multiply(BigDecimal.valueOf(10));
    }

    public BigDecimal convertMillimetersToCentimeters(BigDecimal mmValue) {
        return mmValue.divide(BigDecimal.valueOf(10));
    }

    public BigDecimal convertMillimetersToMeters(BigDecimal mmValue) {
        return mmValue.divide(BigDecimal.valueOf(1000));
    }
}
