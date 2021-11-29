package ressacasbar.drinks.adicionais.bebidas;

import ressacasbar.Drink;

public class LicorDeCoco extends Drink{

	Drink drink;
	
	public LicorDeCoco(Drink drink) {
		this.drink = drink;
	}
	public String getDescricao() {
		return (drink.getDescricao() + " + Licor de Coco");
	}
	
	@Override
	public double custo() {
		return 8.0 + drink.custo();
	}

}
