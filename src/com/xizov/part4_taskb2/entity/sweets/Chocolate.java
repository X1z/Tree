package com.xizov.part4_taskb2.entity.sweets;

import com.xizov.part4_taskb2.entity.Sweet;

/**
 * Created by X1z on 12.12.2015.
 */
public class Chocolate extends Sweet{
    private int percentChoco;

    public Chocolate(int weigth, int shugaPercent, String name, int percentChoco) {
        super(weigth, shugaPercent, name);
        this.percentChoco = percentChoco;
    }
}

