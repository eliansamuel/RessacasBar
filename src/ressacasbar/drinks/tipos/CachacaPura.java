package ressacasbar.drinks.tipos;

import ressacasbar.Drink;

public class CachacaPura extends Drink{
	
	public CachacaPura() {
		descricao = "Cacha�a";
	}

	@Override
	public double custo() {
		return 10.0;
	}
}
