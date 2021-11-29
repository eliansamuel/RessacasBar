package ressacasbar.drinks.adicionais.bebidas;

import ressacasbar.Drink;

public class VermuteSeco extends Drink{

	Drink drink;
	
	public VermuteSeco(Drink drink) {
		this.drink = drink;
	}
	public String getDescricao() {
		return (drink.getDescricao() + " + Vermute Seco");
	}
	
	@Override
	public double custo() {
		return 12.0 + drink.custo();
	}

}
