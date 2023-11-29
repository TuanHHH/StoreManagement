/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package app.storemanagement.controller;

import app.storemanagement.model.SellModel;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author Tuan
 */
public class SellCtrl implements BaseController<SellModel>{
    private Connection conn;

    public SellCtrl(Connection conn) {
        this.conn = conn;
    }
    @Override
    public boolean add(SellModel sell){
        return false;
    }
    
    public boolean update(){
        return false;
    }
    
    public boolean update_to_cart(int quantity,String Product_ID){
        String sql ="UPDATE Product Set Quantity_In_Stock = Quantity_In_Stock - ? WHERE Product_ID = ?";
        try(PreparedStatement pstmt = conn.prepareStatement(sql)){
            pstmt.setInt(1,quantity);
            pstmt.setString(2, Product_ID);
            pstmt.executeUpdate();
            return true;
        }catch(SQLException e){
            JOptionPane.showMessageDialog(null, "Error: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
            return false;
        }
    }
    
    public boolean drop_from_cart(int quantity,String Product_ID){
        String sql ="UPDATE Product Set Quantity_In_Stock = Quantity_In_Stock + ? WHERE Product_ID = ?";
        try(PreparedStatement pstmt = conn.prepareStatement(sql)){
            pstmt.setInt(1,quantity);
            pstmt.setString(2,Product_ID );
            return true;
        }catch(SQLException e){
            JOptionPane.showMessageDialog(null, "Error: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
            return false;
        }
    }
    
    @Override
    public boolean delete(SellModel sell){
        return false;
    }

    @Override
    public boolean update(SellModel entity) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
    
    
}
