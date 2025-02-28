package com.arun.Collections.Framework.Collections.Comparable;

public class Car implements Comparable<Car>{

    String carName;
    String carType;

    public Car(String carName,String carType){
        this.carName=carName;
        this.carType=carType;
    }

    @Override
    public String toString(){
        return this.carName+"...."+this.carType;
    }

    @Override
    public int compareTo(Car o) {
        return this.carName.compareTo(o.carName);
    }
}