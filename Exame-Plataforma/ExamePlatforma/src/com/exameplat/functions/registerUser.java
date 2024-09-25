package com.exameplat.functions;

import java.util.Scanner;

import com.exameplat.dao.UserDAO;
import com.exameplat.entity.User;

public class registerUser {

    Scanner scanner = new Scanner(System.in);
    User user = new User();
    UserDAO userDao = new UserDAO();

    public void insertUser(){

        System.out.println("Insira seu nome completo");
        String nome = scanner.nextLine();

        System.out.println("Insira o seu e-mail");
        String email = scanner.nextLine();

        System.out.println("Crie uma senha.");
        String senha = scanner.nextLine();

        System.out.println("Coloque sua data de nascimento.");
        String data_nascimento = scanner.nextLine();

        user.setNome(nome);
        user.setEmail(email);
        user.setSenha(senha);
        user.setDate(data_nascimento);

        userDao.registerUser(user);
        
        System.out.println("Usuário cadastrado com sucesso.");
        System.out.println("");

    }
}
