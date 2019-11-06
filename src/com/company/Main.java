package com.company;

import java.util.Date;

public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws ExpiredItemAddedException {
        Inventory inv = new Inventory();

        Item food1 = new FoodItem("Food Item123 "+4, 1000 * Math.random(), new Date(123 ));
        Item food = new FoodItem("Food Item1123123123 "+3, 1000 * Math.random(), new Date());



        inv.addItem(food);
        //System.out.println("The "+food.toString()+ " is expired: "+food.isExpired());
        inv.addItem(food1);
         /*
       for(int i = 0; i < 3; i++)
        {
            inv.addItem(new FoodItem("Food Item " + i, 1000 * Math.random(), new Date()));
        }
             
        */
        for(int i = 0; i < 3; i++)
        {
            inv.addItem(new NonFoodItem("Non-food Item " + i, 1000 * Math.random(), new String[]{"Material 1", "Material 2"}));
        }
        /*
        System.out.println();
        inv.printInventory();
        System.out.println();
        inv.removeExpiredFoods2();
        System.out.println();
        inv.printInventory();
        
        ItemNameLengthComparator compare = new ItemNameLengthComparator();
        System.out.println(food.compareTo(food1));
        System.out.println();
        System.out.println(compare.compare(food, food1));
        System.out.println();
        
        System.out.println("Unsorted: ");
        inv.printInventory();
        inv.sortedByPrice();
        inv.sortedByNameLength();
        System.out.println();
        System.out.println("Sorted by price: ");
        inv.printInventory();
        System.out.println();
        System.out.println("Sorted by name length: ");
        inv.printInventory();
        */


    }

}
