package ressacasbar.drinks.tipos;

import ressacasbar.Drink;

// A bebida leva Gin, Vermute Seco e decorado com espiral de tangerina, laranja, limão ou azeitona
public class Martini extends Drink{
	
	public Martini() {
		descricao = "Martíni";
	}

	@Override
	public double custo() {
		return 30.0;
	}
}
