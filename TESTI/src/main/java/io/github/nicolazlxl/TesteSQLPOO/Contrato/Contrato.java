/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package io.github.nicolazlxl.TesteSQLPOO.Contrato;

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
public class Contrato 
        extends ProjectEntity
        implements Serializable {

    private static final long serialVersionUID = 1L;
    
    @Column(nullable = false)
    private double valorTotal;

    @Column(nullable = false, length = 20)
    private String status;
    
    @Column(nullable = false)
    private LocalDate dataContrato;
     

    //<editor-fold defaultstate="collapsed" desc="Getters e Setters">

    public double getValorTotal() {
        return valorTotal;
    }

    public void setValorTotal(double valorTotal) {
        this.valorTotal = valorTotal;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public LocalDate getDataContrato() {
        return dataContrato;
    }

    public void setDataContrato(LocalDate dataContrato) {
        this.dataContrato = dataContrato;
    }
    
   
    //</editor-fold>
    
    //<editor-fold defaultstate="collapsed" desc="ToString">

     @Override
    public String toString() {
        return "Contrato{" + "valorTotal=" + valorTotal + ", status=" + status + ", dataContrato=" + dataContrato + '}';
    }
    
    //</editor-fold>

  
            
}
