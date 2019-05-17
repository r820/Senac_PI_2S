/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author igor.silva
 */
public class Cliente {

    private int id;
    private String nome;
    private String sobrenome;
    private String sexo;
    private String dataNascimento;
    private String cpf;
    private String cep;
    private String endereco;
    private String numero;
    private String complemento;
    private String bairro;
    private String estado;
    private String cidade;
    private String pontoReferencia;
    private String estadoCivil;
    private String telefone;
    private String email;

    private static int qtdClientes;

    public Cliente() {
        //TODO:Ao conectar-se ao banco, remover incremento pelo código
        this.id = qtdClientes;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public static int getQtdClientes() {
        return qtdClientes;
    }

    public static void setQtdClientes(int qtdClientes) {
        Cliente.qtdClientes = qtdClientes;
    }

    public Cliente(String nome, String sobrenome, String sexo, String dataNascimento, String cpf, String cep, String endereco, String numero, String complemento, String bairro, String estado, String cidade, String pontoReferencia, String estadoCivil, String telefone, String email) {
        this.id++;
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.sexo = sexo;
        this.dataNascimento = dataNascimento;
        this.cpf = cpf;
        this.cep = cep;
        this.endereco = endereco;
        this.numero = numero;
        this.complemento = complemento;
        this.bairro = bairro;
        this.estado = estado;
        this.cidade = cidade;
        this.pontoReferencia = pontoReferencia;
        this.estadoCivil = estadoCivil;
        this.telefone = telefone;
        this.email = email;
    }

    public Cliente(int id, String nome, String sobrenome, String sexo, String dataNascimento, String cpf, String cep, String endereco, String numero, String complemento, String bairro, String estado, String cidade, String pontoReferencia, String estadoCivil, String telefone, String email) {
        this.id = id;
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.sexo = sexo;
        this.dataNascimento = dataNascimento;
        this.cpf = cpf;
        this.cep = cep;
        this.endereco = endereco;
        this.numero = numero;
        this.complemento = complemento;
        this.bairro = bairro;
        this.estado = estado;
        this.cidade = cidade;
        this.pontoReferencia = pontoReferencia;
        this.estadoCivil = estadoCivil;
        this.telefone = telefone;
        this.email = email;
    }

    public Cliente(String nome, String sobrenome, String sexo) {
        qtdClientes++;
        this.id = qtdClientes;
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.sexo = sexo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSobrenome() {
        return sobrenome;
    }

    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public String getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(String dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getComplemento() {
        return complemento;
    }

    public void setComplemento(String complemento) {
        this.complemento = complemento;
    }

    public String getBairro() {
        return bairro;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getPontoReferencia() {
        return pontoReferencia;
    }

    public void setPontoReferencia(String pontoReferencia) {
        this.pontoReferencia = pontoReferencia;
    }

    public String getEstadoCivil() {
        return estadoCivil;
    }

    public void setEstadoCivil(String estadoCivil) {
        this.estadoCivil = estadoCivil;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

}
