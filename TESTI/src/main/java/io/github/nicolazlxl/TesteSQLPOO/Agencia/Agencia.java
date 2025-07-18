/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package io.github.nicolazlxl.TesteSQLPOO.Agencia;

import io.github.nicolazlxl.TesteSQLPOO.Entidades.ProjectEntity;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.PostLoad;
import jakarta.persistence.Transient;
import java.io.Serializable;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.Objects;

/**
 *
 * @author Dell
 */
@Entity
public class Agencia 
    extends ProjectEntity
        implements Serializable{
    
    //private static final long serialVersionUID = 1L;
    
    
    @Column(nullable = false,unique = true)
    private double codigo;


    @Column(nullable = false, length = 50)
    private String nome;
    
    @Column(length = 100)
    private String endereco;
    
    @Column(length = 20)
    private String telefone;
    
    @Column(length = 100)
    private String gerente;

    //<editor-fold defaultstate="collapsed" desc="Getters e Setters">

    public double getCodigo() {
        return codigo;
    }

    public void setCodigo(double codigo) {
        this.codigo = codigo;
    }
    

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getGerente() {
        return gerente;
    }

    public void setGerente(String gerente) {
        this.gerente = gerente;
    }
//</editor-fold>

    @Override
    public String toString() {
        return "Agencia{" + "codigo=" + codigo + ", nome=" + nome + ", endereco=" + endereco + ", telefone=" + telefone + ", gerente=" + gerente + '}';
    }
    
    
}
