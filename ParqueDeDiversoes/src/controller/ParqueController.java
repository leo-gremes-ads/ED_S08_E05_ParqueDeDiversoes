package controller;

import lib.model.Fila;
import model.Pessoa;

public class ParqueController
{
	public ParqueController()
	{
		super();
	}	

	public void brinquedo(Fila<Pessoa> fila)
	{
		Pessoa p;

		try {
			while (!fila.isEmpty()) {
				p = fila.remove();
				if (p.getAltura() < 1.60)
					System.out.println(p.getNome() + " Não possui altura para entrar no brinquedo!");
				else if (p.getIdade() < 16)
					System.out.println(p.getNome() + " Não possui idade para entrar no brinquedo!");
				else
					System.out.println(p.getNome() + " Entrou no brinquedo!");
			}
		} catch (Exception e) {
			System.out.println("Fila vazia!");

		}
	}
}
