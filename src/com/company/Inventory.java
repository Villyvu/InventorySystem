/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.company;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

/**
 *
 * @author ancla
 */
public class Inventory {
    private ArrayList<Item> items = new ArrayList<>();
    
    public Inventory()
    {
       
        
    }
    
    public void addItem(Item item) throws ExpiredItemAddedException
    {
        
        if(item instanceof FoodItem && item.isExpired()){
                throw new ExpiredItemAddedException();
            }
        
        this.items.add(item);
    }
    
    public void removeItem(Item item)
    {
        this.items.remove(item);
    }
    
    public double getInventoryValue()
    {
        double sum = 0.0;
        for(Item item : items)
        {
            sum += item.getPrice();
        }
        
        return sum;
    }
    
    public void printInventory()
    {
        for(Item item : items)
        {
            System.out.println(item);
        }
    }
    
    public void removeExpiredFoods2(){
        Iterator<Item> it = items.iterator();
        while(it.hasNext()){
            Item item = it.next();
            try {
            if(item.isExpired()){
                it.remove();
                System.out.println("The " + item + " was removed as it was expired");        
            }
            else {
                System.out.println("This Fooditem isnt expired: "+item);
            }
            } catch(Exception e) {
                
                System.out.println("This NonFoodItem cant expire: "+item);
            }
            
        }
    }
    public void removeExpiredFoods(){
        try {
            for (Item item : items) {
                if(item.isExpired()){
                    items.remove(item);
                    System.out.println(item+" is EXPIRED!");
                }
            }
        } catch (Exception e) {
        }
    }
    
    public void sortedByNameLength(){
        Collections.sort(items, new ItemNameLengthComparator());
    }
    public void sortedByPrice(){
        Collections.sort(items);
    }
}
