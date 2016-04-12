package main.module8;

/**
  * Created by Zenovii on 08.03.2016.
  */

public class Tube extends MusicInstrument{


    public Tube(final String nameInstrument, final String firm, int volume, final String color, final String classification) {
        super(nameInstrument,firm,volume,color,classification);

    }

    @Override
    public String toString() {
        return ( nameInstrument  + firm +  volume +  color + classification);
    }
}