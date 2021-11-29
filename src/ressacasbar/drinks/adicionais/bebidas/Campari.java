package ressacasbar.drinks.adicionais.bebidas;

import ressacasbar.Drink;
import ressacasbar.DrinkDecorator;

public class Campari extends DrinkDecorator{

	Drink drink;
	
	public Campari(Drink drink) {
		this.drink = drink;
	}
	public String getDescricao() {
		return (drink.getDescricao() + " + Campari");
	}
	
	@Override
	public double custo() {
		return 6.0 + drink.custo();
	}

}
