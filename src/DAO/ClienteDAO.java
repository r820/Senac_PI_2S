/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import java.util.ArrayList;
import model.Cliente;

/**
 *
 * @author igor.silva
 */
public class ClienteDAO {

    public static boolean salvar(Cliente p) {
        //Simulo uma inserção no banco de dados (INSERT INTO...)
        return SimulaDB.getInstance().SalvarCliente(p);

    }

    public static ArrayList<Cliente> getClientes() {
        return SimulaDB.getInstance().getClientes();

    }
    
    public static boolean pesquisa(String x){
        return SimulaDB.getInstance().pesquias(x);
    }
    
    public static boolean atualiza(Cliente p){
        return SimulaDB.getInstance().AtualizarCliente(p);
    }
    
    public static boolean excluirCliente(int x){
        return SimulaDB.getInstance().ExcluirCliente(x);
    }
    
    public static Cliente buscaCliente(int id){
        return SimulaDB.getInstance().buscaCliente(id);
    }
}
