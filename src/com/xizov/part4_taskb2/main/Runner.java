package com.xizov.part4_taskb2.main;

import com.xizov.part4_taskb2.action.DoAction;
import com.xizov.part4_taskb2.entity.Present;
import com.xizov.part4_taskb2.entity.Sweet;
import com.xizov.part4_taskb2.entity.sweets.Candy;
import com.xizov.part4_taskb2.entity.sweets.Chocolate;
import com.xizov.part4_taskb2.entity.sweets.Cookie;
import com.xizov.part4_taskb2.entity.sweets.Jujube;

import java.awt.*;

/**
 * Created by X1z on 12.12.2015.
 */
public class Runner {
    public static void main(String[] args) {

        Present present = new Present(new Candy(15,22,"Корова"),
                new Chocolate(22,21,"Альпен",21),
                new Cookie(20,20,"Печенька"),
                new Jujube(19,19,"Мармеладка",new Color(0x142C7B)));

        for (Sweet sweet : present) {
            System.out.println(sweet);
        }

        System.out.println(DoAction.findSweet(present,22));

        System.out.println("name sort");
        for (Sweet sweet : DoAction.sortPresent(present, "Name")) {
            System.out.println(sweet);
        }

        System.out.println("shuga sort");
        for (Sweet sweet : DoAction.sortPresent(present, "shugapercent")) {
            System.out.println(sweet);
        }

        System.out.println("weigth");
        for (Sweet sweet : DoAction.sortPresent(present, "weigth")) {
            System.out.println(sweet);
        }
    }
}
