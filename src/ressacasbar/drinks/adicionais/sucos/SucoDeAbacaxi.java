package ressacasbar.drinks.adicionais.sucos;

import ressacasbar.Drink;
import ressacasbar.DrinkDecorator;

public class SucoDeAbacaxi extends DrinkDecorator{

	Drink drink;
	
	public SucoDeAbacaxi(Drink drink) {
		this.drink = drink;
	}
	public String getDescricao() {
		return (drink.getDescricao() + " + Suco de Abacaxi");
	}
	
	@Override
	public double custo() {
		return 3.00 + drink.custo();
	}

}
