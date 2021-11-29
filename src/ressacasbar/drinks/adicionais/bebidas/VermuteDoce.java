package ressacasbar.drinks.adicionais.bebidas;

import ressacasbar.Drink;

public class VermuteDoce extends Drink{

	Drink drink;
	
	public VermuteDoce(Drink drink) {
		this.drink = drink;
	}
	public String getDescricao() {
		return (drink.getDescricao() + " + Vermute Doce");
	}
	
	@Override
	public double custo() {
		return 10.0 + drink.custo();
	}

}
