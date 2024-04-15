package view;

import lib.model.Fila;
import model.Pessoa;
import controller.ParqueController;
import java.util.Random;

public class Principal
{
	public static void main(String[] args)
	{
		ParqueController pc = new ParqueController();
		Fila<Pessoa> fila = new Fila<>();
		Random r = new Random();

		for (int i = 0; i < 30; i++)
			fila.insert (new Pessoa(listaNomes(i), r.nextInt(31) + 10, (double)(r.nextInt(66) + 135) / 100));
		pc.brinquedo(fila);
	}

	private static String listaNomes(int index)
	{
		switch (index) {
			case 0: return			"Hidrogênio";
			case 1: return			"Hélio";
			case 2: return			"Berílio";
			case 3: return			"Magnésio";
			case 4: return			"Potássio";
			case 5: return			"Argônio";
			case 6: return			"Rubídio";
			case 7: return			"Dúbnio";
			case 8: return			"Háfnio";
			case 9: return			"Vanádio";
			case 10: return			"Tálio";
			case 11: return			"Nióbio";
			case 12: return			"Escândio";
			case 13: return			"Estrôncio";
			case 14: return			"Césio";
			case 15: return			"Frâncio";
			case 16: return			"Ítrio";
			case 17: return			"Ruthefórdio";
			case 18: return			"Seabórgio";
			case 19: return			"Bóhrio";
			case 20: return			"Hássio";
			case 21: return			"Meitnério";
			case 22: return			"Darmstádio";
			case 23: return			"Roentgênio";
			case 24: return			"Térbio";
			case 25: return			"Gadolínio";
			case 26: return			"Hólmio";
			case 27: return			"Netúnio";
			case 28: return			"Berquélio";
			case 29: return			"Nobélio";
			default: return			"";
		}
	}
}