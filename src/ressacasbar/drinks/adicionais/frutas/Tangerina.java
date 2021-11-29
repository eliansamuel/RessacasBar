package ressacasbar.drinks.adicionais.frutas;

import ressacasbar.Drink;

public class Tangerina extends Drink{

	Drink drink;
	
	public Tangerina(Drink drink) {
		this.drink = drink;
	}
	public String getDescricao() {
		return (drink.getDescricao() + " + Tangerina");
	}
	
	@Override
	public double custo() {
		return 1.00 + drink.custo();
	}

}
