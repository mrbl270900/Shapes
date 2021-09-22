package com.company;

public class triangel extends Shape {
    float hight = this.size;
    float width = this.size;

    public boolean overlapPoint(float x, float y) {
        float x1 = this.x;
        float y1 = this.y;
        float x2 = this.x + this.width;
        float y2 = this.y;
        float x3 = this.x;
        float y3 = this.y + this.hight;

        float a1 =  (x1*(y2-y) + x2*(y-y1)+ x*(y1-y2))/2;
        float a2 = (x1*(y-y3) + x*(y3-y1)+ x3*(y1-y))/2;
        float a3 = (x*(y2-y3) + x2*(y3-y)+ x3*(y-y2))/2;


        return this.area() == a1+a2+a3 && a1 >=0 && a2 >= 0 && a3 >= 0;
    }

    public void set(float x1, float y1, float size1) {
        this.x = x1;
        this.y = y1;
        this.hight = size1;
        this.width = size1;
        this.size = size1;
    }

    public double area() {
        return (this.hight * this.width)/2;
    }

    public double circum() {
        double c = Math.sqrt(Math.pow(this.width,2)+Math.pow(this.hight,2));
        return this.width + this.hight + c;
    }
}
