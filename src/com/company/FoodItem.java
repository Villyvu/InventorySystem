/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.company;

import java.util.Date;

/**
 *
 * @author ancla
 */
public class FoodItem extends Item {
    
    private Date expires;
    private Date actualDate = new Date();
    
    public FoodItem(String name, double price, Date expires) // throws ExpiredItemAddedException
    {   
       
        super(name,price);
        this.expires = expires;
       /* if(expires.compareTo(actualDate) < 0){
            throw new ExpiredItemAddedException();
        }*/
        
    }
    
    public Date getExpires()
    {
        return this.expires;
    }
    
    @Override
    public String toString()
    {
        return this.getName() + " " + this.getPrice() + " " + this.expires;
    }
    
    @Override
    public boolean isExpired(){
        return this.actualDate.compareTo(expires) > 0;
        
    }
    
   
}
