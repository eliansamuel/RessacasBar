package ressacasbar.drinks.adicionais.condimentos;

import ressacasbar.Drink;
import ressacasbar.DrinkDecorator;

public class Gelo extends DrinkDecorator{

	Drink drink;
	
	public Gelo(Drink drink) {
		this.drink = drink;
	}
	public String getDescricao() {
		return (drink.getDescricao() + " + Gelo");
	}
	
	@Override
	public double custo() {
		return 0.50 + drink.custo();
	}

}
