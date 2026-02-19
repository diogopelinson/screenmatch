package br.com.alura.screenmatch.modelos;

import br.com.alura.screenmatch.calculo.ConversorTemperatura;

public class ConversorTemperaturaPadrao implements ConversorTemperatura {

    @Override
    public double celsiusParaFahrenheit(double celsius) {
        return (celsius * 1.8) + 32;
    }

    @Override
    public double fahrenheitParaCelsius(double fahrenheit) {
        return (fahrenheit - 32) * 5.0 / 9.0;
    }
}
