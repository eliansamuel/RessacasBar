package ressacasbar.drinks.adicionais.frutas;

import ressacasbar.Drink;
import ressacasbar.DrinkDecorator;

public class Limao extends DrinkDecorator{

	Drink drink;
	
	public Limao(Drink drink) {
		this.drink = drink;
	}
	public String getDescricao() {
		return (drink.getDescricao() + " + Limão");
	}
	
	@Override
	public double custo() {
		return 1.00 + drink.custo();
	}

}
