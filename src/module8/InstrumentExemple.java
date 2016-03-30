package module8;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Zenovii on 08.03.2016.
 */
public class  InstrumentExemple {
    public static void main(String[] args) {

        final List<Guitar> guitarArrayList= new ArrayList<Guitar>();
        final List<Piano> pianoArrayList=new ArrayList<Piano>();
        final List<Tube> tubesArrayList=new ArrayList<Tube>();
        guitarArrayList.add(new Guitar("Counter",30,"red","cord"));
        guitarArrayList.add(new Guitar("Fusions",25,"yellow","cord"));
        pianoArrayList.add(new Piano("Forte",75,"black","key"));
        tubesArrayList.add(new Tube("Porto",125,"gold","spiritual"));

     guitarArrayList.stream().forEach(guitar -> System.out.println(guitar));
        pianoArrayList.stream().forEach(piano -> System.out.println(piano));
        tubesArrayList.stream().forEach(tube -> System.out.println(tube));

    }
}

