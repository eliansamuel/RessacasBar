package ressacasbar.drinks.tipos;

import ressacasbar.Drink;

public class WhiskyPuro extends Drink{
	
	public WhiskyPuro() {
		descricao = "Whisky";
	}

	@Override
	public double custo() {
		return 20.0;
	}
}
