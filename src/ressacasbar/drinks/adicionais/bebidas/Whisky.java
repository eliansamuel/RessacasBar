package ressacasbar.drinks.adicionais.bebidas;

import ressacasbar.Drink;

public class Whisky extends Drink{

	Drink drink;
	
	public Whisky(Drink drink) {
		this.drink = drink;
	}
	public String getDescricao() {
		return (drink.getDescricao() + " + Whisky");
	}
	
	@Override
	public double custo() {
		return 10.0 + drink.custo();
	}

}
