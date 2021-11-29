package ressacasbar.drinks.adicionais.frutas;

import ressacasbar.Drink;
import ressacasbar.DrinkDecorator;

public class Morango extends DrinkDecorator{

	Drink drink;
	
	public Morango(Drink drink) {
		this.drink = drink;
	}
	public String getDescricao() {
		return (drink.getDescricao() + " + Morango");
	}
	
	@Override
	public double custo() {
		return 1.50 + drink.custo();
	}

}
