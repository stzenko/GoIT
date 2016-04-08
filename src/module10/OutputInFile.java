package module10;


import module8.*;
import module9.ShyfrCezarya;

import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;
import java.util.ArrayList;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * Created by Zenovii on 07.04.2016.
 */
public class OutputInFile {
    public static void main(String[] args) throws Exception {
        MusicShop musicShop = new MusicShop();
        musicShop.initShop();

        ArrayList <MusicInstrument> musicInstrument = musicShop.getMusicInstrument();
        String text = musicInstrument.toString();
        String code = ShyfrCezarya.toCodeString(musicInstrument);
        String decode = ShyfrCezarya.toDeCodeString(ShyfrCezarya.toCodeString(musicInstrument));

        Writer writer = null;
            try {
                writer = new FileWriter("src\\module10\\module10.doc");

                    writer.write(String.valueOf(text+"\n"));
                    writer.write(String.valueOf(code+"\n"));
                    writer.write(String.valueOf(decode+"\n"));
                    writer.write(System.getProperty("line.separator"));

                writer.flush();
            } catch (Exception e) {
                Logger.getLogger(InstrumentExemple.class.getName()).log(Level.SEVERE, null, e);
            } finally {
                if (writer != null) {
                    try {
                        writer.close();
                    } catch (IOException ex) {
                    }
                }
        }
    }
}


