package com.xizov.part4_taskb2.entity.sweets;

import com.xizov.part4_taskb2.entity.Sweet;

import java.awt.*;

/**
 * Created by X1z on 14.12.2015.
 */
public class Jujube extends Sweet {
    private Color color;

    public Jujube(int weigth, int shugaPercent, String name, Color color) {
        super(weigth, shugaPercent, name);
        this.color = color;
    }
}
