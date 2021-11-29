package ressacasbar.drinks.adicionais.frutas;

import ressacasbar.Drink;
import ressacasbar.DrinkDecorator;

public class Amora extends DrinkDecorator{

	Drink drink;
	
	public Amora(Drink drink) {
		this.drink = drink;
	}
	public String getDescricao() {
		return (drink.getDescricao() + " + Amora");
	}
	
	@Override
	public double custo() {
		return 2.00 + drink.custo();
	}

}
