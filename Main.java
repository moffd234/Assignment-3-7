import java.util.ArrayList;
import java.util.Arrays;
import java.util.concurrent.LinkedBlockingDeque;

public class Main {
    public static void main(String[] args){
        exponentiate();
    }

    public static void OneHundredToFive(){
        for(int i = 100; i >= 5; i -= 5){
            System.out.println(i);
        }
    }

    public static void fiveToSeventyFive() {
        for (int i = 5; i <= 75; i += 10) {
            System.out.println(i);
        }
    }

    public static void sumIntegers(){
        int sum = 0;
        for(int i = 9; i <= 17; i++){
            sum += i;
        }
        System.out.println(sum);
    }

    public static void findSmallest(){
        int[] array = new int[] {9, 5, 6, 3, 8, 2, 4};
        int min = Integer.MAX_VALUE;
        for(int i = 0; i < array.length; i++){
            if(array[i] < min){
                min = array[i];
            }
        }
        System.out.println(min);
    }

    public static void findLargest(){
        int[] array = new int[] {9, 5, 6, 3, 8, 2, 4};
        int max = Integer.MIN_VALUE;
        for(int i = 0; i < array.length; i++){
            if(array[i] > max){
                max = array[i];
            }
        }
        System.out.println(max);
    }

    public static void printFirstTrue(){
        boolean[] array = new boolean[] {false, false, false, true, false};
        for(int i = 0; i < array.length; i++){
            if(array[i]){
                System.out.println("First true index = " + i);
            }
        }
    }

    public static void printFirstTrueWithWhile(){
        boolean[] array = new boolean[] {false, false, false, true, false};
        int index = 0;
        while(!array[index]){
            index++;
        }
        System.out.println("First true index = " + index);
    }

    public static void addFive(){
        int[] array = new int[] {9, 5, 6, 3, 8, 2, 4};
        for(int i = 0; i < array.length; i++){
            array[i] += 5;
        }
    }

    public static void divideByOnePointThree(){
        double[] array = new double[]{0.5, 1.4, 6.7, 123.4 -34.6};
        for(int i = 0; i < array.length; i++){
            array[i] /= 1.3;
        }
    }

    public static void exponentiate(){
        double[] array = new double[] {1.3, 5.4, 6.1, 1.0, 9.2};
        for(int i = 0; i < array.length; i++){
            double newNum = (Math.pow(array[i], 3) - array[i]) / 3;
            array[i] = newNum;
        }
        System.out.println(Arrays.toString(array));
    }

    // TODO: Complete the below function
    public static void zeroOutThenMultiple(){}

    public static void evenFalse(){
        
    }
}
