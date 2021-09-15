package com.company;

abstract class Shape {
    double x;
    double y;
    double size;

    public String returnCenter(){
        return "X=" + this.x + ", Y=" + this.y;
    }
    public double dist(double ox, double oy){
        return Math.sqrt(Math.pow(ox-this.x, 2)+Math.pow(oy-this.y, 2));
    }
}
