/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package test;

/**
 *
 * @author Student
 */

    

import java.utill.Scanner

interface IBevarage{
String getBeverageType();
String getCity();
int getTotalSales();
}

abstract class Beverage implements IBeverage{
protected String beverageType;
protected String city;
protected int totalSales;

public Beverage(String beverageType, String city, int totalSales){
    this.beverageType = beverageType;
    this.city = city;
    this.totalSales = totalSales;
}