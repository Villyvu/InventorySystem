/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.company;

/**
 *
 * @author ancla
 */
public abstract class Item implements Expireable, Comparable<Item> {
    private String name;
    private double price;
    
    public Item(String name, double price)
    {
        this.name = name;
        this.price = price;
    }
    
    public final String getName()
    {
        return this.name;
    }
    
    public final double getPrice()
    {
        return this.price;
    }

    @Override
    public boolean isExpired() {
        throw new UnsupportedOperationException("Item does not support this operation."); //To change body of generated methods, choose Tools | Templates.
    }
    
    @Override
    public int compareTo(Item item){
        if (this.price > item.getPrice()){
            return 1;
        }
        else if (this.price < item.getPrice()){
            return -1;
        }
            return 0;      
        
    }

    
   
}
