package module8;

import javax.sound.midi.Instrument;
import java.util.*;

/**
 * Created by Zenovii on 08.03.2016.
 */
public class  InstrumentExemple {
    public static void main(String[] args) {
        MusicShop musicShop = new MusicShop();

        musicShop.musicInstrumentList(new Guitar ("Counter", 30, "red", "cord"));
        musicShop.musicInstrumentList(new Guitar("Fusions",25,"yellow","cord"));
        musicShop.musicInstrumentList(new Piano("Forte",75,"black","key"));
        musicShop.musicInstrumentList(new Tube("Porto",125,"gold","spiritual"));




        System.out.println("__________________________________________________________________________________");
        System.out.println("Type instrument \t | \t Firm \t | \t Volume \t | \t Color \t | \t Classifications  \t"	 );
        musicShop.musicInstrumentList.stream().forEach(instrument -> System.out.println(instrument));
        System.out.println("__________________________________________________________________________________");


        Set<MusicInstrument> sortedFirmList = new TreeSet<MusicInstrument>((o1, o2) -> o1.firm.compareTo(o2.firm));
        sortedFirmList.addAll(musicShop.musicInstrumentList);
        System.out.println("\n Sorted by Firm:");
        System.out.println("__________________________________________________________________________________");
        System.out.println("Type instrument \t | \t Firm \t | \t Volume \t | \t Color \t | \t Classifications  \t"	 );
        sortedFirmList.stream().forEach(instrument -> System.out.println(instrument));
        System.out.println("__________________________________________________________________________________");

        Set<MusicInstrument> sortedVolume = new TreeSet<MusicInstrument>((o1, o2) -> o1.volume - o2.volume);
        sortedVolume.addAll(musicShop.musicInstrumentList);
        System.out.println("\n Sorted by Volume:");
        System.out.println("__________________________________________________________________________________");
        System.out.println("Type instrument \t | \t Firm \t | \t Volume \t | \t Color \t | \t Classifications  \t"	 );
        sortedVolume.stream().forEach(instrument -> System.out.println(instrument));
        System.out.println("__________________________________________________________________________________");

    }
}

