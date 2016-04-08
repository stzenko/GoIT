package module9;

import module8.*;

import java.util.ArrayList;


/**
 * Created by Zenovii on 12.03.2016.
 */
public class ShyfrCezarya {

    static int number = 26;
    static int crack = 2;
    static int EnglishBigStart = 65;
    static int EnglishBigFinish = 90;
    static int EnglishSmallStart = 97;
    static int EnglishSmallFinish = 122;

    static char[] ascii = new char[256];

    public static void asciiCod() {
        for (int i = 0; i < ascii.length; i++) {
            ascii[i] = (char) i;
        }
    }

    public static String toCodeString(ArrayList<MusicInstrument> instruments) {
        asciiCod();
        char[] originalChar = instruments.toString().toCharArray();

        char[] codedChar = new char[originalChar.length];

        StringBuilder cipher = new StringBuilder();

        for (int i = 0; i < originalChar.length; i++) {
            for (int a = 0; a < number; a++) {
                int cezarCipher = (a + crack) % number;
                if (originalChar[i] == ascii[EnglishBigStart + a]) {
                    codedChar[i] = ascii[EnglishBigStart + cezarCipher];
                }
                if (originalChar[i] == ascii[EnglishSmallStart + a]) {
                    codedChar[i] = ascii[EnglishSmallStart + cezarCipher];
                }
            }
            for (int a = 0; a < ascii.length; a++)
                if ((originalChar[i] == ascii[a] && ascii[a] < ascii[EnglishBigStart])
                        || (originalChar[i] == ascii[a] && ascii[a] > ascii[EnglishBigFinish] && ascii[a] < ascii[EnglishSmallStart])
                        || (originalChar[i] == ascii[a] && ascii[a] > ascii[EnglishSmallFinish]))
                {
                    codedChar[i] = ascii[a];
                }
        }
        for (char c : codedChar) {
            cipher.append(c);
        }
        String codedString = cipher.toString()
                .replace("[", "")
                .replace("]", "")
                .trim();
        return codedString;
    }

    public static String toDeCodeString(String cipher) {

        char[] codedChar = cipher.toString().toCharArray();

        char[] decodedChar = new char[codedChar.length];

        StringBuilder deCipher = new StringBuilder();

        for (int i = 0; i < codedChar.length; i++) {
            for (int a = 0; a < number; a++) {
                int cezarDeCipher = (a - crack+number) % number;
                if (codedChar[i] == ascii[EnglishBigStart + a]) {
                    decodedChar[i] = ascii[EnglishBigStart + cezarDeCipher];
                }
                if (codedChar[i] == ascii[EnglishSmallStart + a]) {
                    decodedChar[i] = ascii[EnglishSmallStart + cezarDeCipher];
                }
            }
            for (int a = 0; a < ascii.length; a++)
                if ((codedChar[i] == ascii[a] && ascii[a] < ascii[EnglishBigStart])
                        || (codedChar[i] == ascii[a] && ascii[a] > ascii[EnglishBigFinish] && ascii[a] < ascii[EnglishSmallStart])
                        || (codedChar[i] == ascii[a] && ascii[a] > ascii[EnglishSmallFinish]))
                {
                    decodedChar[i] = ascii[a];
                }
        }
        for (char c : decodedChar) {
            deCipher.append(c);
        }
        String deCodedString = deCipher.toString()
                .replace("[", "")
                .replace("]", "")
                .trim();
        return deCodedString;
    }
}