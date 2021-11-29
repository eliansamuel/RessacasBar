package ressacasbar.drinks.adicionais.condimentos;

import ressacasbar.Drink;
import ressacasbar.DrinkDecorator;

public class XaropeDeAcucar extends DrinkDecorator{

	Drink drink;
	
	public XaropeDeAcucar(Drink drink) {
		this.drink = drink;
	}
	public String getDescricao() {
		return (drink.getDescricao() + " + Xarope de A��car");
	}
	
	@Override
	public double custo() {
		return 2.00 + drink.custo();
	}

}
