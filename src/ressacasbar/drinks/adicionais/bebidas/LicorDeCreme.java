package ressacasbar.drinks.adicionais.bebidas;

import ressacasbar.Drink;

public class LicorDeCreme extends Drink{

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
