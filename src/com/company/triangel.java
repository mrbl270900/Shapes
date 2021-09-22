package com.company;

public class triangel extends Shape {
    float hight = this.size;
    float width = this.size;

    public boolean overlapPoint(float x, float y) {
        return x <= this.x + this.width && x >= this.x && y <= this.y + this.hight && y >= this.y;
    }

    public void set(float x1, float y1, float size1) {
        this.x = x1;
        this.y = y1;
        this.hight = size1;
        this.width = size1;
        this.size = size1;
    }

    public double area() {
        return this.hight * this.width;
    }

    public double circum() {
        return (this.hight * 2) + (this.width * 2);
    }
}
