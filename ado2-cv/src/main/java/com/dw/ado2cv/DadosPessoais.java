/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.dw.ado2cv;

import java.time.LocalDate;

/**
 *
 * @author maris
 */
public class DadosPessoais {
    
    private String nome;
    private LocalDate dataNascimento;
    private String telefone;
    private String email;

    public DadosPessoais() {
    }

    public DadosPessoais(String nome, String dataNascimentoStr, String telefone, String email) {
        this.nome = nome;
        this.dataNascimento = LocalDate.parse(dataNascimentoStr);;
        this.telefone = telefone;
        this.email = email;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public LocalDate getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(LocalDate dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }


    
    
    
}
