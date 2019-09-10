package com.example.konwersjemiar.service;

import java.math.BigDecimal;

public class WeightMeasureConversionService {
    public BigDecimal convertKilogramsToGrams(BigDecimal kgValue) {
        return kgValue.multiply(BigDecimal.valueOf(1000));
    }

    public BigDecimal convertKilogramsToMilligrams(BigDecimal kgValue) {
        return kgValue.multiply(BigDecimal.valueOf(1000000));
    }

    public BigDecimal convertGramsToKilograms(BigDecimal gmValue) {
        return gmValue.divide(BigDecimal.valueOf(1000));
    }

    public BigDecimal convertGramsToMilligrams(BigDecimal gmValue) {
        return gmValue.multiply(BigDecimal.valueOf(1000));
    }

    public BigDecimal convertMilligramsToGrams(BigDecimal mgValue) {
        return mgValue.divide(BigDecimal.valueOf(1000));
    }

    public BigDecimal convertMilligramsToKilograms(BigDecimal mgValue) {
        return mgValue.divide(BigDecimal.valueOf(1000000));
    }
}
