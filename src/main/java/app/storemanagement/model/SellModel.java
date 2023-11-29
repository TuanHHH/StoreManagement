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
public class SellModel extends ProductModel{
    private String name;
    private int categoryId;
    private double unitPrice;
    private int quantityIncart;
    private List<ProductInCart> billHistory = new ArrayList<>();

    public SellModel(String name, int categoryId, double unitPrice, int quantityIncart, int id) {
        super(id);
        this.name = name;
        this.categoryId = categoryId;
        this.unitPrice = unitPrice;
        this.quantityIncart = quantityIncart;
    }

    public SellModel(int id) {
        super(id);
    }
    public int getQuantityIncart() {
        return quantityIncart;
    }

    public void setQuantityIncart(int quantityIncart) {
        this.quantityIncart = quantityIncart;
    }

    public void addBillHistory(ProductInCart bill){
        billHistory.add(bill);
    }
}
