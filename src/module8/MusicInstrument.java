package module8;

/**
 + * Created by Zenovii on 08.03.2016.
 + */

    public abstract class MusicInstrument{
    public String nameInstrument;
    public String firm;
    public int volume;
    public String color;
    public String classification;

    public MusicInstrument(final String nameInstrument, final String firm, int volume, final String color, final String classification) {
        this.nameInstrument =nameInstrument;
        this.firm = firm;
        this.volume = volume;
        this.color = color;
        this.classification = classification;
    }
    public abstract String toString();


    public int getBytes() {
        return 0;
    }
}