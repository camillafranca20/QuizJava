/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.domain.quiz;

/**
 *
 * @author Gustavo
 */
public class Usuarios {
    private String nome;
    private String idade;
    private String cidade;
    private String email;
    private String nome_usuario;
    private double ultimaNota;
    private double mediaUser;
    
    public double getUltimaNota(){
        return ultimaNota;
    }
    public void setUltimaNota(double ultimaNota){
        this.ultimaNota = ultimaNota;
    }
    public double getMediaUser(){
        return mediaUser;
    }
    public void setMediaUser(double mediaUser){
        this.mediaUser = mediaUser;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getIdade() {
        return idade;
    }

    public void setIdade(String idade) {
        this.idade = idade;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getNome_usuario() {
        return nome_usuario;
    }

    public void setNome_usuario(String nome_usuario) {
        this.nome_usuario = nome_usuario;
    }
}