package module8;

public class Guitar extends MusicInstrument{


    public Guitar (final String nameInstrument, final String firm, int volume, final String color, final String classification) {
        super(nameInstrument,firm,volume,color,classification);
    }

    @Override
   public String toString()
    {return (nameInstrument  + firm  + volume  + color + classification );
    }
    }



