package org.example;

public class Main {
    public static void main(String[] args) {
        Problem p = new Problem(10, 1, 1, 10);
        System.out.println(p);
        Result r = p.solve(20);
        System.out.println(r);
    }
}
