package ressacasbar.drinks.tipos;

import ressacasbar.Drink;

public class RumPuro extends Drink{
	
	public RumPuro() {
		descricao = "Rum";
	}

	@Override
	public double custo() {
		return 17.0;
	}
}
