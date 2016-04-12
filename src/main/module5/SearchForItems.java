package main.module5;

import java.util.Arrays;

/**
 * Created by Zenovii on 17.03.2016.
 */
public class SearchForItems {

    public  static int[] array = {50, 1, -500, 3, 400, 20, 6, -1000, -25, 10};
    public static void main(String[] args) {

        minElement(array);
        maxElement(array);
        arraySortMasiv(array);

        }

    public static int minElement(int[] array){
        int min = array[0];
        for (int i = 0; i < array.length-1; i++) {
            if (array[i] < min) {
                min = array[i] ;
            }
        }
        System.out.println("Minimal element = " + min);
        return min;

    }
    public static int maxElement(int[] array){
        int max = array[0];
        for (int i = 0; i < array.length-1; i++) {
             if (array[i]>max) {
                max = array[i];
            }
        }
        System.out.println("Maximal element = " + max);
        return max;

    }

    public static int[] arraySortMasiv(int[] array){
        int elements=array[0];
        Arrays.sort(array);
        for (int element:array){
            elements=element;
            System.out.print(element+" ");
        }
       // System.out.println(elements);
        return new int[]{elements};

    }
}