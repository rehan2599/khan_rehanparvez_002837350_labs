/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author khanr
 */
public class Business {
    
   
    MasterOrderList masterorderlist;
    SupplierDirectory supplierdirectory;

    public Business() {
        
      
        
       masterorderlist = new MasterOrderList();
       supplierdirectory = new SupplierDirectory(); 
        
    }

    
    
    public MasterOrderList getMasterorderlist() {
        return masterorderlist;
    }

    public void setMasterorderlist(MasterOrderList masterorderlist) {
        this.masterorderlist = masterorderlist;
    }

    public SupplierDirectory getSupplierdirectory() {
        return supplierdirectory;
    }

    public void setSupplierdirectory(SupplierDirectory supplierdirectory) {
        this.supplierdirectory = supplierdirectory;
    }
    
    
    
    
    
}
