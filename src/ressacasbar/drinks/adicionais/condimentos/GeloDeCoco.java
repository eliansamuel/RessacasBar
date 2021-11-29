package ressacasbar.drinks.adicionais.condimentos;

import ressacasbar.Drink;

public class GeloDeCoco extends Drink{

	Drink drink;
	
	public GeloDeCoco(Drink drink) {
		this.drink = drink;
	}
	public String getDescricao() {
		return (drink.getDescricao() + " + Gelo de Coco");
	}
	
	@Override
	public double custo() {
		return 1.50 + drink.custo();
	}

}
