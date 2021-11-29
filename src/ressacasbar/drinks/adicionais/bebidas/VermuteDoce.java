package ressacasbar.drinks.adicionais.bebidas;

import ressacasbar.Drink;
import ressacasbar.DrinkDecorator;

public class VermuteDoce extends DrinkDecorator{

	Drink drink;
	
	public VermuteDoce(Drink drink) {
		this.drink = drink;
	}
	public String getDescricao() {
		return (drink.getDescricao() + " + Vermute Doce");
	}
	
	@Override
	public double custo() {
		return 10.0 + drink.custo();
	}

}
