/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package io.github.nicolazlxl.TesteSQLPOO.Transação;


import io.github.nicolazlxl.TesteSQLPOO.Entidades.Repository;
import java.util.Collection;
import java.util.List;
/**
 *
 * @author Sarah
 */
public class TransacaoRepository extends Repository<Transacao>{

    /**
     *
     * @return
     */
    @Override
    public String getJpqlFindAll() {
        return "SELECT a FROM Transacao a WHERE a.ToTrash = false";
    }

    @Override
    public String getJpqlFindById() {
        return "SELECT a FROM Transacao a WHERE a.id = :id";
    }

    @Override
    public String getJpqlDeleteById() {
        return "DELETE FROM Transacao a WHERE a.id = :id";
    }
   
     @Override
    public String getJpqlFindTrash() {
        return "DELETE FROM Transacao a WHERE  a.ToTrash = true";
    }
    
     @Override
    public String getJpqlEmptyTrash() {
        return "DELETE FROM Transacao a WHERE a.ToTrash = true";
    }

    public Collection<? extends Transacao> loadFromTrash() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    public void moveToThash(Transacao selected) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    public void moveToTrash(List<Transacao> selection) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
}
