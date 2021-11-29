package ressacasbar.drinks.adicionais.bebidas;

import ressacasbar.Drink;

public class LicorDeFrutas extends Drink{

	Drink drink;
	
	public LicorDeFrutas(Drink drink) {
		this.drink = drink;
	}
	public String getDescricao() {
		return (drink.getDescricao() + " + Licor de Frutas");
	}
	
	@Override
	public double custo() {
		return 7.0 + drink.custo();
	}

}
