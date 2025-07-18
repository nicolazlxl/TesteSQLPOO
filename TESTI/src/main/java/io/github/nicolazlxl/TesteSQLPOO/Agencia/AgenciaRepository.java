/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package io.github.nicolazlxl.TesteSQLPOO.Agencia;

import io.github.nicolazlxl.TesteSQLPOO.Entidades.Repository;
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
        return "SELECT a FROM Agencia a";
    }

    @Override
    public String getJpqlFindById() {
        return "SELECT a FROM Agencia a WHERE a.id = :id";
    }

    @Override
    public String getJpqlDeleteById() {
        return "DELETE FROM Agencia a WHERE a.id = :id";
    }
}
