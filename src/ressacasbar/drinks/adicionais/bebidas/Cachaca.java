package ressacasbar.drinks.adicionais.bebidas;

import ressacasbar.Drink;
import ressacasbar.DrinkDecorator;

public class Cachaca extends DrinkDecorator{

	Drink drink;
	
	public Cachaca(Drink drink) {
		this.drink = drink;
	}
	public String getDescricao() {
		return (drink.getDescricao() + " + Cachaça");
	}
	
	@Override
	public double custo() {
		return 5.0 + drink.custo();
	}

}
