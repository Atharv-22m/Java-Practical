/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.gradleproject3;

/**
 *
 * @author athar
 */
public class ElecCar extends Car {
    int batt_power;
    
    ElecCar(String brand, String model, String fuel_type, int seat_capacity, int batt_power){
        super(brand, model, fuel_type, seat_capacity);
        this.batt_power = batt_power;
    }
}
