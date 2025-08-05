/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package io.github.nicolazlxl.TesteSQLPOO.CartaoCredito;


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
public class CartaoCredito 
        extends ProjectEntity
        implements Serializable {

    private static final long serialVersionUID = 1L;
    
    @Column(nullable = false)
    private String numero;

    @Column(nullable = false)
    private double limiteTotal;
    
    @Column(nullable = false)
    private double limiteDisponivel;
    
    @Column(nullable = false)
    private String status;

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

    public double getLimiteTotal() {
        return limiteTotal;
    }

    public void setLimiteTotal(double limiteTotal) {
        this.limiteTotal = limiteTotal;
    }

    public double getLimiteDisponivel() {
        return limiteDisponivel;
    }

    public void setLimiteDisponivel(double limiteDisponivel) {
        this.limiteDisponivel = limiteDisponivel;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    
    
    
    //</editor-fold>
    
    //<editor-fold defaultstate="collapsed" desc="ToString">

    @Override
    public String toString() {
        return "CartaoCredito{" + "numero=" + numero + ", limiteTotal=" + limiteTotal + ", limiteDisponivel=" + limiteDisponivel + ", status=" + status + '}';
    }
    
    //</editor-fold>

   
            
}
