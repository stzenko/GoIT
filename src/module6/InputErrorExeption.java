package module6;

/**
 * Created by Zenovii on 26.03.2016.
 */
public class InputErrorExeption extends Exception {
    double siteA,siteB;
    public InputErrorExeption(double siteA){
        this.siteA = siteA;
    }
    public double getSiteA(){
        return siteA;
    }


}
