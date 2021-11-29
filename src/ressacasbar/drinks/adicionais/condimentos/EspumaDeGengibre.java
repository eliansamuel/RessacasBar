package ressacasbar.drinks.adicionais.condimentos;

import ressacasbar.Drink;

public class EspumaDeGengibre extends Drink{

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
