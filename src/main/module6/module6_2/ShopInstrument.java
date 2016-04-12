package main.module6.module6_2;

import java.util.*;

/**
 * Created by Zenovii on 31.03.2016.
 */
public class ShopInstrument {
    public static void main(String[] args) {
        Map<String, Integer> shop = new HashMap<>();

        shop.put("Forte", 25);
        shop.put("Guitar", 38);
        shop.put("Tube", 59);

        System.out.println("The store is");
        Set<Map.Entry<String, Integer>> set = shop.entrySet();
        for (Map.Entry<String, Integer> s : set) {
            System.out.println(s.getKey() + ":\t\t" + s.getValue());
        }
        System.out.println();
        int forte = shop.get("Forte");
        shop.put("Forte", forte - 2);
        int guitar = shop.get("Guitar");
        shop.put("Guitar", guitar - 3);
        int tube = shop.get("Tube");
        shop.put("Tube", tube - 5);

        if ((shop.get("Forte") <= 0)||(shop.get("Guitar")<=0)||(shop.get("Tube")<=0)) {
            System.out.println("Error, product expired");
        }

        else {
            System.out.println(" The store remained");
        Set<Map.Entry<String, Integer>> set2 = shop.entrySet();
        for (Map.Entry<String, Integer> s : set2) {
            System.out.println(s.getKey() + ":\t\t" + s.getValue());}
        }
    }
    }

