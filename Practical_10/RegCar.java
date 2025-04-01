/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.gradleproject3;

/**
 *
 * @author athar
 */
public class RegCar extends Car {
    int mileage;
    
    RegCar(String brand, String model, String fuel_type, int seat_capacity, int mileage){
        super(brand, model, fuel_type, seat_capacity);
        this.mileage = mileage;
    }
}
