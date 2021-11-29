package ressacasbar.drinks.adicionais.bebidas;

import ressacasbar.Drink;
import ressacasbar.DrinkDecorator;

public class Rum extends DrinkDecorator{

	Drink drink;
	
	public Rum(Drink drink) {
		this.drink = drink;
	}
	public String getDescricao() {
		return (drink.getDescricao() + " + Rum");
	}
	
	@Override
	public double custo() {
		return 10.0 + drink.custo();
	}

}
