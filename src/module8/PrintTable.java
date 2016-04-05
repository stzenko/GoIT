package module8;

import java.util.Collection;

/**
 * Created by Zenovii on 30.03.2016.
 */
public class PrintTable {

        static void  print(Collection<MusicInstrument> instrument){
            System.out.println("__________________________________________________________________________________");
            System.out.println("Type instrument  | \t Firm \t\t |  Volume  | \t Color \t\t|\t Classifications  \t");
            System.out.println("__________________________________________________________________________________");

            for (MusicInstrument i : instrument ){
                System.out.println(i.nameInstrument + "\t\t\t | "+ i.firm + "\t\t | \t" + i.volume + "\t\t|\t" + i.color + " \t\t|\t"+ i.classification);
            }
            System.out.println("__________________________________________________________________________________");



        }


}

