/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package supermarket;

/**
 *
 * @author SimranDeep Singh
 */
public class user {
    
    private int productid;
    private String productname;
    private int quantity;
    private int amount;
    private String description;
    
    public user(int pid, String pname, int pquantity, int pamount,String pdes)
    {
        this.productid = pid;
        this.productname = pname;
        this.quantity =pquantity ;
        this.amount = pamount;
        this.description=pdes;
    }
    
    public int getId()
    {
        return productid;
    }
    
    public String getName()
    {
        return productname;
    }
    
    public int getquantity()
    {
        return quantity;
    }
    
    public int getamount()
    {
        return amount;
    }
        public String getdes()
    {
        return description;
    }
    
}
