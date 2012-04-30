/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package za.ac.cput.pattern.structural.adapter;

/**
 *
 * @author 210208880
 */
public interface TemperatureInfo {
    public double getTemperatureCelcius();
    public void setTemperatureCelcius(double temperature);
    public double getTemperatureFarenheit();
    public void setTemperatureFarenheit(double temperature);
}
