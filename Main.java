import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String[] args){
        
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
}
