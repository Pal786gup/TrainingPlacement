/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trandpl.dbutil;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author dell
 */
public class DBConnection {
    private final static String DB_URL="jdbc:oracle:thin:@//localhost:1521/xe";
    private final static String DB_USER_NAME="tnp";
    private final static String DB_PASS="project";

    private static Connection conn;
    
    static{
                try{
                    Class.forName("oracle.jdbc.OracleDriver");
                    conn=DriverManager.getConnection(DB_URL, DB_USER_NAME, DB_PASS);
                    JOptionPane.showMessageDialog(null, "Connected successfully to DB");                  
                }
                catch(ClassNotFoundException ex){
                    JOptionPane.showMessageDialog(null, "Error in driver loading:"+ex.getMessage());
                    ex.printStackTrace();
                }
                catch(SQLException ex){
                    JOptionPane.showMessageDialog(null, "Error in opening the conn to DB:"+ex.getMessage());
                    ex.printStackTrace();
                }
                
    }
    public static Connection getConnection(){
        return conn;
    }
    public static void closeConnection(){
        try{
            conn.close();
            JOptionPane.showMessageDialog(null, "DisConnected successfully from the DB");
        }
        catch(SQLException ex){
                    JOptionPane.showMessageDialog(null, "Error in closing the conn to DB:"+ex.getMessage());
                    ex.printStackTrace();
                }
        
    }
}
