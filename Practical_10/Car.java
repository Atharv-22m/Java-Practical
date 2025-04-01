/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.gradleproject3;

/**
 *
 * @author athar
 */
public class Car extends Vehicle {
    protected int seat_capacity;

    Car(String brand, String model, String fuel_type, int seat_capacity){
        super(brand, model, fuel_type);
        this.seat_capacity = seat_capacity;
    }
}
