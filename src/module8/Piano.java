package module8;

/**
 + * Created by Zenovii on 08.03.2016.
 + */
        public class Piano extends MusicInstrument{
    public String nameInstrument;
    public String firm;
    public int volume;
    public String color;
    public String classification;

    public Piano(String nameInstrument, final String firm, int volume, final String color, final String classification) {
        super(nameInstrument,firm,volume,color,classification);
          }

    @Override
    public String toString() {
        return (nameInstrument + firm + volume  + color + classification);
    }
    }
