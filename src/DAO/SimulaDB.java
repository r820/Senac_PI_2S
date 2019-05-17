/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import model.Cliente;
//import model.Produto;
import java.util.ArrayList;

/**
 *
 * @author fernando.fernandes Padrão Singleton
 */
public class SimulaDB {
    
    private static SimulaDB mockdb;
    
    private ArrayList<Cliente> listaClientes; //Simulo a tabela clientes
    // private ArrayList<Produto> listaProdutos; //Simulo a tabela Produtos

    private SimulaDB() {
        
        listaClientes = new ArrayList<Cliente>();
        //   listaProdutos = new ArrayList<Produto>();
    }
    
    public static synchronized SimulaDB getInstance() {
        if (mockdb == null) {
            mockdb = new SimulaDB();
        }
        
        return mockdb;
    }
    
    public Cliente buscaCliente(int id) {
        Cliente c = new Cliente();
        for (Cliente listaCliente : listaClientes) {
            if (listaCliente.getId() == id) {
                c = listaCliente;
            }
        }        
        return c;
    }
    
    public boolean SalvarCliente(Cliente c) {
        listaClientes.add(c);
        
        return true;
    }
    
    public ArrayList<Cliente> getClientes() {
        ArrayList<Cliente> cliente = new ArrayList<>();
        for (Cliente c : listaClientes) {
            /* if ((c.getNome().trim().toLowerCase().equals(x.trim().toLowerCase())) ||(x.equalsIgnoreCase(""))) {
                cliente.add(c);
            }*/
            cliente.add(c);
        }
        return cliente;
    }
    
    public boolean pesquias(String x) {
        for (Cliente listaCliente : listaClientes) {
            if (listaCliente.getNome() == x) {
                return true;
            }
        }
        return false;
    }
    
    public boolean AtualizarCliente(Cliente p) {
        for (Cliente item : listaClientes) {
            if (item.getId() == p.getId()) {
                item.setNome(p.getNome());
                item.setSobrenome(p.getSobrenome());
                item.setSexo(p.getSexo());
                item.setDataNascimento(p.getDataNascimento());
                item.setCpf(p.getCpf());
                item.setCep(p.getCep());
                item.setEndereco(p.getEndereco());
                item.setNumero(p.getNumero());
                item.setCidade(p.getCidade());
                item.setComplemento(p.getComplemento());
                item.setBairro(p.getBairro());
                item.setEstado(p.getEstado());
                item.setPontoReferencia(p.getPontoReferencia());
                item.setEstadoCivil(p.getEstadoCivil());
                item.setTelefone(p.getTelefone());
                item.setEmail(p.getEmail());
            }
        }
        
        return true;
    }
    
    public boolean ExcluirCliente(int x) {
        Cliente clienteExcluir = new Cliente();
        boolean existeNaLista = false;
        for (Cliente c : listaClientes) {
            
            if (c.getId() == x) {
                clienteExcluir = c;
                existeNaLista = true;
            }
        }
        
        if (existeNaLista) {
            listaClientes.remove(clienteExcluir);
        }
        
        return true;
    }
}
