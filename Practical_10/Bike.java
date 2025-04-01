/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.gradleproject3;

/**
 *
 * @author athar
 */
public class Bike extends Vehicle {
    protected int weight;

    Bike(String brand, String model, String fuel_type, int weight){
        super(brand, model, fuel_type);
        this.weight = weight;
    }
}
