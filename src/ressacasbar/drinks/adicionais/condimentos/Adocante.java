package ressacasbar.drinks.adicionais.condimentos;

import ressacasbar.Drink;

public class Adocante extends Drink{

	Drink drink;
	
	public Adocante(Drink drink) {
		this.drink = drink;
	}
	public String getDescricao() {
		return (drink.getDescricao() + " + Adoçante");
	}
	
	@Override
	public double custo() {
		return 2.00 + drink.custo();
	}

}
