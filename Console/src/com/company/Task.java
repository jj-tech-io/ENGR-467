package com.company;

public class Task {

    String name;
    int duration;
    int period;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }

    public int getPeriod() {
        return period;
    }

    public void setPeriod(int period) {
        this.period = period;
    }

    Task(String name, int duration, int period) {
        this.name = name;
        this.duration = duration;
        this.period = period;


    }


    @Override
    public String toString() {
        return "Task "+ name +"\t"+ "duration = " + duration + " period = " + period;
    }
}
