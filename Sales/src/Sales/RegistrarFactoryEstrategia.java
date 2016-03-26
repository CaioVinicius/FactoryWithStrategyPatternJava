package Sales;

public class RegistrarFactoryEstrategia {
	private static FactoryEstrategia estrategia;
	
	public static FactoryEstrategia getFactoryEstrategia(){
		if(estrategia == null){
			return estrategia = new FactoryEstrategia();
		}
		return estrategia;
	}
}