package ressacasbar.drinks.adicionais.sucos;

import ressacasbar.Drink;
import ressacasbar.DrinkDecorator;

public class SucoDeCranberry extends DrinkDecorator{

	Drink drink;
	
	public SucoDeCranberry(Drink drink) {
		this.drink = drink;
	}
	public String getDescricao() {
		return (drink.getDescricao() + " + Suco de Cranberry");
	}
	
	@Override
	public double custo() {
		return 3.00 + drink.custo();
	}

}
