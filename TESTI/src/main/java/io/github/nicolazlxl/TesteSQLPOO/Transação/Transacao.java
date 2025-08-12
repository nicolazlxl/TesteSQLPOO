/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package io.github.nicolazlxl.TesteSQLPOO.Transacao;


import io.github.nicolazlxl.TesteSQLPOO.Entidades.ProjectEntity;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import java.io.Serializable;
import java.time.LocalDate;

/**
 *
 * @author Sarah
 */
@Entity
public class Transacao 
    extends ProjectEntity
        implements Serializable {
    
    private static final long serialVersionUID = 1L;
    
    
    @Column(nullable = false, length = 50)
    private String tipo;
    
    @Column(nullable = false,unique = true)
    private double valor;
    
    @Column(nullable = false)
    private LocalDate data;
      
    @Column(nullable = false)
    private String ContaOrigem;
        
    @Column(nullable = false)
    private String ContaDestino;
        
    @Column(nullable = false)
    private String Funcionario;   
   
    
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

    public String getContaOrigem() {
        return ContaOrigem;
    }

    public void setContaOrigem(String ContaOrigem) {
        this.ContaOrigem = ContaOrigem;
    }

    public String getContaDestino() {
        return ContaDestino;
    }

    public void setContaDestino(String ContaDestino) {
        this.ContaDestino = ContaDestino;
    }

    public String getFuncionario() {
        return Funcionario;
    }

    public void setFuncionario(String Funcionario) {
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
