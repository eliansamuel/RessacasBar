package ressacasbar.drinks.tipos;

import ressacasbar.Drink;

// A bebida leva tequila, sal, suco de limao e licor de laranja
public class Margarita extends Drink{
	
	public Margarita() {
		descricao = "Margarita";
	}

	@Override
	public double custo() {
		return 35.0;
	}
}
