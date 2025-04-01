/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.gradleproject3;

/**
 *
 * @author athar
 */
public class Truck extends Vehicle {
    protected int load_capacity, no_of_wheels;

    Truck(String brand, String model, String fuel_type, int load_capacity, int no_of_wheels){
        super(brand, model, fuel_type);
        this.load_capacity = load_capacity;
        this.no_of_wheels = no_of_wheels;
    }
}
