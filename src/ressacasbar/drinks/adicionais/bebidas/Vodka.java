package ressacasbar.drinks.adicionais.bebidas;

import ressacasbar.Drink;
import ressacasbar.DrinkDecorator;

public class Vodka extends DrinkDecorator{

	Drink drink;
	
	public Vodka(Drink drink) {
		this.drink = drink;
	}
	public String getDescricao() {
		return (drink.getDescricao() + " + Vodka");
	}
	
	@Override
	public double custo() {
		return 5.00 + drink.custo();
	}

}
