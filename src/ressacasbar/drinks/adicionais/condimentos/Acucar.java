package ressacasbar.drinks.adicionais.condimentos;

import ressacasbar.Drink;
import ressacasbar.DrinkDecorator;

public class Acucar extends DrinkDecorator{

	Drink drink;
	
	public Acucar(Drink drink) {
		this.drink = drink;
	}
	public String getDescricao() {
		return (drink.getDescricao() + " + Açúcar");
	}
	
	@Override
	public double custo() {
		return 1.50 + drink.custo();
	}

}
