/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package software_store;

import java.util.*;

/**
 *
 * @author LENOVO
 */
public class Software_store {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        software [] array;
        array  = new software[2];
        array[0] = new software();
          
        Scanner input = new Scanner(System.in);
          
        String softwareName, softwareType;
        double price;
          
        for(int i = 0; i<array.length; i++ )
        {        
          
          System.out.println("Enter software name: ");
          softwareName = input.nextLine();
          
          System.out.println("Enter type: ");
          softwareType = input.nextLine();
          
          System.out.println("price:");
          price = input.nextDouble();
          input.nextLine();
          
          array[i] = new software();
          array[i].setData(softwareName,softwareType,price);
        }
        
        //highest price
        int highest_price = 0;
        
        for (int i = 0; i <array.length; i++)
        {
            if(array[i].getPrice()>array[highest_price].getPrice())
            {
                highest_price = i;
            }
        }
        System.out.println("\n");
        System.out.println("\n     Highest Price" + "\n_______________________" + "\n" + array[highest_price] + "\n_______________________" );
    }
    
}
