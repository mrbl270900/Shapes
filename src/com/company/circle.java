package com.company;
import java.lang.Math;

public class circle extends Shape {
    double radius = this.size;

    public boolean overlap(double dist, double size){
        return dist < size + this.size;
    }
    public void set(double x1, double y1, double size1){
        this.x = x1;
        this.y = y1;
        this.radius = size1;
        this.size = size1;
    }
    public double area(){
        return Math.PI * Math.pow(this.radius, 2);
    }
}
