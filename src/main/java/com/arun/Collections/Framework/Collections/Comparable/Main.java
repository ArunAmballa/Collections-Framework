package com.arun.Collections.Framework.Collections.Comparable;


import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        Car[] carList = new Car[3];
        carList[0] = new Car("honda", "suv");
        carList[1] = new Car("maruti", "sedan");
        carList[2] = new Car("bmw", "hatchback");

        Arrays.sort(carList);

        for (Car value : carList) {
            System.out.println(value.toString());
        }

    }
}