package com.pluralsight;

public class MathApp {
    public static void main(String[] args) {
        int bobSalary = 600;
        int garySalary = 300;
        int highestSalary = Math.max(bobSalary, garySalary);
            System.out.println("The highest Salary is " + highestSalary);
        int carPrice = 1000;
        int truckPrice = 5000;
        int minPrice = Math.min(carPrice, truckPrice);
            System.out.println(minPrice);
        float circleArea = 7.25f * 3.14f;


        /** finding the area of a circle*/
        double radius = 7.25;
        double areaOfCircle = Math.PI * Math.pow(radius, 2);
        System.out.println("Area of a circle with " + radius + "is " + areaOfCircle);
    }


}
