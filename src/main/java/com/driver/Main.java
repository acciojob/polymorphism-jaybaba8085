package com.driver;

import java.util.*;
import java.lang.*;

public class Main
{
    static class Product{

       public int product(int a,int b){

            return a*b ;
        }
        public int product(int a,int b,int c){

            return a*b*c ;
        }
        public double product(double a,double b){

            return (double)a*b ;
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