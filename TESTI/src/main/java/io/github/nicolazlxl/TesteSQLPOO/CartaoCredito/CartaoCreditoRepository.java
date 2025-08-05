/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package io.github.nicolazlxl.TesteSQLPOO.CartaoCredito;

import io.github.nicolazlxl.TesteSQLPOO.Entidades.Repository;

/**
 *
 * @author taina
 */
public class CartaoCreditoRepository 
    extends Repository<CartaoCredito> {
     @Override
    public String getJpqlFindAll() {
        return "SELECT a FROM CartaoCredito a";
    }

    @Override
    public String getJpqlFindById() {
        return "SELECT a FROM CartaoCredito a WHERE a.id = :id";
    }
    
     @Override
    public String getJpqlFindTrash() {
        return "SELECT a FROM CartaoCredito a WHERE a.ToTrash = true";
    }

    @Override
    public String getJpqlDeleteById() {
        return "DELETE FROM CartaoCredito a WHERE a.id = :id";
    }
    
     @Override
    public String getJpqlEmptyTrash() {
        return "DELETE FROM CartaoCredito a WHERE a.ToTrash = true";
    }
    
}
