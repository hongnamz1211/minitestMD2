package com.company;

public class MyStudent extends MyHuman{
    private double avg;

    public MyStudent(double avg) {
        this.avg = avg;
    }

    public MyStudent(int id, String name, int age, double avg) {
        super(id, name, age);
        this.avg = avg;
    }

    public double getAvg() {
        return avg;
    }

    public void setAvg(double avg) {
        this.avg = avg;
    }
}
