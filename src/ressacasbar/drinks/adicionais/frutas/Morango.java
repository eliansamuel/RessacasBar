package ressacasbar.drinks.adicionais.frutas;

import ressacasbar.Drink;

public class Morango extends Drink{

	Drink drink;
	
	public Morango(Drink drink) {
		this.drink = drink;
	}
	public String getDescricao() {
		return (drink.getDescricao() + " + Morango");
	}
	
	@Override
	public double custo() {
		return 1.50 + drink.custo();
	}

}
