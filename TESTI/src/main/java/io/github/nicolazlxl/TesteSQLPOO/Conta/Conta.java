/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package io.github.nicolazlxl.TesteSQLPOO.Conta;

import io.github.nicolazlxl.TesteSQLPOO.Entidades.ProjectEntity;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import java.io.Serializable;
import java.time.LocalDate;

/**
 *
 * @author taina
 */
@Entity
public class Conta 
        extends ProjectEntity
        implements Serializable {

    private static final long serialVersionUID = 1L;
    
    @Column(nullable = false)
    private String numero;

    @Column(nullable = false)
    private double saldo;
    
    @Column(nullable = false, length = 20)
    private String status;
    
    @Column(nullable = false)
    private LocalDate dataCriacao;
     
    @Column(nullable = false)
    private double limiteDiariSaque;

    //<editor-fold defaultstate="collapsed" desc="Getters e Setters">
    
    public static long getSerialVersionUID() {
        return serialVersionUID;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public LocalDate getDataCriacao() {
        return dataCriacao;
    }

    public void setDataCriacao(LocalDate dataCriacao) {
        this.dataCriacao = dataCriacao;
    }

    public double getLimiteDiariSaque() {
        return limiteDiariSaque;
    }

    public void setLimiteDiariSaque(double limiteDiariSaque) {
        this.limiteDiariSaque = limiteDiariSaque;
    }
    
    //</editor-fold>
    
    //<editor-fold defaultstate="collapsed" desc="ToString">

    @Override
    public String toString() {
        return "Conta{" + "numero=" + numero + ", saldo=" + saldo + ", status=" + status + ", dataCriacao=" + dataCriacao + ", limiteDiariSaque=" + limiteDiariSaque + '}';
    }
    
    //</editor-fold>
            
}
