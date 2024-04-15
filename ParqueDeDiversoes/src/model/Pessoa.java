package model;

public class Pessoa
{
	private String nome;
	private int idade;
	private double altura;

	public Pessoa(String nome, int idade, double altura)
	{
		super();
		this.nome = nome;
		this.idade = idade;
		this.altura = altura;
	}

	public String getNome()
	{
		return this.nome;
	}

	public int getIdade() 
	{
		return this.idade;
	}

	public double getAltura()
	{
		return this.altura;
	}

	@Override
	public String toString()
	{
		return "(" + this.nome + " [" + this.idade +"][" + String.format("%.2f", this.altura) + "])";
	}
}
