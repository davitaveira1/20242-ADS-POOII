/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Exemplo;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

/**
 *
 * @author Davi
 */
public class Selecionar2 {

    public static void main(String[] args) {
        Connection con = db.conexao.getConnection();
        PreparedStatement pst;
        ResultSet rs;

        //executar o sql
        try {
            pst = con.prepareStatement("select * from usuarios");
            rs = pst.executeQuery();
            
            while(rs.next()){
                String login = rs.getString("login");
                System.out.println("Login: "+login);
            }
        } catch (Exception e) {
        }

    }

}
