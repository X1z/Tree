package com.xizov.part4_taskb2.entity;

import com.sun.javafx.collections.transformation.SortedList;

import java.util.ArrayList;

/**
 * Created by X1z on 14.12.2015.
 */
public class Present extends ArrayList<Sweet>{
    private int weigth;

    public Present(Sweet ... sweets) {
        for (Sweet sweet : sweets) {
            this.add(sweet);
            weigth+=sweet.getWeigth();
        }
    }

    public int getWeigth() {
        return weigth;
    }

}
