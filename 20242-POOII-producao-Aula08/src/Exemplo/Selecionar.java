/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Exemplo;

import db.conexao;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author Davi
 */
public class Selecionar {

    public static void main(String[] args) {
        Connection con = db.conexao.getConnection();
        PreparedStatement pst;
        ResultSet rs;

        try {
            pst = con.prepareStatement("select * from usuarios");
            rs = pst.executeQuery();
            String login;
            String senha;
            while (rs.next()) {
                login = rs.getString("login");
                senha = rs.getString("senha");
                System.out.println("Login: " + login + " senha: " + senha);
            }
        } catch (SQLException e) {
            System.out.println("Erro: " + e);
        }

    }

}
