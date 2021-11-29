package ressacasbar.drinks.adicionais.bebidas;

import ressacasbar.Drink;
import ressacasbar.DrinkDecorator;

public class LeiteDeCoco extends DrinkDecorator{

	Drink drink;
	
	public LeiteDeCoco(Drink drink) {
		this.drink = drink;
	}
	public String getDescricao() {
		return (drink.getDescricao() + " + Leite de Coco");
	}
	
	@Override
	public double custo() {
		return 3.0 + drink.custo();
	}

}
