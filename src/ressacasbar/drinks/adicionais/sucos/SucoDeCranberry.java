package ressacasbar.drinks.adicionais.sucos;

import ressacasbar.Drink;

public class SucoDeCranberry extends Drink{

	Drink drink;
	
	public SucoDeCranberry(Drink drink) {
		this.drink = drink;
	}
	public String getDescricao() {
		return (drink.getDescricao() + " + Suco de Cranberry");
	}
	
	@Override
	public double custo() {
		return 3.00 + drink.custo();
	}

}
