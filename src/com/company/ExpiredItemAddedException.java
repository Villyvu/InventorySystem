/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.company;

/**
 *
 * @author Thang og Thao
 */
public class ExpiredItemAddedException extends Exception {
    
    public ExpiredItemAddedException(){
        
           super("Attempted to add expired product to database");
        
    }
    
}
