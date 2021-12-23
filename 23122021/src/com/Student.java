package com;

public class Student extends Human{
    private double pointMath;
    private double pointPhis;
    private double pointChemistry;

    public Student() {

    }

    public Student(double pointMath, double pointPhis, double pointChemistry) {
        this.pointMath = pointMath;
        this.pointPhis = pointPhis;
        this.pointChemistry = pointChemistry;
    }

    public Student(int id, String name, int age, double pointMath, double pointPhis, double pointChemistry) {
        super(id, name, age);
        this.pointMath = pointMath;
        this.pointPhis = pointPhis;
        this.pointChemistry = pointChemistry;
    }

    public double getPointMath() {
        return pointMath;
    }

    public void setPointMath(double pointMath) {
        this.pointMath = pointMath;
    }

    public double getPointPhis() {
        return pointPhis;
    }

    public void setPointPhis(double pointPhis) {
        this.pointPhis = pointPhis;
    }

    public double getPointChemistry() {
        return pointChemistry;
    }

    public void setPointChemistry(double pointChemistry) {
        this.pointChemistry = pointChemistry;
    }

    public double pointAvg() {
        return ((pointMath + pointChemistry + pointPhis) / 3);
    }

    @Override
    public String toString() {
        return super.toString() +
                ", pointMath=" + pointMath +
                ", pointPhis=" + pointPhis +
                ", pointChemistry=" + pointChemistry +
                ']';
    }
}
