package ressacasbar.drinks.adicionais.condimentos;

import ressacasbar.Drink;
import ressacasbar.DrinkDecorator;

public class GeloDeCoco extends DrinkDecorator{

	Drink drink;
	
	public GeloDeCoco(Drink drink) {
		this.drink = drink;
	}
	public String getDescricao() {
		return (drink.getDescricao() + " + Gelo de Coco");
	}
	
	@Override
	public double custo() {
		return 1.50 + drink.custo();
	}

}
