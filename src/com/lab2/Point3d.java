package com.lab2;

public class Point3d extends Point2d {
    protected double zCoord;

    public Point3d(double x, double y, double z){
        super(x, y);
        zCoord = z;
    }

    public Point3d() {
        this(0.0, 0.0, 0.0);
    }

    public double getZ() {
        return zCoord;
    }

    public void setZ(double z) {
        this.zCoord = z;
    }

    public boolean equals(Point3d point){
        return ((xCoord == point.getX()) && (yCoord == point.getY()) && (zCoord == point.getZ()));
    }

    public double distanceTo(Point3d point) {
        return (double)Math.round(Math.abs(Math.sqrt(Math.pow(point.getX() - getX(), 2) +
                Math.pow(point.getY() - getY(), 2) + Math.pow(point.getZ() - getZ(), 2))) * 100) / 100;
    }

    public static double computeArea(Point3d A, Point3d B, Point3d C){
        double AB = A.distanceTo(B);
        double BC = B.distanceTo(C);
        double AC = A.distanceTo(C);

        double p = (AB + BC + AC) / 2;
        return Math.sqrt(p*(p-AB)*(p-BC)*(p-AC));
    }
}
