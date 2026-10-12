/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package test;

/**
 *
 * @author Student
 */
public class CoffeeHutSales {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    }
    String[] cities = {
    "Cape Town",
    "Port Elizabeth",
    "Pretoia"
    };
    
    String[] beverages = {
    "Coffee",
    "Tea",
    "Boba Tea"
    };
    
    int[] cityTotals = new int[3]
            
            int grandTotal = 0;
            
            System.out.println ("NUMBER 1 COFFEE HUT");
            System.out.prinln("MONTHLY BEVERAGES SALES REPORT");
            
            System.out.println("--------------");
            
            System.out.printf("%- 18s %10s %10s %10s %12s%n", "City", "Coffee", "Tea",
                    "Boba Tea", "City Total");
            
            System.out.println("----------------");
            
            for (int i =0; i< cities.length; i++) {
            int total = 0;  
            for (int j = 0; < sales[i].length; j++){
            total += sales[i] [j]
                    }
            
            cityTotals[i] = total; 
            grangTotal += total;
            System.out.printf("%-18s %10d %10d %10d %12d%n",
                    cities[i],
                    sales[i][0],
                    sales[i][1],
                    sales[i][2],
                    cityTotals[i]);
}
            
            
            System.out.println("-------------------");
            
            System.out.println("Total sales for all cities: " + grandTotal);
}
}
