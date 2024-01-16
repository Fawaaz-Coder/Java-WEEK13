import java.util.Arrays;

public class ArrCopy {
    public static void main(String[] args) {
        int [] list1 = {1,20,40,30,50,99,39,56,13,91};
        int [] list2 = {2,21,42,33,54,95,36,57,18,94};

//        This creates two seperate lists without make list 2 a single list
        list2 = list1.clone();


        list1 [0] = 5000;
        list2 [9] = 9000;

        System.out.println(Arrays.toString(list1));
        System.out.println(Arrays.toString(list2));
    }
}
