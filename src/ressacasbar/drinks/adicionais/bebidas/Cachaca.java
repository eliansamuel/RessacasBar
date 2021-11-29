package ressacasbar.drinks.adicionais.bebidas;

import ressacasbar.Drink;

public class Cachaca extends Drink{

	Drink drink;
	
	public Cachaca(Drink drink) {
		this.drink = drink;
	}
	public String getDescricao() {
		return (drink.getDescricao() + " + Cacha�a");
	}
	
	@Override
	public double custo() {
		return 5.0 + drink.custo();
	}

}
