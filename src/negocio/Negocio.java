/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package negocio;

import gestióngamingcenter.General;
import java.awt.CardLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.KeyAdapter;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.JLabel;
import javax.swing.JTextField;
import java.sql.*;
import java.util.Arrays;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JButton;
import javax.swing.JOptionPane;

/**
 *
 * @author levi
 */

public class Negocio {    
  //<editor-fold defaultstate="collapsed" desc="gestión general de campos">
        //IMAGENES EN JLABEL
        public void setImageLabel(JLabel label, String img){
            rsscalelabel.RSScaleLabel.setScaleLabel(label, img);
        }   
        //COLOR A BOTONES
        public void colorBotones(JButton c){
            c.setBackground(new Color(188, 255, 255));
            c.setFont(new Font("Dialog", Font.BOLD, 12));
        }
//</editor-fold>

  //<editor-fold defaultstate="collapsed" desc="control de errores">
    public boolean isTelephone(String num){
        Pattern pat = Pattern.compile("[6]\\d{8}");   
        Matcher mat = pat.matcher(num);
        Integer.parseInt(num);
        return mat.find(); 
    }
    public boolean isPostalCode(String num){
        Pattern pat = Pattern.compile("\\d{5}");   
        Matcher mat = pat.matcher(num);
        Integer.parseInt(num);
        return mat.find(); 
    }
    public boolean isEmail(String email){
       Pattern pat = Pattern.compile("^[\\w-]+(\\.[\\w-]+)*@[A-Za-z0-9]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})$");   
       Matcher mat = pat.matcher(email);
       return mat.find();
    }
    public boolean isDNI(String DNI){
        Pattern pat = Pattern.compile("\\d{8}[A-Z]{1}");
        Matcher mat = pat.matcher(DNI);
        return mat.find();
    }
//</editor-fold>

 //<editor-fold defaultstate="collapsed" desc="gestión de la base de datos">
    final String DB_USER = "root";
    final String DB_PASS = "12345678";
    final String DB_ROUTE = "jdbc:mysql://localhost";
    final String DB_ROUTE_COMPLETE = "jdbc:mysql://localhost/gamingcenter";
    Connection connection;
    Statement sentencia;
    public void crearConexión(){
        //CONEXIÓN A LA BASE DE DATOS
            try {
                connection = DriverManager.getConnection(DB_ROUTE, DB_USER, DB_PASS);
                System.out.println("Se conecto con mySQL");
                sentencia = connection.createStatement();
                sentencia.executeUpdate("CREATE DATABASE IF NOT EXISTS gamingCenter");
            } catch (SQLException ex) {
                Logger.getLogger(Negocio.class.getName()).log(Level.SEVERE, null, ex);
                System.out.println("No se conecto con mySQL");
            }
            //CREACIÓN DE LAS TABLAS
            //CLIENTES
            String tablaClientes = "CREATE TABLE IF NOT EXISTS clientes("
                    + "DNI VARCHAR(9) PRIMARY KEY UNIQUE NOT NULL,"
                    + "nombre VARCHAR(150) NOT NULL,"
                    + "apellidos VARCHAR(150) NOT NULL,"
                    + "telefono integer NOT NULL,"
                    + "email VARCHAR(100) NOT NULL,"
                    + "direccion VARCHAR(100) NOT NULL,"
                    + "CP integer NOT NULL"
                    + ");";
            crearTablas(tablaClientes);
            //EQUIPOS
            String tablaEquipos = "CREATE TABLE IF NOT EXISTS equipos("
                    + "ID VARCHAR(15) PRIMARY KEY UNIQUE NOT NULL,"
                    + "estado VARCHAR(15) NOT NULL,"
                    + "hardware VARCHAR(150) NOT NULL,"
                    + "software VARCHAR(150) NOT NULL,"
                    + "PVP FLOAT NOT NULL"
                    + ");";
            crearTablas(tablaEquipos);
    }
    
    private void crearTablas(String tabla){
            try {
                connection = DriverManager.getConnection(DB_ROUTE, DB_USER, DB_PASS);
                sentencia = connection.createStatement();
                sentencia.executeUpdate("use gamingcenter");
                sentencia.executeUpdate(tabla);
            } catch (SQLException ex) {
                Logger.getLogger(Negocio.class.getName()).log(Level.SEVERE, null, ex);
            }
    }
    
    //<editor-fold defaultstate="collapsed" desc="CLIENTES">
    public void insertarCliente(String[] datos){
        String DNI = datos[0];
        String nombre = datos[1];
        String apellidos = datos[2];
        int telefono = Integer.parseInt(datos[3]);
        String email = datos[4];
        String direccion = datos[5];
        int codPostal = Integer.parseInt(datos[6]);
        
        String insertCli = "INSERT INTO clientes VALUES('"
                + DNI + "','" + nombre + "','" + apellidos + "'," + telefono + ",'" + email + "','" + direccion + "'," + codPostal + ");";
            try {
                connection = DriverManager.getConnection(DB_ROUTE_COMPLETE, DB_USER, DB_PASS);
                sentencia = connection.createStatement();
                sentencia.executeUpdate(insertCli);
            } catch (SQLException ex) {
                Logger.getLogger(Negocio.class.getName()).log(Level.SEVERE, null, ex);
            }
    }
    
    public void eliminarCliente(String DNI){
        String DelCli = "DELETE FROM clientes WHERE DNI = '" + DNI + "';";
        String getInfoCli = "SELECT * FROM clientes WHERE DNI = '" + DNI + "';";
        try {
            connection = DriverManager.getConnection(DB_ROUTE_COMPLETE, DB_USER, DB_PASS);
            sentencia = connection.createStatement();
            ResultSet rs = sentencia.executeQuery(getInfoCli);
            String infoCli = null;
            while(rs.next()){
                infoCli="DNI: " + rs.getString(1) + "\nNombre: " + rs.getString(2)+ "\nApellidos: " + rs.getString(3) + "\nTeléfono: " + rs.getInt(4) +"\nEmail: " + rs.getString(5) + "\nDirección: " + rs.getString(6) + "\nCódigo postal:" + rs.getInt(7);
            }
            
            JOptionPane.showMessageDialog(null, infoCli);
            sentencia.executeUpdate(DelCli);
            
        } catch (SQLException ex) {
            Logger.getLogger(Negocio.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
     public String[] encontrarClienteModif(String DNI){
        String getInfoCli = "SELECT * FROM clientes WHERE DNI = '" + DNI + "';";
        String[] datos = new String[7];
        try {
            connection = DriverManager.getConnection(DB_ROUTE_COMPLETE, DB_USER, DB_PASS);
            sentencia = connection.createStatement();
            ResultSet rs = sentencia.executeQuery(getInfoCli);
            String infoCli = null;
            //COMPROBAR LA LONGITUD DEL RESULTSET
            int i = 0;
            while(rs.next()){
                i++;
            }

            //SI i>0 MUESTRO EL CLIENTE, SINO MUESTRO MENSAJE DE "ERROR"
            if(i==0){
                return null;
            }else{
                ResultSet rs2 = sentencia.executeQuery(getInfoCli);
                while(rs2.next()){
                    datos[0] = rs2.getString(1);
                    datos[1] = rs2.getString(2);
                    datos[2] = rs2.getString(3);
                    datos[3] = String.valueOf(rs2.getInt(4));
                    datos[4] = rs2.getString(5);
                    datos[5] = rs2.getString(6);
                    datos[6] = String.valueOf(rs2.getInt(7));
                }
            }
            return datos;
        } catch (SQLException ex) {
            Logger.getLogger(Negocio.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }
    }
     
     public void modifCliente(String[] datos){
        String DNI = datos[0];
        String nombre = datos[1];
        String apellidos = datos[2];
        int telefono = Integer.parseInt(datos[3]);
        String email = datos[4];
        String direccion = datos[5];
        int codPostal = Integer.parseInt(datos[6]);
        String actuCliente = "UPDATE clientes SET nombre='" + nombre + "', apellidos='" + apellidos + "',telefono=" + telefono + ",email='" + email + "',direccion='" + direccion + "',CP=" + codPostal + " WHERE DNI='" + DNI + "';";
        
        try {
                connection = DriverManager.getConnection(DB_ROUTE_COMPLETE, DB_USER, DB_PASS);
                sentencia = connection.createStatement();
                sentencia.executeUpdate(actuCliente);
            } catch (SQLException ex) {
                Logger.getLogger(Negocio.class.getName()).log(Level.SEVERE, null, ex);
            }
     }
    
    public String consultaCliente(String DNI){
        String getInfoCli = "SELECT * FROM clientes WHERE DNI = '" + DNI + "';";
        try {
            connection = DriverManager.getConnection(DB_ROUTE_COMPLETE, DB_USER, DB_PASS);
            sentencia = connection.createStatement();
            ResultSet rs = sentencia.executeQuery(getInfoCli);
            String infoCli = null;
            //COMPROBAR LA LONGITUD DEL RESULTSET
            int i = 0;
            while(rs.next()){
                i++;
            }

            //SI i>0 MUESTRO EL CLIENTE, SINO MUESTRO MENSAJE DE "ERROR"
            if(i==0){
                infoCli = "No se encontraron clientes con ese DNI";
            }else{
                ResultSet rs2 = sentencia.executeQuery(getInfoCli);
                while(rs2.next()){
                    infoCli="DNI: " + rs2.getString(1) + "\n\nNombre: " + rs2.getString(2)+ "\n\nApellidos: " + rs2.getString(3) + "\n\nTeléfono: " + rs2.getInt(4) +"\n\nEmail: " + rs2.getString(5) + "\n\nDirección: " + rs2.getString(6) + "\n\nCódigo postal:" + rs2.getInt(7);
                }
            }
            return infoCli;
        } catch (SQLException ex) {
            Logger.getLogger(Negocio.class.getName()).log(Level.SEVERE, null, ex);
            return "error";
        }
    }
    //</editor-fold>
    
    //<editor-fold defaultstate="collapsed" desc="EQUIPOS">
    public void insertarEquipo(String[] datos){
        String ID = datos[0];
        String estado = datos[1];
        String hardware = datos[2];
        String software = datos[3];
        float PVP = Float.parseFloat(datos[4]);
        
        String insertEquipo = "INSERT INTO equipos VALUES('"
                + ID + "','" + estado + "','" + hardware + "','" + software + "'," + PVP + ");";
            try {
                connection = DriverManager.getConnection(DB_ROUTE_COMPLETE, DB_USER, DB_PASS);
                sentencia = connection.createStatement();
                sentencia.executeUpdate(insertEquipo);
            } catch (SQLException ex) {
                Logger.getLogger(Negocio.class.getName()).log(Level.SEVERE, null, ex);
            }
    }
    
    public void eliminarEquipo(String ID){
        String DelEquipo = "DELETE FROM equipos WHERE ID = '" + ID + "';";
        String getInfoEquipo = "SELECT * FROM equipos WHERE ID = '" + ID + "';";
        try {
            connection = DriverManager.getConnection(DB_ROUTE_COMPLETE, DB_USER, DB_PASS);
            sentencia = connection.createStatement();
            ResultSet rs = sentencia.executeQuery(getInfoEquipo);
            String infoCli = null;
            while(rs.next()){
                infoCli="ID: " + rs.getString(1) + "\nESTADO: " + rs.getString(2)+ "\nHW: " + rs.getString(3) + "\nSW: " + rs.getString(4) +"\nPVP: " + rs.getFloat(5);
            }
            
            JOptionPane.showMessageDialog(null, infoCli);
            sentencia.executeUpdate(DelEquipo);
            
        } catch (SQLException ex) {
            Logger.getLogger(Negocio.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
//</editor-fold>
    
    //<editor-fold defaultstate="collapsed" desc="facturas">
    
//</editor-fold>
    
    //<editor-fold defaultstate="collapsed" desc="validar DNI">
    //VALIDACIÓN DEL DNI
    private static final Pattern REGEXP = Pattern.compile("[0-9]{8}[A-Z]");
    private static final String DIGITO_CONTROL = "TRWAGMYFPDXBNJZSQVHLCKE";
    private static final String[] INVALIDOS = new String[] { "00000000T", "00000001R", "99999999R" };

    public static boolean validarDNI(String dni) {
      return Arrays.binarySearch(INVALIDOS, dni) < 0 // (1)
              && REGEXP.matcher(dni).matches() // (2)
          && dni.charAt(8) == DIGITO_CONTROL.charAt(Integer.parseInt(dni.substring(0, 8)) % 23); // (3)
    }
//</editor-fold>
    
    
//</editor-fold>

}
