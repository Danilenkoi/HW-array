import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        // exercise 1.1
        int [] array1 = new int [3];
        array1 [0] = 1;
        array1 [1] = 2;
        array1 [2] = 3;

        // exercise 1.2
        float [] array2 = {1.57f, 7.654f, 9.986f};

        // exercise 1.3
        int [] array3 = {9, 8, 7, 6, 5};

        // exercise 2.1
        for (int i = 0; i < array1.length; i++){
            if(i == array1.length-1){
                System.out.print(array1[i]);
            } else {
                System.out.print(array1[i]+  ", ");
            }
        }System.out.println(" ");

        // exercise 2.2
        for (int i = 0; i < array2.length; i++){
            if(i == array2.length-1){
                System.out.print(array2[i]);
            } else {
                System.out.print(array2[i] + ", ");
            }
        }System.out.println(" ");

        // exercise 2.3
        for (int i = 0; i < array3.length; i++){
            if(i == array3.length-1){
                System.out.print(array3[i]);
            } else {
                System.out.print(array3[i] + ", ");
            }
        }System.out.println(" ");

        // exercise 3.1
        for (int i = array1.length-1; i >= 0; i--) {
            if (i != 0) {
                System.out.print(array1[i] + ", ");
            } else {
                System.out.print(array1[i]);
            }
        }
        System.out.println(" ");

        // exercise 3.2
        for (int i = array2.length-1; i >= 0; i--){
            if (i != 0){
                System.out.print(array2[i] + ", ");
            } else {
                System.out.print(array2[i]);
            }
        }System.out.println(" ");

        // exercise 3.3
        for (int i = array3.length-1; i >= 0; i--){
            if (i != 0){
                System.out.print(array3[i] + ", ");
            } else {
                System.out.print(array3[i]);
            }
        }System.out.println(" ");

        // exercise 4
        for (int i = 0; i < array1.length; i++){
            if (array1[i] % 2 !=0){
            array1[i] += 1;
            }
        }System.out.println(Arrays.toString(array1));
        System.out.println(" ");
    }
}