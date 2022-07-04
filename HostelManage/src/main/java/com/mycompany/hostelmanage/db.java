/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.hostelmanage;

/**
 *
 * @author chitr
 */



import java.sql.*;


//public class db {
//
//public static Connection mycon()
//
//{ Connection con =null;

public class db {

public static Connection mycon()

{ Connection con =null;

try {

Class.forName("com.mysql.jdbc.Driver");

con = DriverManager.getConnection("jdbc:mysql://localhost:3306/rootdb", "root", "Arpan@03"); }

catch (ClassNotFoundException | SQLException e)

{ System.out.println(e.getMessage());

}

return con;

}

}