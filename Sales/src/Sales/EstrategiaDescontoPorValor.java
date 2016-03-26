package Sales;

public class EstrategiaDescontoPorValor implements IEstrategiaPrecoVendas{

	@Override
	public float getTotal(float valor) {
		return valor-=10;
	}

}
