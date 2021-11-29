package ressacasbar.drinks.adicionais.frutas;

import ressacasbar.Drink;

public class Abacaxi extends Drink{

	Drink drink;
	
	public Abacaxi(Drink drink) {
		this.drink = drink;
	}
	public String getDescricao() {
		return (drink.getDescricao() + " + Abacaxi");
	}
	
	@Override
	public double custo() {
		return 1.00 + drink.custo();
	}

}
