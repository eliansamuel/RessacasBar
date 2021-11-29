package ressacasbar.drinks.adicionais.bebidas;

import ressacasbar.Drink;
import ressacasbar.DrinkDecorator;

public class Tequila extends DrinkDecorator{

	Drink drink;
	
	public Tequila(Drink drink) {
		this.drink = drink;
	}
	public String getDescricao() {
		return (drink.getDescricao() + " + Tequila");
	}
	
	@Override
	public double custo() {
		return 7.0 + drink.custo();
	}

}
