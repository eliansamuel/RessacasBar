package ressacasbar.drinks.adicionais.frutas;

import ressacasbar.Drink;

public class Laranja extends Drink{

	Drink drink;
	
	public Laranja(Drink drink) {
		this.drink = drink;
	}
	public String getDescricao() {
		return (drink.getDescricao() + " + Laranja");
	}
	
	@Override
	public double custo() {
		return 1.00 + drink.custo();
	}

}
