package module10;


import module8.*;

import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * Created by Zenovii on 07.04.2016.
 */
public class OutputInFile {
    public static void main(String[] args) throws Exception {
        MusicShop musicShop = new MusicShop();

            List<String> musicInstrumentList = new ArrayList<>();
            Writer writer = null;
            try {
                writer = new FileWriter("fil1e.txt");
                for (String line : musicInstrumentList) {
                    writer.write(line);
                    writer.write(System.getProperty("line.separator"));
                }
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


