package ressacasbar.drinks.adicionais.bebidas;

import ressacasbar.Drink;

public class Tequila extends Drink{

	Drink drink;
	
	public Tequila(Drink drink) {
		this.drink = drink;
	}
	public String getDescricao() {
		return (drink.getDescricao() + " + Tequila");
	}
	
	@Override
	public double custo() {
		return 7.0 + drink.custo();
	}

}
