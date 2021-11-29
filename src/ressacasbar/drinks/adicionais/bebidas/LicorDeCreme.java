package ressacasbar.drinks.adicionais.bebidas;

import ressacasbar.Drink;
import ressacasbar.DrinkDecorator;

public class LicorDeCreme extends DrinkDecorator{

	Drink drink;
	
	public LicorDeCreme(Drink drink) {
		this.drink = drink;
	}
	public String getDescricao() {
		return (drink.getDescricao() + " + Licor de Creme");
	}
	
	@Override
	public double custo() {
		return 6.0 + drink.custo();
	}

}
