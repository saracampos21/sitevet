/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.projetoveterinario.dal;

import java.sql.*;
/**
 *
 * @author Compaq
 */
public class ModuloConexao {
   //metodo pra estabeleer coonexao banco
    public static Connection conector (){
    java.sql.Connection conexao = null;
    //vamos chamar o driver
    String driver ="com.mysql.cj.jdbc.Driver";
    //armazenando infos do banco
    //isso tem que ser o nme da data base la do workbench?
    String url="jdbc:mysql://localhost:3306/siteveterinario";
    String user = "root";
    String password="";
    //estabelecendo a conexao com o banco
        try {
            Class.forName(driver);
            conexao = DriverManager.getConnection(url,user,password);
            return conexao;
        } catch (Exception e) {
            //linha q aparece qual erro é
          //System.out.println(e);
            return null;
        }
    }
    }
