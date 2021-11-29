package ressacasbar.drinks.adicionais.condimentos;

import ressacasbar.Drink;

public class AngosturaBitter extends Drink{

	Drink drink;
	
	public AngosturaBitter(Drink drink) {
		this.drink = drink;
	}
	public String getDescricao() {
		return (drink.getDescricao() + " + Angostura Bitter");
	}
	
	@Override
	public double custo() {
		return 5.00 + drink.custo();
	}

}
