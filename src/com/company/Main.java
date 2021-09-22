package com.company;

public class Main {

    public static void main(String[] args) {
	circle c = new circle();
    rect v = new rect();
    c.set(4f, 3f, 4f);
    v.set(8f, 3f,3f);
    System.out.println(c.returnCenter());
    System.out.println(v.returnCenter());
    System.out.println(c.dist(v.x, v.y));
    System.out.println(v.overlapPoint(11,6));
    System.out.println(v.area());
    System.out.println(c.circum());
    System.out.println(c.overlapPoint(4,7.1f));
    }
}
