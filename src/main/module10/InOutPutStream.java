package main.module10;

import main.module8.*;
import main.module9.ShyfrCezarya;

import java.io.BufferedReader;
import java.io.*;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * Created by Zenovii on 07.04.2016.
 */

public class InOutPutStream {

    private static final String FILE_NAME_INPUT = "src\\module10\\norm.txt";

    public static String readFromFile(String fileName) throws IOException {
        BufferedReader br = new BufferedReader(new FileReader(new File(fileName)));
        String str = null;
        StringBuilder sb = new StringBuilder();
        while ((str = br.readLine()) != null) {
            String[] arrayWords = str.split(",");
            for (String s : arrayWords) {
                sb.append(s + "\n");
            }
        }
        return sb.toString();
    }

    public static String writer() throws IOException {
        String in = readFromFile(FILE_NAME_INPUT).toString();
        String code = ShyfrCezarya.toCodeString(in);
        String decode = ShyfrCezarya.toCodeString(ShyfrCezarya.toDeCodeString(in));

        Writer writer = null;
        try {
            writer = new FileWriter("src\\module10\\module10.txt");

            writer.write(String.valueOf(in + "\n"));
            writer.write(String.valueOf(code + "\n"));
            writer.write("\n");
            writer.write(String.valueOf(decode + "\n"));
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
        return in.toString();
    }
}




