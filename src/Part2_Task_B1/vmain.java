package Part2_Task_B1;

/**
 * Created by X1z on 03.11.2015.
 */
public class vmain {
    public static void main(String[] args) {

        System.out.println(Interval("(0,10)", 1));
    }
    public static boolean Interval(String data, int k){
        int min, max;
        boolean result=true;
        String[] dataMass= data.split(",");

        if (dataMass[0].charAt(0)=='['){
            min=Integer.parseInt(dataMass[0].substring(1));
        } else min=Integer.parseInt(dataMass[0].substring(1))+1;

        if (dataMass[1].charAt(dataMass[1].length()-1)==']'){
            max=Integer.parseInt(dataMass[1].substring(0,dataMass[1].length()-1))+1;
        } else max=Integer.parseInt(dataMass[1].substring(0,dataMass[1].length()-1));

        for (int i = min; i < max; i++) {
            if (k==i) {
                return true;
               // break;
            }
        }
        return false;
    }
}
