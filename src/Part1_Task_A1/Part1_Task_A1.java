package Part1_Task_A1;

/**
 * Created by X1z on 20.10.2015.
 */
public class Part1_Task_A1 {

    public void TaskA1(String[] args){
        System.out.println(args[0]);
    }

    public void TaskA2(String[] args){
        for (int i = args.length-1; i >=0 ; i--) {
            System.out.println(args[i]);
        }
    }

    public void TaskA3(String[] args){
        int countNumbers=Integer.parseInt(args[0]);
        for (int i = 0; i < countNumbers; i++) {
            System.out.println(Math.random());
        }
        for (int i = 0; i < countNumbers; i++) {
            System.out.print(Math.random());
        }
    }

    public void TaskA4(String[] args){
        String password="12345";

        if (password.equals(args[0])){
            System.out.println("Password correct");
        } else System.out.println("Password incorrect");
    }

    public void TaskA5(String[] args){
        int summ=0;
        for (int i = 0; i <args.length ; i++) {
            summ+=Integer.parseInt(args[i]);
        }
        System.out.println(summ);
    }



}
