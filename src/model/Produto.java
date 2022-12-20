package model;

import helper.Utils;

public class Produto {

	private static int contador = 1;

	private int codigo;
	private String nome;
	private Double preco;

	public Produto(String nome, Double preco) {
		this.codigo = Produto.contador;
		this.nome = nome;
		this.preco = preco;
		Produto.contador += 1;
	}

	public int getCodigo() {
		return codigo;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Double getPreco() {
		return preco;
	}

	public void setPreco(Double preco) {
		this.preco = preco;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Código: ");
		builder.append(codigo);
		builder.append("\nNome: ");
		builder.append(nome);
		builder.append("\nPreco: ");
		builder.append(Utils.doubleParaString(preco));
		return builder.toString();
	}

}
