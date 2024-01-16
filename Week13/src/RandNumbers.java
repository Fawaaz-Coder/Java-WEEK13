import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Random;

public class RandNumbers {
    public static void main(String[] args) {
        int [] randVals = new int[10];
        int sum = 0, sum1 = 0;

        for (int i = 0; i<randVals.length; i++){
            randVals[i] = (int) (Math.random() * 99) + 1;
            sum+= randVals[i];

//            Positive sign for even numbers
            if(i%2==0){
                System.out.println("+" + randVals[i] + " ");
                sum += randVals[i];
            }
            else{
                System.out.println(-1*randVals[i] + " ");
                sum = sum - randVals[i];
            }

//            Math.pow is a power function in Java

            sum1 += (int) Math.pow(-1,i)*randVals[i];
        }

        System.out.println(sum + " "+sum1);
        System.out.println(Arrays.toString(randVals));


    }
}