/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package app.storemanagement.model;

import java.util.ArrayList;
import java.util.List;


/**
 *
 * @author Tuan
 */
public class ProductInCart extends ProductModel {
    private String name;
    private double unitPrice;
    private int quantityIncart;
    private List<ProductInCart> billHistory = new ArrayList<>();
    public ProductInCart(int id,String name, double unitPrice, int quantityIncart) {
        super(id);
        this.name = name;
        this.unitPrice = unitPrice;
        this.quantityIncart = quantityIncart;
    }
    public ProductInCart(int id) {
        super(id);
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public double getUnitPrice() {
        return unitPrice;
    }

    @Override
    public void setUnitPrice(double unitPrice) {
        this.unitPrice = unitPrice;
    }

    public int getQuantityIncart() {
        return quantityIncart;
    }

    public void setQuantityIncart(int quantityIncart) {
        this.quantityIncart = quantityIncart;
    }

    public void addBillHistory(ProductInCart product){
            billHistory.add(product);
        }
        
    }
    
//    public void
    
    
    
