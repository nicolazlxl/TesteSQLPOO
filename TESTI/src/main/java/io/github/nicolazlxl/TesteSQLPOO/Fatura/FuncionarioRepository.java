/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package io.github.nicolazlxl.TesteSQLPOO.Fatura;



import io.github.nicolazlxl.TesteSQLPOO.Entidades.Repository;

/**
 *
 * @author taina
 */
public class FuncionarioRepository 
    extends Repository<Fatura> {
     @Override
    public String getJpqlFindAll() {
        return "SELECT a FROM Fatura a";
    }

    @Override
    public String getJpqlFindById() {
        return "SELECT a FROM Fatura a WHERE a.id = :id";
    }
    
     @Override
    public String getJpqlFindTrash() {
        return "SELECT a FROM Fatura a WHERE a.ToTrash = true";
    }

    @Override
    public String getJpqlDeleteById() {
        return "DELETE FROM Fatura a WHERE a.id = :id";
    }
    
     @Override
    public String getJpqlEmptyTrash() {
        return "DELETE FROM Fatura a WHERE a.ToTrash = true";
    }
    
}
