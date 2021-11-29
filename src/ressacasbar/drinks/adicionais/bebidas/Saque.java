package ressacasbar.drinks.adicionais.bebidas;

import ressacasbar.Drink;

public class Saque extends Drink{

	Drink drink;
	
	public Saque(Drink drink) {
		this.drink = drink;
	}
	public String getDescricao() {
		return (drink.getDescricao() + " + Saquê");
	}
	
	@Override
	public double custo() {
		return 5.0 + drink.custo();
	}

}
