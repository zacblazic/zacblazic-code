/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package za.ac.cput.university.app.factory;

import za.ac.cput.university.model.Payment;

/**
 *
 * @author 210208880
 */
public class PaymentFactory 
{
    public static Payment getInstance() {
        return new Payment();
    }
}
