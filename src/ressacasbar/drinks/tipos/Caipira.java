package ressacasbar.drinks.tipos;

import ressacasbar.Drink;

public class Caipira extends Drink{
	
	public Caipira() {
		descricao = "Ca�pira";
	}

	@Override
	public double custo() {
		return 10.0;
	}
}
