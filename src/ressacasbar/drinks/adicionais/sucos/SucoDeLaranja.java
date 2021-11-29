package ressacasbar.drinks.adicionais.sucos;

import ressacasbar.Drink;

public class SucoDeLaranja extends Drink{

	Drink drink;
	
	public SucoDeLaranja(Drink drink) {
		this.drink = drink;
	}
	public String getDescricao() {
		return (drink.getDescricao() + " + Suco de Laranja");
	}
	
	@Override
	public double custo() {
		return 3.00 + drink.custo();
	}

}
