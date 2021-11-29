package ressacasbar.drinks.adicionais.bebidas;

import ressacasbar.Drink;

public class Gin extends Drink{

	Drink drink;
	
	public Gin(Drink drink) {
		this.drink = drink;
	}
	public String getDescricao() {
		return (drink.getDescricao() + " + Gin");
	}
	
	@Override
	public double custo() {
		return 10.0 + drink.custo();
	}

}
