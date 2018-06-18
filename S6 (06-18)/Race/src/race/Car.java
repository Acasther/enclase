/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package race;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author davibq
 */
public class Car {
    private Engine engine;
    private double position = 0;
    private String brand;;
    private int wheels;
    
    public Car(String brand, int horsepower) {
        engine = new Engine(brand, horsepower);
        this.brand = brand;
    }
    public double Wheels(String brand, int wheels_size) {
        this.brand= brand;
        wheels_size = wheels_size;
        return wheels_size;
    }
    
   
    public double move() {
        Random rnd = new Random();
        float factor = rnd.nextFloat();
        double movement = Math.floor(factor * engine.getHorsepower());
        if (getWheels() == 20) {
            float fact = 1;
            movement = Math.floor(movement * fact);
        } else {
            float fact = rnd.nextFloat();
            movement = Math.floor(movement * fact);
        }
        position += movement;
        
        return position;
    }
    
    public double getPosition() {
        return position;
    }
    
    public String getBrand() {
        return brand;
    }
    
    public int getWheels() {
        return wheels;
    }

    public void setWheels(int wheels) {
        this.wheels = wheels;
    }

    
    
    
}

