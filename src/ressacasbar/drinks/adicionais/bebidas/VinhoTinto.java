package ressacasbar.drinks.adicionais.bebidas;

import ressacasbar.Drink;

public class VinhoTinto extends Drink{

	Drink drink;
	
	public VinhoTinto(Drink drink) {
		this.drink = drink;
	}
	public String getDescricao() {
		return (drink.getDescricao() + " + Vinho Tinto");
	}
	
	@Override
	public double custo() {
		return 7.0 + drink.custo();
	}

}
