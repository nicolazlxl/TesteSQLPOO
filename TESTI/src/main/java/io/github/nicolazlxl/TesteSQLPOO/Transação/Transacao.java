/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package io.github.nicolazlxl.TesteSQLPOO.Transação;


import io.github.nicolazlxl.TesteSQLPOO.Conta.Conta;
import io.github.nicolazlxl.TesteSQLPOO.Funcionario.Funcionario;
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
 * @author Sarah
 */
@Entity
public class Transacao 
    extends ProjectEntity
        implements Serializable{
    
    private static final long serialVersionUID = 1L;
    
    
  


    @Column(nullable = false, length = 50)
    private String tipo;
    
    @Column(nullable = false,unique = true)
    private double valor;
    
    @Column(nullable = false)
    private LocalDate data;
      
    @Column(nullable = false)
    private Conta ContaOrigem;
        
    @Column(nullable = false)
    private Conta ContaDestino;
        
    @Column(nullable = false)
    private Funcionario Funcionario;    
    
    

    //<editor-fold defaultstate="collapsed" desc="Getters e Setters">

        public static long getSerialVersionUID() {
        return serialVersionUID;
    }
  
     public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public LocalDate getData() {
        return data;
    }

    public void setData(LocalDate data) {
        this.data = data;
    }

    public Conta getContaOrigem() {
        return ContaOrigem;
    }

    public void setContaOrigem(Conta ContaOrigem) {
        this.ContaOrigem = ContaOrigem;
    }

    public Conta getContaDestino() {
        return ContaDestino;
    }

    public void setContaDestino(Conta ContaDestino) {
        this.ContaDestino = ContaDestino;
    }

    public Funcionario getFuncionario() {
        return Funcionario;
    }

    public void setFuncionario(Funcionario Funcionario) {
        this.Funcionario = Funcionario;
    }
    
    
    
//</editor-fold>

    
    
       //<editor-fold defaultstate="collapsed" desc="ToString">
     @Override
    public String toString() {
        return "Transacao{" + "tipo=" + tipo + ", valor=" + valor + ", data=" + data + ", ContaOrigem=" + ContaOrigem + ", ContaDestino=" + ContaDestino + ", Funcionario=" + Funcionario + '}';
    }
    
    //</editor-fold>

   

   
    
    
    


   

  
 
    
}
