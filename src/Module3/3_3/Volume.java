/**
 * Created by Zenovii on 08.03.2016.
 */
public class Volume {
    public static void main(String[] args) {
        Piano f = new Piano();
        Guitar g = new Guitar();
        Tube t = new Tube();
        MusicInstrument m = new MusicInstrument();

        m.ins();
        f.piano();
        g.guitar();
        t.tube();
    }
}

