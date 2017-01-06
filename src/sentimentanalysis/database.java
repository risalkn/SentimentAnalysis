/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package sentimentanalysis;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

/**
 *
 * @author TOSHIBA
 */
public class database {
    Connection cn=null;
    ResultSet rs=null;
    Statement st=null;
    public database()
    {
        try
        {
            Class.forName("com.mysql.jdbc.Driver");
            cn=DriverManager.getConnection("jdbc:mysql://localhost/db_ssa","root","root");
        }
        catch(Exception ex)
        {
           System.out.println("ex"); 
        }
    }
    public boolean insert(String str)
    {
        boolean b=false;
            try
            {
                st=cn.createStatement();
                st.executeUpdate(str);
                b=true;
            }
            catch(Exception e)
                    {
                        
                    }
            return b;
    }
    public ResultSet select(String selQry)
    {
        try
            {
                st=cn.createStatement();
                rs=st.executeQuery(selQry);
            }
            catch(Exception e)
                    {
                        
                    }
            return rs;
    }
    
}
