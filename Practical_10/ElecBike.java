/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.gradleproject3;

/**
 *
 * @author athar
 */
public class ElecBike extends Bike {
    int batt_range;
    
    ElecBike(String brand, String model, String fuel_type, int weight, int batt_range){
        super(brand, model, fuel_type, weight);
        this.batt_range = batt_range;
    }
}
