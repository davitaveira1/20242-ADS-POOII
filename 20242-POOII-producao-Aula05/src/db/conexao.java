/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package db;

import java.sql.Connection;
import java.sql.DriverManager;
import javax.swing.JOptionPane;

/**
 *
 * @author Davi
 */
public class conexao {

    private static Connection conn = null;
    
    public static Connection getConnection() {
        if (conn == null) {
            try {
                Class.forName("com.mysql.jdbc.Driver");
                conn = DriverManager.getConnection("jdbc:mysql://localhost/poo2-producao", "root", "");
                //conn = DriverManager.getConnection("jdbc:mysql://localhost/id20790483_testeionic2023", "id20790483_testeionic2023", "");
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null,"Erro1: "+ e);
            }
        }
        return conn;
    }
    
}