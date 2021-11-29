package ressacasbar.drinks.adicionais.condimentos;

import ressacasbar.Drink;

public class Sal extends Drink{

	Drink drink;
	
	public Sal(Drink drink) {
		this.drink = drink;
	}
	public String getDescricao() {
		return (drink.getDescricao() + " + Sal");
	}
	
	@Override
	public double custo() {
		return 0.50 + drink.custo();
	}

}
