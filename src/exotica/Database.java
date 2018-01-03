/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exotica;
import java.sql.Connection;
import java.sql.DriverManager;
import javax.swing.JOptionPane;

/**
 *
 * @author KARTI
 */
public class Database {
   /*Connection db;
   public Database(){
    try{
    
        //db=DriverManager.getConnection("jdbc:mysql://localhost/exotica", "root", "");
        db=DriverManager.getConnection("jdbc:mysql://localhost/exotica", "root", "");
   }
   catch(Exception e)
   {
       System.out.println(e.getMessage());
   }
    
}*/
    
    Connection db;
    public Database()
    {
        try
        {
            db=DriverManager.getConnection("jdbc:mysql://localhost/exotica", "root", "");
        }
        catch(Exception e)
    {
        System.out.println(e.getMessage());
    }
    }
}
