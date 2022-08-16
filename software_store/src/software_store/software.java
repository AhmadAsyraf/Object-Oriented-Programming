/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package software_store;

/**
 *
 * @author LENOVO
 */
public class software {
    String softwareName;
    String softwareType;
    double price;
    
      // default constructor
    public void Software() 
    {
        softwareName = " ";
        softwareType = " ";
        price = 0.0;
    }
    
     // copy constructor
    public void Software(software software) 
    {
        this.softwareName = software.softwareName;
        this.softwareType = software.softwareType;
        this.price = software.price;
    }
    //mutator method 
    public void setData(String software_Name, String software_Type, double prices)
    {
        softwareName = software_Name;
        softwareType = software_Type;
        price = prices;

    }
    // accessor method
    public String getSoftwareName() {
        return softwareName;
    }

    public String getSoftwareType() {
        return softwareType;
    }

    public double getPrice() {
        return price;
    }
    //printer method
    public String toString()
    {
        return "Software Name = " + softwareName + "\nSoftware Type = " + softwareType + "\nPrice = RM " + price;
     }
}
