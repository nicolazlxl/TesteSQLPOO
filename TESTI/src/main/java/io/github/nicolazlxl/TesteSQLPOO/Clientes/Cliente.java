/*
 * Copyright (C) 2025 Luis Guisso &lt;luis dot guisso at ifnmg dot edu dot br&gt;
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */
package io.github.nicolazlxl.TesteSQLPOO.Clientes;

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
 * Cliente entity
 *
 * @author Nicolas Marques;

 */
@Entity
public class Cliente
        extends ProjectEntity
        implements Serializable {

    private static final long serialVersionUID = 1L;
    
    
    @Column(nullable = false, length = 45)
    private String nome;


    @Column(nullable = false)
    private String Cpf;

    @Column(nullable = true)
    private String email;

    @Transient
    private Integer idade;

    
    //<editor-fold defaultstate="collapsed" desc="Getters e Setters">
    
      public static long getSerialVersionUID() {
        return serialVersionUID;
    }

    public String getNome() {
        return nome;
    }

    public String getCpf() {
        return Cpf;
    }

    public String getEmail() {
        return email;
    }

    public Integer getIdade() {
        return idade;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setCpf(String Cpf) {
        this.Cpf = Cpf;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setIdade(Integer idade) {
        this.idade = idade;
    }
    
    
//</editor-fold>
    
  
    
    
     
    
    
}
