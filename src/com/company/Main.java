package com.company;

public class Main {

    public static void main(String[] args) {
	circle c = new circle();
    circle v = new circle();
    c.set(4f, 3f, 2f);
    v.set(7.9f, 3f,2f);
    System.out.println(c.returnCenter());
    System.out.println(v.returnCenter());
    System.out.println(c.dist(v.x, v.y));
    System.out.println(v.overlap(v.dist(c.x, c.y), c.size));
    System.out.println(v.area());
    }
}
