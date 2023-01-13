package com.driver;

public class Main {
    public static void main(String[] args) {
        Product p= new Product();
        int res1=p.product(5,6);
        System.out.println(res1); // prints 30

        int res2 = p.product(5, 6, 7);
        System.out.println(res2); // prints 210

        double res3 = p.product(5.5, 6.5);
        System.out.println(res3);
    }
    static class Product{
        public int product(int x, int y) {
            return x*y;
        }
        public int product(int x, int y, int z) {
            return x*y*z;
        }
        public double product(double x, double y) {
            return x*y;
        }
    }
}

