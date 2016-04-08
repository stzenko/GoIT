package module8;

import module9.ShyfrCezarya;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

/**
 * Created by Zenovii on 08.03.2016.
 */
        public class MusicShop {

    public ArrayList<MusicInstrument> getMusicInstrument() {
        return musicInstrument;
    }

    ArrayList<MusicInstrument> musicInstrument = new ArrayList<>();

    public void initShop() {

        Guitar guitar1 = new Guitar("Guitar ", "Counter ", 30, " red", " cord ");
        Guitar guitar2 = new Guitar("Guitar ", "Fusions ", 25, "yellow", " cord");
        Piano piano = new Piano("Piano", " Forte ", 75, " black", " key");
        Tube tube = new Tube("Tube", " Porto ", 125, " gold", " spiritual");

        musicInstrument.add(guitar1);
        musicInstrument.add(guitar2);
        musicInstrument.add(piano);
        musicInstrument.add(tube);
    }
    public  void printinTable() {

        PrintTable.print(musicInstrument);
        Set<MusicInstrument> sortedFirmList = new TreeSet<>((o1, o2) -> o1.firm.compareTo(o2.firm));
        sortedFirmList.addAll(musicInstrument);

        System.out.println("\n Sorted by Firm:");
        PrintTable.print(sortedFirmList);

        Set<MusicInstrument> sortedVolume = new TreeSet<>((o1, o2) -> o1.volume - o2.volume);
        sortedVolume.addAll(musicInstrument);
        System.out.println("\n Sorted by Volume:");
        PrintTable.print(sortedVolume);
    }
        public  void shyfrCezarya() {
            System.out.println("Collection" + getMusicInstrument());
            System.out.println("Cipher    " + ShyfrCezarya.toCodeString(getMusicInstrument()));
            System.out.println("Decipher  " + ShyfrCezarya.toDeCodeString(ShyfrCezarya.toCodeString(getMusicInstrument())) );
        }
    }
