package main.module3.dz3_1;


/**
 * Created by Zenovii on 10.03.2016.
 */
public class NumberOfFiles {
    public static void main(String[] args) {

    AudioFile audioFile = new AudioFile();
    ImagesFile imagesFile = new ImagesFile();
    TextFile textFile = new TextFile();
    File file = new File();

        audioFile.audio();
        textFile.text();
        imagesFile.image();
        file.file();
    }
}
