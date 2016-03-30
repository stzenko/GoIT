package module8;

public class Guitar extends MusicInstrument{

    private String firm ;
    private int volume ;
    private String color ;
    private String classification ;


    public Guitar (final String firm, int volume, final String color, final String classification) {
        super(firm,volume,color,classification);
        this.firm = firm;
        this.volume = volume;
        this.color = color;
        this.classification = classification;
    }

    public String getFirm() {
        return firm;
    }

    public int getVolume() {
        return volume;
    }

    public String getColor() {
        return color;
    }

    public String getClassification() {
        return classification;
    }


    @Override
    public String toString() {
        return ("Guitar           " + "\t | \t" + firm + "\t | \t    " + volume + " \t\t | \t "+ color + "\t | \t"+ classification );
    }
    }



