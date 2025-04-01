/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.gradleproject3;

/**
 *
 * @author athar
 */
public class SportsBike extends Bike {
    int max_speed;
    
    SportsBike(String brand, String model, String fuel_type, int weight, int max_speed){
        super(brand, model, fuel_type, weight);
        this.max_speed = max_speed;
    }
}
