/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Exercicios;

import java.util.ArrayList;

/**
 *
 * @author Davi
 */
public class Ex01 {
    
    public static void main(String[] args) {
        ArrayList<String> listaNomes = new ArrayList<>();
        listaNomes.add("Davi");
        listaNomes.add("Daniel");
        
        for(String nome : listaNomes){
            System.out.println("Nome: "+nome);
        }
    }
    
}
