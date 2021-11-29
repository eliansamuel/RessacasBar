package ressacasbar.drinks.tipos;

import ressacasbar.Drink;

public class Caipira extends Drink{
	
	public Caipira() {
		descricao = "Caípira";
	}

	@Override
	public double custo() {
		return 10.0;
	}
}
