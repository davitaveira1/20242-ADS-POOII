/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exemplos;

import java.sql.Connection;
import db.conexao;
import java.sql.PreparedStatement;

/**
 *
 * @author Davi
 */
public class inserir {

    public static void main(String[] args) {
        //objeto conexão
        Connection con = conexao.getConnection();
        //sql
        PreparedStatement pst;
        try {
          pst = con.prepareStatement("INSERT INTO usuarios "
                  + "(login,senha) VALUES (?,?)");
          pst.setString(1, "alexandre");
          pst.setString(2, "000");
          //executar sql 
          pst.executeUpdate();
        } catch (Exception e) {
            System.out.println("Erro: "+e);
        }
               
    }

}
