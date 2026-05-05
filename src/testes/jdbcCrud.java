/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package testes;

import java.util.logging.Level;
import java.util.logging.Logger;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author u06769532123
 */
public class jdbcCrud {

    public static void main(String[] args) {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            String url, user, password;
            url = "jdbc:mysql://10.7.0.51:33062/db_marcos_vilhanueva";
            user = "marcos_vilhanueva";
            password = "marcos_vilhanueva";
            Connection cnt;
            cnt = DriverManager.getConnection(url, user, password);
//            Statement stm = cnt.createStatement();
//            String sgl = "insert into "
//                  + "mpv_usuarios(mpv_idusuarios, mpv_nome, mpv_apelido, mpv_cpf) "
//                    + "values(104, 'Arthur','avl','06769532123')";
//            stm.execute(sgl);
//            String sql = "insert into "
//                            + "mpv_usuarios(mpv_idusuarios,mpv_nome, mpv_apelido, mpv_cpf)"
//                            + " values (?, ?, ?, ?)";
//                    String sgl = "update mpv_usuarios "
//                            + "set mpv_nome= ?, mpv_apelido= ?, "
//                            + "mpv_cpf= ? where mpv_idusuarios= ?";
            String sgl = "delete from mpv_usuarios where mpv_idusuarios= ?";
            PreparedStatement pst = cnt.prepareStatement(sgl);
            pst.setInt(1, 504);
//                    pst.setString(1, "Rudolf Höss");
//                    pst.setString(2, "rh");
//                    pst.setString(3, "3116548465");
            pst.executeUpdate();

        } catch (ClassNotFoundException ex) {
            Logger.getLogger(jdbcCrud.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(jdbcCrud.class.getName()).log(Level.SEVERE, null, ex);
        }
        System.out.println("Conectou ");
    }
}
