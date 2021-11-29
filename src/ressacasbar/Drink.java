package ressacasbar;

public abstract class Drink {
	
	protected String descricao;
	
	public String getDescricao() {
		return descricao;
	}

	public abstract double custo();
}
