package ressacasbar.drinks.adicionais.bebidas;

import ressacasbar.Drink;

public class LicorDeLaranja extends Drink{

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
