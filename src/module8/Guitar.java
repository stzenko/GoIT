package module8;

public class Guitar extends MusicInstrument{
    private String nameInstrument;
    private String firm ;
    private int volume ;
    private String color ;
    private String classification ;


    public Guitar (final String nameInstrument, final String firm, int volume, final String color, final String classification) {
        super(nameInstrument,firm,volume,color,classification);
        this.nameInstrument =nameInstrument;
        this.firm = firm;
        this.volume = volume;
        this.color = color;
        this.classification = classification;
    }

    @Override
   public String toString()
    {return (nameInstrument  + firm  + volume  + color + classification );
    }
    }



