package ressacasbar.drinks.adicionais.frutas;

import ressacasbar.Drink;

public class Cereja extends Drink{

	Drink drink;
	
	public Cereja(Drink drink) {
		this.drink = drink;
	}
	public String getDescricao() {
		return (drink.getDescricao() + " + Cereja");
	}
	
	@Override
	public double custo() {
		return 2.50 + drink.custo();
	}

}
