package ressacasbar.drinks.adicionais.bebidas;

import ressacasbar.Drink;
import ressacasbar.DrinkDecorator;

public class Whisky extends DrinkDecorator{

	Drink drink;
	
	public Whisky(Drink drink) {
		this.drink = drink;
	}
	public String getDescricao() {
		return (drink.getDescricao() + " + Whisky");
	}
	
	@Override
	public double custo() {
		return 10.0 + drink.custo();
	}

}
