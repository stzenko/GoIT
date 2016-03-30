package module8;

/**
 + * Created by Zenovii on 08.03.2016.
 + */
        public class Piano {
    public String firm;
    public int volume;
    public String color;
    public String classification;

    public Piano(final String firm, int volume, final String color, final String classification) {
        this.firm = firm;
        this.volume = volume;
        this.color = color;
        this.classification = classification;
    }

    @Override
    public String toString() {
      //      ("Type instrument \t | \t Firm \t | \t Volume \t | \t Color \t | \t Classifications \t"	 );

       return ("Piano           " + "\t | \t" + firm + "\t | \t    " + volume + " \t\t | \t "+ color + "\t | \t"+ classification);
    }
}
