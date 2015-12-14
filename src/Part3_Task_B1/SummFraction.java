package Part3_Task_B1;

import java.util.ArrayList;

/**
 * Created by X1z on 09.12.2015.
 */
public class SummFraction {

    private SummFraction() {
    }

    public static ArrayList<Fraction> SummFraction(ArrayList<Fraction> fractions){
        Fraction fraction;
        for (int i = 0; i < fractions.size(); i++) {
          if (i+1<fractions.size()&&i%2==0){
              fraction=new Fraction(fractions.get(i).getM()+fractions.get(i+1).getM(),
                      fractions.get(i).getN()+fractions.get(i+1).getN());
              fractions.remove(i);
              fractions.add(i,fraction);
          }
        }
        return fractions;
    }
}
