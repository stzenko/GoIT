package module8;

public class Guitar {
    private String firm ;
    private int volume ;
    private String color ;
    private String classification ;


        public Guitar (final String firm, int volume, final String color, final String classification) {

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
        return "Guitar{" +
                "firm='" + firm + '\'' +
                ", volume=" + volume +
                ", color='" + color + '\'' +
                ", classification='" + classification + '\'' +
                '}';
    }
}


