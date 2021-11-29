package ressacasbar.drinks.adicionais.condimentos;

import ressacasbar.Drink;
import ressacasbar.DrinkDecorator;

public class EspumaDeGengibre extends DrinkDecorator{

	Drink drink;
	
	public EspumaDeGengibre(Drink drink) {
		this.drink = drink;
	}
	public String getDescricao() {
		return (drink.getDescricao() + " + Espuma de Gengibre");
	}
	
	@Override
	public double custo() {
		return 3.00 + drink.custo();
	}

}
