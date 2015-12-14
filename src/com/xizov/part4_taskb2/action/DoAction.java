package com.xizov.part4_taskb2.action;

import com.xizov.part4_taskb2.entity.Present;
import com.xizov.part4_taskb2.entity.Sweet;

import java.util.Collections;
import java.util.Comparator;

/**
 * Created by X1z on 14.12.2015.
 */
public class DoAction {

    private DoAction() {
    }

    public static Sweet findSweet(Present present,int shugaPercent){
        for (Sweet sweet : present) {
            if (sweet.getShugaPercent()==shugaPercent) return sweet;
        }
        return null;
    }

    public static Present sortPresent(Present present,String fieldName){
        switch (fieldName.toLowerCase()){
            case "name":
                Collections.sort(present, new Comparator<Sweet>() {
                    @Override
                    public int compare(Sweet o1, Sweet o2) {
                        return o1.getName().compareTo(o2.getName());
                    }
                });
                break;
            case "shugapercent":
                Collections.sort(present, new Comparator<Sweet>() {
                    @Override
                    public int compare(Sweet o1, Sweet o2) {
                        return ((Integer)o1.getShugaPercent()).compareTo(o2.getShugaPercent());
                    }
                });
                break;
            case  "weigth":
                Collections.sort(present, new Comparator<Sweet>() {
                    @Override
                    public int compare(Sweet o1, Sweet o2) {
                        return ((Integer)o1.getWeigth()).compareTo(o2.getWeigth());
                    }
                });
                break;
            default:
                System.out.println("Illegal field name");
        }

        return present;
    }

}
