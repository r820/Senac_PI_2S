/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import model.Cliente;
import DAO.ClienteDAO;
import java.util.ArrayList;

/**
 *
 * @author igor.silva
 */
public class ClienteController {

    public static boolean AdicionarCliente(String nome, String sobrenome, String sexo, String data, String CPF, String CEP, String endereco, String numero, String complemento, String Bairro,String uf,String cidade, String pReferencia, String eCivil, String telefone, String email) {        
        Cliente c = new Cliente(nome, sobrenome, sexo, data, CPF, CEP, endereco, numero, complemento, Bairro, uf, cidade, pReferencia, eCivil, telefone, email);
        return ClienteDAO.salvar(c);
    }

    public static boolean excluirCliente(int pID) {
        return ClienteDAO.excluirCliente(pID);
    }

    public static boolean Pesquisa(String x) {
        return ClienteDAO.pesquisa(x);
    }
    //REALIZA UM UPDATE DO CLIENTE CRIANDO UM NOVO CLIENTE E PASSANDO PRO DAO
    public static boolean atualiza(int id, String nome, String sobrenome, String sexo, String data, String CPF, String CEP, String endereco, String numero, String complemento, String Bairro,String uf,String cidade, String pReferencia, String eCivil, String telefone, String email) {
        Cliente cliente = new Cliente(id, nome, sobrenome, sexo, data, CPF, CEP, endereco, numero, complemento, Bairro, uf, cidade, pReferencia, eCivil, telefone, email);
        return ClienteDAO.atualiza(cliente);
    }
    //REALIZA PRA BUSCA OS DADOS DE UM CLIENTE PARA O VIEW EDITAR-FORMULÁRIO
    public static Cliente buscaCliente(int id){
        return ClienteDAO.buscaCliente(id);
    }

    public static ArrayList<String[]> getClientes() {
        ArrayList<Cliente> clientes = ClienteDAO.getClientes();
        ArrayList<String[]> listaClientes = new ArrayList<>();
        for (int i = 0; i < clientes.size(); i++) {
            listaClientes.add(new String[]{String.valueOf(clientes.get(i).getId()), clientes.get(i).getNome(), clientes.get(i).getSobrenome(),clientes.get(i).getCpf(),clientes.get(i).getDataNascimento(),clientes.get(i).getCep(),clientes.get(i).getEndereco(), clientes.get(i).getNumero(), clientes.get(i).getComplemento(),clientes.get(i).getBairro(),clientes.get(i).getEstado(),clientes.get(i).getPontoReferencia(),clientes.get(i).getEstadoCivil(),clientes.get(i).getTelefone(),clientes.get(i).getEmail(),});       
        }

        return listaClientes;

    }

}
