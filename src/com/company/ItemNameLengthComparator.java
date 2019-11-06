/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.company;

import java.util.Comparator;

/**
 *
 * @author Villy
 */
public class ItemNameLengthComparator implements Comparator<Item> {

    @Override
    public int compare(Item o1, Item o2) {
        if(o1.getName().length() > o2.getName().length()){
            return 1;
        } 
        else if(o1.getName().length() < o2.getName().length()) {
            return -1;
        }
            return 0;
        
    }
    
}
