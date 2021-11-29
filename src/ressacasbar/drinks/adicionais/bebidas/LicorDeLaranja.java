package ressacasbar.drinks.adicionais.bebidas;

import ressacasbar.Drink;
import ressacasbar.DrinkDecorator;

public class LicorDeLaranja extends DrinkDecorator{

	Drink drink;
	
	public LicorDeLaranja(Drink drink) {
		this.drink = drink;
	}
	public String getDescricao() {
		return (drink.getDescricao() + " + Licor de Laranja");
	}
	
	@Override
	public double custo() {
		return 7.0 + drink.custo();
	}

}
