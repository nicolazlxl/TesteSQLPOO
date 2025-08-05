/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package io.github.nicolazlxl.TesteSQLPOO.Emprestimo;




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
public class Emprestimo 
        extends ProjectEntity
        implements Serializable {

    private static final long serialVersionUID = 1L;
    
   
   
    
    @Column(nullable = false, length = 20)
    private double valorTotal;
    
      @Column(nullable = false, length = 20)
    private double taxaJuros;
    
    @Column(nullable = false, length = 20)
    private int numeroParcelas;
    
     @Column(nullable = false, length = 20)
    private String status;
  
    
  

    //<editor-fold defaultstate="collapsed" desc="Getters e Setters">
       public double getValorTotal() {
        return valorTotal;
    }
    
    public void setValorTotal(double valorTotal) {
        this.valorTotal = valorTotal;
    }

    public double getTaxaJuros() {  
        return taxaJuros;
    }

    public void setTaxaJuros(double taxaJuros) {
        this.taxaJuros = taxaJuros;
    }

    public int getNumeroParcelas() {
        return numeroParcelas;
    }

    public void setNumeroParcelas(int numeroParcelas) {
        this.numeroParcelas = numeroParcelas;
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
        return "Emprestimo{" + "valorTotal=" + valorTotal + ", taxaJuros=" + taxaJuros + ", numeroParcelas=" + numeroParcelas + ", status=" + status + '}';
    }
    //</editor-fold>

   

   

              
}
