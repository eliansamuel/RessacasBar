package ressacasbar.drinks.adicionais.frutas;

import ressacasbar.Drink;

public class Limao extends Drink{

	Drink drink;
	
	public Limao(Drink drink) {
		this.drink = drink;
	}
	public String getDescricao() {
		return (drink.getDescricao() + " + Limão");
	}
	
	@Override
	public double custo() {
		return 1.00 + drink.custo();
	}

}
