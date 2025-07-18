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
import io.github.nicolazlxl.TesteSQLPOO.Clientes.Cliente;
import io.github.nicolazlxl.TesteSQLPOO.Clientes.ClienteRepository;
import io.github.nicolazlxl.TesteSQLPOO.Clientes.ClienteRepository;

import java.time.LocalDate;
import java.util.List;

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

        // !!! ID should not be set!!!
        //aluno.setId(1234L);
//        

        c1.setNome("Ana Zaira");
        c1.setCpf("02109933674");
        c1.setEmail("email");
        c1.setIdade(52);
        

      
         ClienteRepository repository = new ClienteRepository();

        // Persistence
        repository.saveOrUpdate(c1);
     
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
