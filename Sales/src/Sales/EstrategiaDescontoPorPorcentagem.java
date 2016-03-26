package Sales;

public class EstrategiaDescontoPorPorcentagem implements IEstrategiaPrecoVendas{

	@Override
	public float getTotal(float valor) {
		float percent = (10 * valor)/100;
		return valor-=percent;
	}

}
