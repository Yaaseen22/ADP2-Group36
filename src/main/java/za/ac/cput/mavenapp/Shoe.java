/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package za.ac.cput.mavenapp;

/**
 *
 * @author yaase
 */
public class Shoe {
     private String brand;
    private String colour;
    private int ShoeSize;
    
    public Shoe()
    {}
    
    public Shoe(String brand, String colour, int ShoeSize)
    {
        this.brand = brand;
        this.colour = colour;
        this.ShoeSize = ShoeSize;
    }
    
    public String getBrand()
    {
        return this.brand;
    }
    
    public String getColour(){
        return this.colour;
    }
    
    public int getShoeSize(){
        return this.ShoeSize;
    }
    
    public void setBrand(String brand){
        this.brand = brand;
    }
    
    public void setColour(String colour){
        this.colour = colour;
    }
    
    public void setShoeSize(int ShoeSize){
        this.ShoeSize = ShoeSize;
    }
    
     @Override
    public String toString()
    {
        String str = String.format("Shoe Details: \nBrand: %s \nColour: %s \nShoe Size: %d", this.brand, this.colour, this.ShoeSize);
        return str;
    }
     
}
