package ressacasbar.drinks.adicionais.frutas;

import ressacasbar.Drink;
import ressacasbar.DrinkDecorator;

public class Abacaxi extends DrinkDecorator{

	Drink drink;
	
	public Abacaxi(Drink drink) {
		this.drink = drink;
	}
	public String getDescricao() {
		return (drink.getDescricao() + " + Abacaxi");
	}
	
	@Override
	public double custo() {
		return 1.00 + drink.custo();
	}

}
