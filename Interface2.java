package com.Ansh;
import java.util.Scanner;

interface Circle
{
    void area();
}
interface Rect
{
    void area1();
}
  class Interface2 implements Circle,Rect
{
    Scanner scan=new Scanner(System.in);
    public void area()
    {
        System.out.print("Enter Radius: ");
        double x=scan.nextDouble();
        double A=3.1415*x*x;
        System.out.println("Area of the circle: "+A);
    }
    public void area1()
    {
        System.out.print("\nEnter Length and Breadth: ");
        double x=scan.nextDouble();
        double y=scan.nextDouble();
        double A=x*y;
        System.out.println("Area of the rectangle: "+A);
    }

    public static void main(String[] args) {
        Interface2 ob= new Interface2();
        ob.area();
        ob.area1();
    }
}
