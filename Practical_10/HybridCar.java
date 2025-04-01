/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.gradleproject3;

/**
 *
 * @author athar
 */
public class HybridCar extends Car {
    int dist_range;
    
    HybridCar(String brand, String model, String fuel_type, int seat_capacity, int dist_range){
        super(brand, model, fuel_type, seat_capacity);
        this.dist_range = dist_range;
    }
}
