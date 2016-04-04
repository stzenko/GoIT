package module6.module6_2;

import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

/**
 * Created by Zenovii on 31.03.2016.
 */
public class ShopInstrument {
    public static void main(String[] args) {
        TreeMap<String, Integer> shop = new TreeMap<>();

        shop.put("Forte", 25);
        shop.put("Guitar", 38);
        shop.put("Tube", 9);

       System.out.println(shop);
        Set<Map.Entry<String, Integer>> set = shop.entrySet();
        for(Map.Entry<String, Integer> s:set ){
            System.out.println(s.getKey()+":\t\t"+s.getValue());
        }
    }
}