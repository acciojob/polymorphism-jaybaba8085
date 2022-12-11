package com.driver;

import java.util.*;
import java.lang.*;

public class Main
{
    public static class Product{
        int a;
        int b;
        int c;

        int product(int a,int b){
            int c = a*b;
            return c;
        }
        int product(int a,int b,int c){
            int d = a*b*c;
            return d;
        }
        double product(double a,double b){
            double ans = a*b;
            return ans;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Product p = new Product();
        p.product(1,2);
        p.product(2,3,4);
        p.product(1.2,3.4);
    }
}