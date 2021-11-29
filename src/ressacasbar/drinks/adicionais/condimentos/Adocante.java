package ressacasbar.drinks.adicionais.condimentos;

import ressacasbar.Drink;
import ressacasbar.DrinkDecorator;

public class Adocante extends DrinkDecorator{

	Drink drink;
	
	public Adocante(Drink drink) {
		this.drink = drink;
	}
	public String getDescricao() {
		return (drink.getDescricao() + " + Adoçante");
	}
	
	@Override
	public double custo() {
		return 2.00 + drink.custo();
	}

}
