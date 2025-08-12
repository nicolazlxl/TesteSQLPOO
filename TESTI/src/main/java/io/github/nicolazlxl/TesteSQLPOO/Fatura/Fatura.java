/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package io.github.nicolazlxl.TesteSQLPOO.Fatura;



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
public class Fatura 
        extends ProjectEntity
        implements Serializable {

    private static final long serialVersionUID = 1L;
    
   
   @Column(nullable = false)
    private LocalDate dataFechamento;
    
    @Column(nullable = false, length = 20)
    private double valorTotal;
    
    @Column(nullable = false, length = 20)
    private String status;

  
    //<editor-fold defaultstate="collapsed" desc="Getters e Setters">
    
      public LocalDate getDataFechamento() {
        return dataFechamento;
    }

    public void setDataFechamento(LocalDate dataFechamento) {
        this.dataFechamento = dataFechamento;
    }

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

    //</editor-fold>
    
    //<editor-fold defaultstate="collapsed" desc="ToString">
  
    
     @Override
    public String toString() {
        return "Fatura{" + "dataFechamento=" + dataFechamento + ", valorTotal=" + valorTotal + ", status=" + status + '}';
    }
    
    
    //</editor-fold>
             
}
