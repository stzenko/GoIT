package module8;

import module9.ShyfrCezarya;

import java.util.*;

import static module8.PrintTable.print;

/**
 * Created by Zenovii on 31.03.2016.
 *
 */
public class  InstrumentExemple {
    public static void main(String[] args) {
       InstrumentExemple.printinTable();

    }
    public static void printinTable(){

        ArrayList<MusicInstrument> musicInstrumentList = new ArrayList<>();

        Guitar guitar1 = new Guitar("Guitar ", "Counter ", 30, " red ", "cord ");
        Guitar guitar2 = new Guitar("Guitar ", "Fusions ",25," yellow"," cord");
        Piano piano = new Piano("Piano", " Forte",75," black"," key");
        Tube tube = new Tube("Tube"," Porto ",125," gold"," spiritual");

        musicInstrumentList.add(guitar1);
        musicInstrumentList.add(guitar2);
        musicInstrumentList.add(piano);
        musicInstrumentList.add(tube);

        PrintTable.print(musicInstrumentList);



        Set<MusicInstrument> sortedFirmList = new TreeSet<>((o1, o2) -> o1.firm.compareTo(o2.firm));

        sortedFirmList.addAll(musicInstrumentList);

        System.out.println("\n Sorted by Firm:");
        PrintTable.print(sortedFirmList);

        Set<MusicInstrument> sortedVolume = new TreeSet<>((o1, o2) -> o1.volume - o2.volume);
        sortedVolume.addAll(musicInstrumentList);
        System.out.println("\n Sorted by Volume:");
        PrintTable.print(sortedVolume);

        System.out.println(musicInstrumentList);
        System.out.println(ShyfrCezarya.toCodeString(musicInstrumentList));

    }
    }
