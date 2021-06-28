package com.lab2;

import java.util.Scanner;

public class Lab1 {
    public static void main(String[] args) {
        Point3d[] points = new Point3d[3];
        double x, y, z;

        Scanner in = new Scanner(System.in);
        for (int i = 0; i < 3; i++) {
            System.out.print("Введите x: ");
            x = in.nextDouble();
            System.out.print("Введите y: ");
            y = in.nextDouble();
            System.out.print("Введите z: ");
            z = in.nextDouble();
            points[i] = new Point3d(x, y, z);
        }

        if (points[0].equals(points[1]) || points[1].equals(points[2]) || points[2].equals(points[0])){
            System.out.print("Были введены две одинаковые точки, вычисление невозможно");
        } else {
            System.out.println(Point3d.computeArea(points[0], points[1], points[2]));
        }
    }
}
