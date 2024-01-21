/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package i2putility.components;
import java.sql.Statement;
import java.sql.Connection;
import java.sql.DriverManager;

/**
 *
 * @author Alee
 */
public class Database {
    private Connection connect=null;
    private Statement statement;
    private Boolean ConnectionSuccess = false;
    public Boolean connect(String dbname, String user , String password ){
        try{
            
            Class.forName("org.postgresql.Driver");
            this.connect= DriverManager.getConnection("jdbc:postgresql://localhost:5432/"+dbname,user,password);
            if(this.connect!=null)
             {
                ConnectionSuccess = true;
            }
            else{
                return ConnectionSuccess;
            }
        }
        catch(Exception e)
        {
            return ConnectionSuccess;
        }
        return ConnectionSuccess;
    }
    
    public Boolean updateUserPassword(String admin,String password ){
        try{
            String updateQuery=" Update tbl_user set password='"+password+"' where username like '"+admin+"' ;";
            statement=connect.createStatement();
            statement.executeUpdate(updateQuery);
            ConnectionSuccess = true;
        }
        catch (Exception e)
        {
            ConnectionSuccess = false;
        }
        return ConnectionSuccess;
    }


}
