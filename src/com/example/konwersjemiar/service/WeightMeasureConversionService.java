package com.example.konwersjemiar.service;

import java.math.BigDecimal;

public class WeightMeasureConversionService {
    public BigDecimal convertKilogramsToGrams(BigDecimal kgValue) {
        BigDecimal gmValue = kgValue.multiply(BigDecimal.valueOf(1000));
        return gmValue;
    }

    public BigDecimal convertKilogramsToMilligrams(BigDecimal kgValue) {
        BigDecimal mgValue = kgValue.multiply(BigDecimal.valueOf(1000000));
        return mgValue;
    }

    public BigDecimal convertGramsToKilograms(BigDecimal gmValue) {
        BigDecimal kgValue = gmValue.divide(BigDecimal.valueOf(1000));
        return kgValue;
    }

    public BigDecimal convertGramsToMilligrams(BigDecimal gmValue) {
        BigDecimal mgValue = gmValue.multiply(BigDecimal.valueOf(1000));
        return mgValue;
    }

    public BigDecimal convertMilligramsToGrams(BigDecimal mgValue) {
        BigDecimal gmValue = mgValue.divide(BigDecimal.valueOf(1000));
        return gmValue;
    }

    public BigDecimal convertMilligramsToKilograms(BigDecimal mgValue) {
        BigDecimal kgValue = mgValue.divide(BigDecimal.valueOf(1000000));
        return kgValue;
    }
}
