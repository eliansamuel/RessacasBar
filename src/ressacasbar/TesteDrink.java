package ressacasbar;

import ressacasbar.drinks.adicionais.bebidas.Saque;
import ressacasbar.drinks.adicionais.bebidas.Vodka;
import ressacasbar.drinks.adicionais.condimentos.Acucar;
import ressacasbar.drinks.adicionais.condimentos.Adocante;
import ressacasbar.drinks.adicionais.condimentos.Gelo;
import ressacasbar.drinks.adicionais.condimentos.GeloDeCoco;
import ressacasbar.drinks.adicionais.frutas.Abacaxi;
import ressacasbar.drinks.adicionais.frutas.Kiwi;
import ressacasbar.drinks.adicionais.frutas.Morango;
import ressacasbar.drinks.tipos.Caipira;
import ressacasbar.drinks.tipos.Cosmopolitan;
import ressacasbar.drinks.tipos.MoscowMule;
import ressacasbar.drinks.tipos.WhiskyPuro;

public class TesteDrink {

	public static void main(String[] args) {
		
		Drink drink = new Caipira();
		drink = new Saque(drink);
		drink = new Abacaxi(drink);
		drink = new Kiwi(drink);
		drink = new Acucar(drink);
		System.out.println("(" + drink.getDescricao() +")" + " Valor Total = R$ " + drink.custo());
		
		Drink drink2 = new Caipira();
		drink2 = new Vodka(drink2);
		drink2 = new Morango(drink2);
		drink2 = new Adocante(drink2);
		System.out.println("(" + drink2.getDescricao() +")" + " Valor Total = R$ " + drink2.custo());
		
		Drink drink3 = new MoscowMule();
		System.out.println("(" + drink3.getDescricao() + ")" + " Valor Total = R$ " + drink3.custo());
		
		Drink drink4 = new Cosmopolitan();
		drink4 = new Abacaxi(drink4);
		drink4 = new Adocante(drink4);
		drink4 = new Gelo(drink4);
		System.out.println("(" + drink4.getDescricao() + ")" + " Valor Total = R$ " + drink4.custo());
		
		Drink drink5 = new WhiskyPuro();
		drink5 = new GeloDeCoco(drink5);
		System.out.println("(" + drink5.getDescricao() + ")" + " Valor Total = R$ " + drink5.custo());
	}
}
