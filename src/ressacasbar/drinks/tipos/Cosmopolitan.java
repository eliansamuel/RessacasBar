package ressacasbar.drinks.tipos;

import ressacasbar.Drink;

// A bebida leva vodka, licor de laranja ou suco de limão e suco de cranberry
public class Cosmopolitan extends Drink{
	
	public Cosmopolitan() {
		descricao = "Cosmopolitan";
	}

	@Override
	public double custo() {
		return 20.0;
	}
}
