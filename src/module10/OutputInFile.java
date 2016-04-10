package module10;

import module8.*;
import module9.ShyfrCezarya;

import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * Created by Zenovii on 07.04.2016.
 */

public class OutputInFile {


    private static  Object S ;

    public static void reader()throws IOException {

        try  {

            BufferedReader reader = new BufferedReader(new FileReader("src\\module10\\norm.txt"));

            String S = null;
            while((S = reader.readLine()) != null) {
                String s = S;
                System.out.println(s);
            }
            reader.close();

        } catch(IOException e) {
            e.printStackTrace();
        }
    }

    public static void writer()
    {
       // String text = s.toString();
       // String code = ShyfrCezarya.toCodeString(musicInstrument);
      //  String decode = ShyfrCezarya.toDeCodeString(ShyfrCezarya.toCodeString(musicInstrument));

        Writer writer = null;
        try {
            writer = new FileWriter("src\\module10\\module10.txt");

            writer.write(String.valueOf(S + "\n"));
           //writer.write(String.valueOf(code + "\n"));
         //   writer.write(String.valueOf(decode + "\n"));
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




