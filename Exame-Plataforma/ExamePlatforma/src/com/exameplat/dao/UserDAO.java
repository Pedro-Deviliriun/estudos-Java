package com.exameplat.dao;

import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.exameplat.connection.Connect;
import com.exameplat.entity.User;

public class UserDAO {
    public void registerUser(User usuario){
        String sql = "INSERT INTO usuarios (nome, email, senha, data_nascimento) VALUES (?, ?, ?, ?)";

        PreparedStatement ps = null;

        try {
            ps = Connect.getConexao().prepareStatement(sql);
            ps.setString(1, usuario.getNome());
            ps.setString(2, usuario.getEmail());
            ps.setString(3, usuario.getSenha());
            ps.setString(4, usuario.getDate());

            ps.execute();
            ps.close();
            
        } catch (SQLException e) {
            
            e.printStackTrace();
        }
    }
}
