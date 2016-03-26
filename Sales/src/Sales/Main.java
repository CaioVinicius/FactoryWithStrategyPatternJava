package Sales;

public class Main {
	
	public static void main(String[] args){
		Produto produto = new Produto("produto",1000);
		
		FactoryEstrategia f = RegistrarFactoryEstrategia.getFactoryEstrategia();
		
		IEstrategiaPrecoVendas estrategiaPorValor = f.getEstrategiaPrecoVendas("estrategiadescontoporvalor");
		IEstrategiaPrecoVendas estrategiaPorPorcentagem = f.getEstrategiaPrecoVendas("estrategiadescontoporporcentagem");
		
		System.out.println("Valor Estratégia por valor: "+estrategiaPorValor.getTotal(produto.getValor()));
		System.out.println("Valor Estratégia por Porcentagem: "+estrategiaPorPorcentagem.getTotal(produto.getValor()));
	}
}
