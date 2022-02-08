/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package codigo;

import java.sql.SQLException;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Connection;

public class codigoSQL {

public conexion c1= new conexion();
public PreparedStatement ps = null;
public ResultSet rs=null;
public int retorno=0;

public int guardarDatosCliente(String nombre,String direccion,String telefono)
{
Connection con=null;
try{
con =conexion.conectando();
ps=con.prepareStatement("INSERT INTO clientes(nombre, direccion, telefono) VALUES(?,?,?)");
ps.setString(1, nombre);
ps.setString(2, direccion);
ps.setString(3, telefono);
retorno=ps.executeUpdate();
ps.close();
}catch(Exception e){
System.out.println("Ha ocurrido un error"+ e);
}
return retorno;
}
public int guardarDatosProducto(String nombre,String descripcion,Double precio)
{
Connection con=null;
try{
con =conexion.conectando();
ps=con.prepareStatement("INSERT INTO productos(nombre, descripcion, precio) VALUES(?,?,?)");
ps.setString(1, nombre);
ps.setString(2, descripcion);
ps.setDouble(3, precio);
retorno=ps.executeUpdate();
ps.close();
}catch(Exception e){
System.out.println("Ha ocurrido un error"+ e);
}
return retorno;
}

public int guardarProveedor(String nombre, String direccion, int telefono){
Connection con=null;
try{
con=conexion.conectando();
ps=con.prepareStatement("INSERT INTO proveedores(nombre,direccion, telefono) VALUES(?,?,?)");
ps.setString(1, nombre);
ps.setString(2, direccion);
ps.setInt(3, telefono);
retorno=ps.executeUpdate();
ps.close();
}catch(Exception e){
System.out.println("Ha ocurrido un error"+ e);
}
return retorno;
}
}


