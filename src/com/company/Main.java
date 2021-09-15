package com.company;
import java.lang.Math;

public class Main {

    abstract static class Shape {
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

    public static class circle extends Shape{
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

    public static void main(String[] args) {
	circle c = new circle();
    circle v = new circle();
    c.set(4, 3, 2);
    v.set(7.9, 3,2);
    System.out.println(c.returnCenter());
    System.out.println(v.returnCenter());
    System.out.println(c.dist(v.x, v.y));
    System.out.println(v.overlap(v.dist(c.x, c.y), c.size));
    System.out.println(v.area());
    }
}
