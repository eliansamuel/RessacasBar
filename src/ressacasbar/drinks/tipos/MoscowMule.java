package ressacasbar.drinks.tipos;

import ressacasbar.Drink;

// A bebida leva vodka, suco de limao, xarope de acucar, angostura bitter e espuma de gengibre
public class MoscowMule extends Drink{
	
	public MoscowMule() {
		descricao = "Moscow Mule";
	}

	@Override
	public double custo() {
		return 30.0;
	}
}
