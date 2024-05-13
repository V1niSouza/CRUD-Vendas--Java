/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelagem;

import Controle.Conexao;
import java.sql.ResultSet;
import javax.swing.JOptionPane;

/**
 *
 * @author vsouza
 */
public class Venda {
    private int codigo;
    private String name_vendedor;
    private String name_produto;
    
    private Conexao condVenda = new Conexao();

    public Venda() {
        this(0, "", "");
    }

    public Venda(int codigo, String name_vendedor, String name_produto) {
        this.codigo = codigo;
        this.name_vendedor = name_vendedor;
        this.name_produto = name_produto;
    }

    public Conexao getCondVenda() {
        return condVenda;
    }

    public void setCondVenda(Conexao condVenda) {
        this.condVenda = condVenda;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getName_vendedor() {
        return name_vendedor;
    }

    public void setName_vendedor(String name_vendedor) {
        this.name_vendedor = name_vendedor;
    }

    public String getName_produto() {
        return name_produto;
    }

    public void setName_produto(String name_produto) {
        this.name_produto = name_produto;
    }
    
    public void cadastrarVenda(){
        String sql;
        sql = "Insert into venda(codigo, nome_vende, nome_prod) values"+
                    "('" + getCodigo() + "','" + getName_vendedor() + "','" + getName_produto() + "')";
        condVenda.executeSQL(sql);
        JOptionPane.showMessageDialog(null,"Registrado com sucesso");
    }
    
     public ResultSet listarProduto(){
        ResultSet tabela;
        tabela = null;
        
        String sql= "Select * from venda";
        tabela = condVenda.RetornarResultset(sql);
     return tabela;   
    }
     
     public void excluir(){
        String sql;
        sql= "Delete from venda where codigo="+ getCodigo();
        condVenda.executeSQL(sql);
        JOptionPane.showMessageDialog(null, "Registro excluido com sucesso...");
    }
    
     public void alterar(){
        String sql;
        sql="Update venda set codigo='"+ getCodigo()+"', nome_prod='"+ getName_produto()+"', nome_vende='"+getName_vendedor()+"' where codigo="+ getCodigo();
        condVenda.executeSQL(sql);
        JOptionPane.showMessageDialog(null, "Registro alterado com sucesso...");
        
    }
}
