/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.company;

import java.util.ArrayList;
import java.util.Arrays;


/**
 *
 * @author ancla
 */
public class NonFoodItem extends Item {
    
    private ArrayList<String> materials;
    
    public NonFoodItem(String name, double price, String[] materials)
    {
        super(name,price);
        this.materials = new ArrayList(Arrays.asList(materials));
    }
    
    public ArrayList getMaterials()
    {
        //Clone array to avoid external objects to alter materials list
        
        return new ArrayList(materials);
    }
    
    @Override
    public String toString()
    {
        String materialsText = "Materials: " + materials;
        return this.getName() + " " + this.getPrice() + " " + materialsText;
    }
}
