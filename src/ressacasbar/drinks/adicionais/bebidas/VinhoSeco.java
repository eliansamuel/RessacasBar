package ressacasbar.drinks.adicionais.bebidas;

import ressacasbar.Drink;

public class VinhoSeco extends Drink{

	Drink drink;
	
	public VinhoSeco(Drink drink) {
		this.drink = drink;
	}
	public String getDescricao() {
		return (drink.getDescricao() + " + Vinho Seco");
	}
	
	@Override
	public double custo() {
		return 8.0 + drink.custo();
	}

}
