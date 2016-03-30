package module8;

import java.io.File;

/**
 + * Created by Zenovii on 08.03.2016.
 + */

    public abstract class MusicInstrument{

    public String firm;
    public int volume;
    public String color;
    public String classification;

    public MusicInstrument(final String firm, int volume, final String color, final String classification) {

        this.firm = firm;
        this.volume = volume;
        this.color = color;
        this.classification = classification;
    }
    public abstract String toString();
}