package org.launchcode.java.demos.lsn7interfaces;

import java.util.ArrayList;
import java.util.Comparator;

public class Main {
    public static void main(String[] args){
        Case menu = new Case();
        System.out.println(menu);
        System.out.println("===================");
        ArrayList<Flavor> flavors = menu.getFlavors();
        System.out.println(flavors);
        System.out.println("===========");
        ArrayList<Cone> cones = menu.getCones();
        System.out.println(cones);
        System.out.println("===========");
        ArrayList<Topping> toppings = menu.getToppings();

        // TODO: Use a Comparator class to sort the 'flavors' array alphabetically by the 'name'
        //  field.
        Comparator comparator = new FlavorComparator();
        for (Flavor flavor : flavors) {
            System.out.println(flavor);
        }
        System.out.println("===========");
        flavors.sort(comparator);
        for (Flavor flavor : flavors) {
            System.out.println(flavor);
        }
        System.out.println("===========");
        // TODO: Use a Comparator class to sort the 'cones' array in increasing order by the 'cost'
        //  field.

        Comparator comparator1 = new ConeComparator();
        for (Cone cone : cones) {
            System.out.println(cone);
        }
        System.out.println("===========");
        cones.sort(comparator1);
        for (Cone cone : cones) {
            System.out.println(cone);
        }


        // TODO: Print the 'flavors' and 'cones' lists (in a clear manner) to verify the sorting.
        System.out.println("===========");
        Comparator comparator3 = new ToppingComparator();
        for (Topping topping : toppings) {
            System.out.println(topping);
        }
        System.out.println("===========");
        toppings.sort(comparator3);
        for (Topping topping : toppings) {
            System.out.println(topping);
        }


    }
}
