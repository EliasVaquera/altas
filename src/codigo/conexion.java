/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package codigo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;


/**
 *
 * @author NORTH TECNO PC
 */
public class conexion {
    public static String driver="com.mysql.cj.jdbc.Driver";
    public static String user="root";
    public static String password="123456";
    public static String url="jdbc:mysql://localhost:3306/bddsistema";
    
    public static Connection conectando(){
        Connection con =null;
    try{
    Class.forName("com.mysql.cj.jdbc.Driver");
    con=DriverManager.getConnection(url, user, password);
    
    JOptionPane.showMessageDialog(null,"Conexion exitosa");
            }catch(SQLException ex){
JOptionPane.showMessageDialog(null,"Error SQLException");
}catch(ClassNotFoundException ex){
    JOptionPane.showMessageDialog(null,"Error ClassNotFoundException");
}
    return con; }
   
   
  
}
