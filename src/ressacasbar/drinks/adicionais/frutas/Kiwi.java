package ressacasbar.drinks.adicionais.frutas;

import ressacasbar.Drink;
import ressacasbar.DrinkDecorator;

public class Kiwi extends DrinkDecorator{

	Drink drink;
	
	public Kiwi(Drink drink) {
		this.drink = drink;
	}
	public String getDescricao() {
		return (drink.getDescricao() + " + Kiwi");
	}
	
	@Override
	public double custo() {
		return 2.00 + drink.custo();
	}

}
