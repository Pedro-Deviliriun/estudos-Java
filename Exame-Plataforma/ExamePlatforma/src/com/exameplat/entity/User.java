package com.exameplat.entity;

public class User{

    private int codigo;
    private String nome;
    private String email;
    private String senha;
    private String data_nascimento;

    public int getCodigo(){
        return codigo;
    }

    public void setCodigo(int codigo){
        this.codigo = codigo;
    }

    public String getNome(){
        return nome;
    }
    public void setNome(String nome){
        this.nome = nome;
    }
    public String getEmail(){
        return email;
    }
    public void setEmail(String email){
        this.email = email;
    }
    public String getSenha(){
        return senha;
    }
    public void setSenha(String senha){
        this.senha = senha;
    }
    public String getDate(){
        return data_nascimento;
    }
    public void setDate(String data_nascimento){
        this.data_nascimento = data_nascimento;
    }
}