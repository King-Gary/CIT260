/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package temperature;

//import static java.time.Clock.system;
import java.util.Scanner;
import java.lang.System;

/**
 *
 * @author garyking
 */
public class Temperature {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int celsius;
        double fahrenheit;
        int output;
        Scanner keyboard = new Scanner(System.in);

        System.out.println("Enter Temperature in Celsius:");
        celsius = keyboard.nextInt();

        fahrenheit = (9.0/5.0) * celsius + 32;
        output = (int) fahrenheit;

        System.out.println("The Temperature in Fahrenheit"+ output);

        //having great difficulties not understanding how to program this.
    }
    
}
