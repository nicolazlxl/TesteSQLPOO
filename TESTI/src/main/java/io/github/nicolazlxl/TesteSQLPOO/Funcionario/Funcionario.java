/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package io.github.nicolazlxl.TesteSQLPOO.Funcionario;


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
 * @author taina
 */
@Entity
public class Funcionario 
        extends ProjectEntity
        implements Serializable {

    private static final long serialVersionUID = 1L;
    
   
    @Column(nullable = false, length = 20)
    private String nome;
    
    @Column(nullable = false, length = 20)
    private String matricula;
    
    @Column(nullable = false, length = 20)
    private String cargo;
    
    @Column(nullable = false)
    private boolean ativo;
     

    //<editor-fold defaultstate="collapsed" desc="Getters e Setters">

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public boolean isAtivo() {
        return ativo;
    }

    public void setAtivo(boolean ativo) {
        this.ativo = ativo;
    }

  
    //</editor-fold>
    
    //<editor-fold defaultstate="collapsed" desc="ToString">

    @Override
    public String toString() {
        return "Funcionario{" + "nome=" + nome + ", matricula=" + matricula + ", cargo=" + cargo + ", ativo=" + ativo + '}';
    }
    //</editor-fold>

              
}
