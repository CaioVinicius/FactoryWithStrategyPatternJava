package Sales;

public class FactoryEstrategia {
	
	public IEstrategiaPrecoVendas getEstrategiaPrecoVendas(String type){
		if(type.equalsIgnoreCase("estrategiadescontoporvalor")){
			return new EstrategiaDescontoPorValor();
		}
		else if(type.equalsIgnoreCase("estrategiadescontoporporcentagem")){
			return new EstrategiaDescontoPorPorcentagem();
		}
		return null;
	}
}
