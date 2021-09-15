package com.company;

abstract class Shape {
    float x;
    float y;
    float size;

    public String returnCenter(){
        return "X=" + this.x + ", Y=" + this.y;
    }
    
    public double dist(double ox, double oy){
        return Math.sqrt(Math.pow(ox-this.x, 2)+Math.pow(oy-this.y, 2));
    }
}
