package main.java.br.com.biblioteca.entidades;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class AcervoEntidade {

    private Integer id;

    private String nome;

    private Double valor;

    private Date dataLancamento;

    private Integer paginas;

    private String editora;

    private byte[] foto;
    
    private Boolean ativo;

    public AcervoEntidade() {
    }

    public AcervoEntidade(Integer id) {
        this.id = id;
    }

    public AcervoEntidade(Integer id, String nome, Double valor, Date dataLancamento, Integer paginas, String editora, byte[] foto, Boolean ativo) {
        this.id = id;
        this.nome = nome;
        this.valor = valor;
        this.dataLancamento = dataLancamento;
        this.paginas = paginas;
        this.editora = editora;
        this.foto = foto;
        this.ativo = ativo;
    }
    
    public AcervoEntidade(String nome, Double valor, Date dataLancamento, Integer paginas, String editora, byte[] foto, Boolean ativo) {
        this.nome = nome;
        this.valor = valor;
        this.dataLancamento = dataLancamento;
        this.paginas = paginas;
        this.editora = editora;
        this.foto = foto;
        this.ativo = ativo;
    }
    
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Double getValor() {
        return valor;
    }

    public void setValor(Double valor) {
        this.valor = valor;
    }

    public Date getDataLancamento() {
        return dataLancamento;
    }

    public void setDataLancamento(Date dataLancamento) {
        this.dataLancamento = dataLancamento;
    }

    public Integer getPaginas() {
        return paginas;
    }

    public void setPaginas(Integer paginas) {
        this.paginas = paginas;
    }

    public String getEditora() {
        return editora;
    }

    public void setEditora(String editora) {
        this.editora = editora;
    }

    public byte[] getFoto() {
        return foto;
    }

    public void setFoto(byte[] foto) {
        this.foto = foto;
    }

    public Boolean getAtivo() {
        return ativo;
    }

    public void setAtivo(Boolean ativo) {
        this.ativo = ativo;
    }
}
