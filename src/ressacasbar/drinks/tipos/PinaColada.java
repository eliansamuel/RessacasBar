package ressacasbar.drinks.tipos;

import ressacasbar.Drink;

// A bebida leva rum, leite de coco, suco de abacaxi, açúcar e gelo
public class PinaColada extends Drink{
	
	public PinaColada() {
		descricao = "Piña Colada";
	}

	@Override
	public double custo() {
		return 25.0;
	}
}
