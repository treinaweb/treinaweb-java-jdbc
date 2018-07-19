package br.com.treinaweb.agenda.repositorios.impl;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import br.com.treinaweb.agenda.entidades.Contato;
import br.com.treinaweb.agenda.repositorios.interfaces.AgendaRepositorio;

public class ContatoRepositorioJdbc implements AgendaRepositorio<Contato> {

	@Override
	public List<Contato> selecionar() throws SQLException {
		Connection conexao = null;
		List<Contato> contatos = new ArrayList<Contato>();
		conexao = DriverManager.getConnection("jdbc:mysql://localhost:3306/tw_jdbc", "root", "root");
		Statement comando = conexao.createStatement();
		ResultSet rs = comando.executeQuery("SELECT * FROM contatos");
		while (rs.next()) {
			Contato contato = new Contato();
			contato.setId(rs.getInt("id"));
			contato.setIdade(rs.getInt("idade"));
			contato.setNome(rs.getString("nome"));
			contato.setTelefone(rs.getString("telefone"));
			contatos.add(contato);
		}
		return contatos;
	}

	@Override
	public void inserir(Contato entidade) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void atualizar(Contato entidade) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void excluir(Contato entidade) {
		// TODO Auto-generated method stub
		
	}

}
