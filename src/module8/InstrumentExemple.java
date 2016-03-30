package module8;

import java.util.*;

/**
 * Created by Zenovii on 31.03.2016.
 */
public class  InstrumentExemple {
    public static void main(String[] args) {
        MusicShop musicShop = new MusicShop();

        musicShop.musicInstrumentList(new Guitar ("Guitar", "Counter", 30, "red", "cord"));
        musicShop.musicInstrumentList(new Guitar("Guitar", "Fusions",25,"yellow","cord"));
        musicShop.musicInstrumentList(new Piano("Piano", "Forte",75,"black","key"));
        musicShop.musicInstrumentList(new Tube("Tube","Porto",125,"gold","spiritual"));

            PrintTable.Print(musicShop.musicInstrumentList);


        Set<MusicInstrument> sortedFirmList = new TreeSet<MusicInstrument>((o1, o2) -> o1.firm.compareTo(o2.firm));
        sortedFirmList.addAll(musicShop.musicInstrumentList);

        System.out.println("\n Sorted by Firm:");
        PrintTable.Print(sortedFirmList);

        Set<MusicInstrument> sortedVolume = new TreeSet<MusicInstrument>((o1, o2) -> o1.volume - o2.volume);
        sortedVolume.addAll(musicShop.musicInstrumentList);
        System.out.println("\n Sorted by Volume:");
        PrintTable.Print(sortedVolume);

    }
}

