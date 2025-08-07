/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package io.github.nicolazlxl.TesteSQLPOO.Agencia;

import io.github.nicolazlxl.TesteSQLPOO.Entidades.Repository;
import java.util.Collection;
import java.util.List;
/**
 *
 * @author Sarah
 */
public class AgenciaRepository extends Repository<Agencia>{

    /**
     *
     * @return
     */
    @Override
    public String getJpqlFindAll() {
        return "SELECT a FROM Agencia a WHERE a.ToTrash = false";
    }

    @Override
    public String getJpqlFindById() {
        return "SELECT a FROM Agencia a WHERE a.id = :id";
    }

    @Override
    public String getJpqlDeleteById() {
        return "DELETE a FROM Agencia a WHERE a.id = :id";
    }
   
     @Override
    public String getJpqlFindTrash() {
        return "SELECT a FROM Agencia a WHERE a.ToTrash = true";
    }
    
     @Override
    public String getJpqlEmptyTrash() {
        return "DELETE FROM Agencia a WHERE a.ToTrash = true";
    }

    public Collection<? extends Agencia> loadFromTrash() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

  
}
