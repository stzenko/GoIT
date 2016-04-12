package main.module5;

import java.util.Arrays;

/**
 * Created by Zenovii on 17.03.2016.
 */
public class SearchForItems {
    public static void main(String[] args) {

        int[] array = {50, 1, -500, 3, 400, 20, 6, -1000, -25, 10};
        int min = array[0];
        int max = array[0];

        for (int i = 0; i < array.length-1; i++) {

            if (array[i] < min) {
              min = array[i] ;
            }
            else if (array[i]>max) {
                max = array[i];
            }
        }
        System.out.println("Minimal element = " + min);
        System.out.println("Maximal element = " + max);

        Arrays.sort(array);
        for (int element:array){
        System.out.println(element);
        }
    }
}