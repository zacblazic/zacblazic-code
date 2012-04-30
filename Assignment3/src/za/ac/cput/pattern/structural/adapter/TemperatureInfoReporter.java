/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package za.ac.cput.pattern.structural.adapter;

/**
 *
 * @author 210208880
 */
public class TemperatureInfoReporter implements TemperatureInfo {

    private CelciusReporter celciusReporter;
    
    public TemperatureInfoReporter(CelciusReporter celciusReporter) {
        this.celciusReporter = celciusReporter;
    }
    
    @Override
    public double getTemperatureCelcius() {
        return celciusReporter.getTemperature();
    }

    @Override
    public void setTemperatureCelcius(double temperature) {
        celciusReporter.setTemperature(temperature);
    }

    @Override
    public double getTemperatureFarenheit() {
        return celciusToFarenheit(celciusReporter.getTemperature());
    }

    @Override
    public void setTemperatureFarenheit(double temperature) {
        celciusReporter.setTemperature(farenheitToCelcius(temperature));
    }
    
    private double farenheitToCelcius(double farenheit) {
        return (farenheit - 32) * 5 / 9;
    }
    
    private double celciusToFarenheit(double celcius) {
        return (celcius * 9 / 5) + 32;
    }
}