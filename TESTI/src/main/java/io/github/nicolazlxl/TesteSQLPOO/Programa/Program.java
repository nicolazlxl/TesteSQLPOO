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

package io.github.nicolazlxl.TesteSQLPOO.Programa;


import io.github.nicolazlxl.TesteSQLPOO.Clientes.Cliente;
import io.github.nicolazlxl.TesteSQLPOO.Agencia.Agencia;
import io.github.nicolazlxl.TesteSQLPOO.Conta.Conta;

import io.github.nicolazlxl.TesteSQLPOO.Clientes.ClienteRepository;
import io.github.nicolazlxl.TesteSQLPOO.Agencia.AgenciaRepository;
import io.github.nicolazlxl.TesteSQLPOO.Conta.ContaRepository;    
import java.time.LocalDate;

import java.util.List;
import java.util.Set;

/**
 * Runs tests of the "Alpha" version
 *
 * @author Luis Guisso &lt;luis dot guisso at ifnmg dot edu dot br&gt;
 * @version 0.1
 * @since 0.1, 2025-06-25
 */
public class Program {

    public static void main(String[] args) {
        // Object to be persisted
        
        
        Cliente c1 = new Cliente();
         Cliente c2 = new Cliente();
        Agencia a1 = new Agencia();
        Conta con = new Conta();
        
         ClienteRepository repositoryC = new ClienteRepository();
         AgenciaRepository repositoryA = new AgenciaRepository();
         ContaRepository repositoryCon = new ContaRepository();
         
         
        c1.setNome("Ana");
        c1.setCpf("02109933674");
        c1.setEmail("email");
        c1.setIdade(52);
        
        
        c2.setNome("Maria");
        c2.setCpf("15152036");
        c2.setEmail("maria@yahoo.com");
        c2.setIdade(52);
        
        
        a1.setCodigo("40028922");
        a1.setEndereco("lugardobanco");
        a1.setGerente("Dono");
        a1.setNome("Bancao");
        a1.setTelefone("0800");
        
        con.setDataCriacao(LocalDate.of(2024,10,25));
        con.setLimiteDiariSaque(1000);
        con.setNumero("4321");
        con.setSaldo(100000);
        con.setStatus("Bloqueado");
       
         
        repositoryC.saveOrUpdate(c1);
         repositoryC.saveOrUpdate(c2);
        repositoryA.saveOrUpdate(a1);
        repositoryCon.saveOrUpdate(con);
        
         List<Cliente> clientes = repositoryC.findAll();
        
        for (Cliente cliente : clientes) {
            System.out.println(">> " + cliente);
        }
        
        System.out.println("___________________________________");
        
         c2.setEmail("maria@gmail.com");
         repositoryC.saveOrUpdate(c2);
         
         
         clientes = repositoryC.findAll();
         
          for (Cliente cliente : clientes) {
            System.out.println(">> " + cliente);
        }
        
         System.out.println("___________________________________");
        
       repositoryC.delete(c1);
       
       
       clientes = repositoryC.findAll();
         
          for (Cliente cliente : clientes) {
            System.out.println(">> " + cliente);
        }
        
        
       
     
       /* 
//        +-----------+------------+----+--------------+
//        | matricula | nascimento | id | nome         |
//        +-----------+------------+----+--------------+
//        |  20250001 | 2000-06-01 |  1 | Ana Zaira    |
//        |  20250002 | 2000-10-20 |  2 | Beatriz Yana |
//        +-----------+------------+----+--------------+
//        
        System.out.println("> " + c1);
        System.out.println("> " + c2);
        
        // Object to be updated
        c1.setCpf("234");
        
        // Persistence
        repository.saveOrUpdate(c1);
        
//        +-----------+------------+----+--------------+
//        | matricula | nascimento | id | nome         |
//        +-----------+------------+----+--------------+
//        |    987654 | 2000-06-01 |  1 | Ana Zaira    |
//        |  20250002 | 2000-10-20 |  2 | Beatriz Yana |
//        +-----------+------------+----+--------------+
//        
        System.out.println("> " + c1);
        System.out.println("> " + c2);
        
        List<Cliente> clientes = repository.findAll();
        
        for (Cliente cliente : clientes) {
            System.out.println(">> " + cliente);
        }
        
        // Note the idade, which is a value derived from the nascimento: null
        // How to resolve?
        // TODO Aluno needs adjustments
//        >> Aluno{id=1, matricula=987654, nome=Ana Zaira, nascimento=2000-06-01, idade=null}
//        >> Aluno{id=2, matricula=20250002, nome=Beatriz Yana, nascimento=2000-10-20, idade=null}
        
//        //
//        // Tests with Veiculo
//        //
//        VeiculoRepository veiculoRepository = new VeiculoRepository();
//        
//        Veiculo v1 = new Veiculo();
//        v1.setPlaca("ABC1D23");
//        v1.setCor(Veiculo.Cor.VERMELHA);
//        
//        veiculoRepository.save(v1);
//        
//        Veiculo v2 = new Veiculo();
//        v2.setPlaca("XYZ9876");
//        v2.setCor(Veiculo.Cor.OUTRA);
//        
//        veiculoRepository.save(v2);
       
      /* ClienteRepository clientRepository = new ClienteRepository();
        
        Cliente c1 = new Cliente();
        c1.setNome("ZAIRA");
        c1.setEmail("y@mail.com");
        c1.setCpf("123456");
        
         clientRepository.saveOrUpdate(c1);
//        if(true) return;
        
   
      //  System.out.println("> " + c1.getEmail());
       */
    }
}
