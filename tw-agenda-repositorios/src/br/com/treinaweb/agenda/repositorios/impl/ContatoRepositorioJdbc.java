package br.com.treinaweb.agenda.repositorios.impl;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.List;

import br.com.treinaweb.agenda.entidades.Contato;
import br.com.treinaweb.agenda.repositorios.interfaces.AgendaRepositorio;

public class ContatoRepositorioJdbc implements AgendaRepositorio<Contato> {

	@Override
	public List<Contato> selecionar() throws SQLException {
		Connection conexao = null;
		conexao = DriverManager.getConnection("jdbc:mysql://localhost:3306/tw_jdbc", "root", "root");
		return null;
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
