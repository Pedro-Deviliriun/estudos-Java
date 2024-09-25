package com.exameplat.functions;

import java.util.Scanner;

public class menu {
    public void menuChoice(){

        try (Scanner scanner = new Scanner(System.in)) {
            registerUser rUser = new registerUser();

            System.out.println("Escolha uma opção: ");
            System.out.println("[1] Cadastrar novo usuário.");
            System.out.println("[2] Cadastrar novo exame.");
            System.out.println("[3] Realizar novo agendamento.");
            System.out.println("[4] Sair.");

            int choice = scanner.nextInt();

            if(choice == 1){
                rUser.insertUser();
                menuChoice();
            }else if(choice == 2){
                System.out.println("Ainda estamos trabalhando nisso.");
                menuChoice();
            }else if(choice == 3){
                System.out.println("Ainda estamos trabalhando nisso.");
                menuChoice();
            }else{
                System.out.println("Programa encerrado.");
                return;
            }
        }
    }
}
