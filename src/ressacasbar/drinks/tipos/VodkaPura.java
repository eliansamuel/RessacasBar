package ressacasbar.drinks.tipos;

import ressacasbar.Drink;

public class VodkaPura extends Drink{
	
	public VodkaPura() {
		descricao = "Vodka";
	}

	@Override
	public double custo() {
		return 15.0;
	}
}
