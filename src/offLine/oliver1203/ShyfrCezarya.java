package offLine.oliver1203;

import java.util.Scanner;

/**
 * Created by Zenovii on 12.03.2016.
 */
public class ShyfrCezarya {
    public static void main(String[] args) {
        System.out.println("Enter ... ");
        Scanner type = new Scanner(System.in);
        String inpuText = type.next();

        char[] Array = inpuText.toCharArray();
        for(int i=0; i<Array.length;i++)
            System.out.println(Array[i] );
            }


}
