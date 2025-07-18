/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package io.github.nicolazlxl.TesteSQLPOO.Conta;

import io.github.nicolazlxl.TesteSQLPOO.Entidades.Repository;

/**
 *
 * @author taina
 */
public class ContaRepository 
    extends Repository<Conta> {
     @Override
    public String getJpqlFindAll() {
        return "SELECT a FROM Conta a";
    }

    @Override
    public String getJpqlFindById() {
        return "SELECT a FROM Conta a WHERE a.id = :id";
    }

    @Override
    public String getJpqlDeleteById() {
        return "DELETE FROM Conta a WHERE a.id = :id";
    }
    
}
