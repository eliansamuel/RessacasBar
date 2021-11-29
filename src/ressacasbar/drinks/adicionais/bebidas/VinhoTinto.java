package ressacasbar.drinks.adicionais.bebidas;

import ressacasbar.Drink;
import ressacasbar.DrinkDecorator;

public class VinhoTinto extends DrinkDecorator{

	Drink drink;
	
	public VinhoTinto(Drink drink) {
		this.drink = drink;
	}
	public String getDescricao() {
		return (drink.getDescricao() + " + Vinho Tinto");
	}
	
	@Override
	public double custo() {
		return 7.0 + drink.custo();
	}

}
