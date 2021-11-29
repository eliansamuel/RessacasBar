package ressacasbar.drinks.adicionais.sucos;

import ressacasbar.Drink;

public class SucoDeLimao extends Drink{

	Drink drink;
	
	public SucoDeLimao(Drink drink) {
		this.drink = drink;
	}
	public String getDescricao() {
		return (drink.getDescricao() + " + Suco de Lim�o");
	}
	
	@Override
	public double custo() {
		return 3.00 + drink.custo();
	}

}
