package ressacasbar.drinks.tipos;

import ressacasbar.Drink;

// A bebida leva gin, vermute doce, campari e uma rodela de laranja
public class Negroni extends Drink{
	
	public Negroni() {
		descricao = "Negroni";
	}

	@Override
	public double custo() {
		return 35.0;
	}
}
