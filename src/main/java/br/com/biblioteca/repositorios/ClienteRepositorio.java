package main.java.br.com.biblioteca.repositorios;

import main.java.br.com.biblioteca.banco.ComandosDMLBanco;
import main.java.br.com.biblioteca.entidades.ClienteEntidade;
import main.java.br.com.biblioteca.repositorios.interfaces.ClienteRepositorioInterface;
import main.java.br.com.biblioteca.utilitarios.construtores.consultas.ClienteConsulta;
import main.java.br.com.biblioteca.utilitarios.construtores.consultas.interfaces.ClienteConsultaInterface;
import main.java.br.com.biblioteca.utilitarios.conversores.ConversorEntidade;

import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class ClienteRepositorio implements ClienteRepositorioInterface {

    private final ClienteConsultaInterface clienteQueryInterface = new ClienteConsulta();

    @Override
    public Boolean criar(ClienteEntidade entidade) {
        try {
            ComandosDMLBanco.executarInsercao(clienteQueryInterface, entidade);
            return Boolean.TRUE;
        } catch (Exception exception) {
            exception.printStackTrace();//todo: Colocar um JAlert aqui para avisar.
            return Boolean.FALSE;
        }
    }

    @Override
    public Boolean atualizar(ClienteEntidade entidade) {
        try {
            ComandosDMLBanco.executarAtualizacao(clienteQueryInterface, entidade);
            return Boolean.TRUE;
        } catch (Exception exception) {
            throw new RuntimeException(exception);
        }
    }

    @Override
    public List<ClienteEntidade> buscarTodos() {
        List<ClienteEntidade> clienteEntidades = new ArrayList<>();
        try {
            ResultSet resultSet = ComandosDMLBanco.executarConsultaBuscandoTudo(clienteQueryInterface);
            while (resultSet.next()) {
                clienteEntidades.add(
                    ConversorEntidade.resultSetParaCliente(resultSet)
                );
            }
            return clienteEntidades;
        } catch (Exception exception) {
            throw new RuntimeException(exception);
        }
    }

    @Override
    public Optional<ClienteEntidade> buscarPorId(Integer id) {
        try {
            ResultSet resultSet = ComandosDMLBanco.executarConsultaPorId(clienteQueryInterface, id);
            if (resultSet.next()) {
                return Optional.of(ConversorEntidade.resultSetParaCliente(resultSet));
            }
            return Optional.empty();
        } catch (Exception exception) {
            throw new RuntimeException(exception);
        }
    }

    @Override
    public Boolean deletarPorId(Integer id) {
        try {
            ComandosDMLBanco.executarExclusaoPorId(clienteQueryInterface, id);
            return Boolean.TRUE;
        } catch (Exception exception) {
            throw new RuntimeException(exception);
        }
    }

    @Override
    public Boolean deletarTodos() {
        try {
            ComandosDMLBanco.executarExclusao(clienteQueryInterface);
            return Boolean.TRUE;
        } catch (Exception exception) {
            throw new RuntimeException(exception);
        }
    }

    @Override
    public Optional<ClienteEntidade> buscarPorCpf(String cpf) {
        try {
            String query = clienteQueryInterface.buscarPorCpf(cpf);
            ResultSet resultSet = ComandosDMLBanco.executarConsulta(query);
            if (resultSet.next()) {
                return Optional.of(ConversorEntidade.resultSetParaCliente(resultSet));
            }
            return Optional.empty();
        } catch (Exception exception) {
            throw new RuntimeException(exception);
        }
    }

    @Override
    public List<ClienteEntidade> buscarTodosAtivos() {
        List<ClienteEntidade> clienteEntidades = new ArrayList<>();
        try {
            String query = clienteQueryInterface.buscarTodosAtivos();

            ResultSet resultSet = ComandosDMLBanco.executarConsulta(query);
            while (resultSet.next()) {
                clienteEntidades.add(
                    ConversorEntidade.resultSetParaCliente(resultSet)
                );
            }
            return clienteEntidades;
        } catch (Exception exception) {
            exception.printStackTrace();//todo: Colocar um JAlert aqui para avisar.
            return clienteEntidades;
        }
    }

    @Override
    public Boolean inativar(Integer id) {
        try {
            String query = clienteQueryInterface.inativar(id);
            ComandosDMLBanco.executar(query);
            return Boolean.TRUE;
        } catch (Exception exception) {
            throw new RuntimeException(exception);
        }
    }
}
