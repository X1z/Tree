package com.xizov.part4_taskb2.entity;

/**
 * Created by X1z on 12.12.2015.
 */
public abstract class Sweet{
    private int weigth;
    private int shugaPercent;
    private String name;

    public Sweet(int weigth, int shugaPercent, String name) {
        this.weigth = weigth;
        this.shugaPercent = shugaPercent;
        this.name = name;
    }

    public int getWeigth() {
        return weigth;
    }

    public int getShugaPercent() {
        return shugaPercent;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Sweet{" +
                "weigth=" + weigth +
                ", shugaPercent=" + shugaPercent +
                ", name='" + name + '\'' +
                '}';
    }
}
