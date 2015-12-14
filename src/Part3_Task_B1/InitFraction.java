package Part3_Task_B1;

import java.util.ArrayList;

/**
 * Created by X1z on 09.12.2015.
 */
public class InitFraction {
    private int k;
    private ArrayList<Fraction> fractions;

    public InitFraction(int k) {
        this.k = k;
    }

    public ArrayList<Fraction> getFractions() {
        for (int i = 0; i <k ; i++) {
            fractions.add(new Fraction(i+1,i+2));
        }
        return fractions;
    }

}
