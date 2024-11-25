/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Exemplos;


import java.sql.Connection;
import java.sql.PreparedStatement;
import db.conexao;

/**
 *
 * @author Davi
 */
public class inserir {
    
    public static void main(String[] args) {
        //conexao
        Connection con=null;
        //sql
        PreparedStatement pst=null;
        
        con = conexao.getConnection();
        
        try {
            pst = con.prepareStatement("insert into usuarios "
                    + "(login,senha) values ('renato','123')");
            int linha = pst.executeUpdate();
            if(linha > 0){
                System.out.println("Inserção realizada com sucesso!");
            }else{
                System.out.println("Erro na inserção!");
            }
        } catch (Exception e) {
            System.out.println("Erro: "+e);
        }
        
        
    }
    
}
