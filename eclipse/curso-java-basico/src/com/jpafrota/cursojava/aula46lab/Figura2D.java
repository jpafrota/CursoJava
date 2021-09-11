package com.jpafrota.cursojava.aula46lab;

public abstract class Figura2D extends FiguraGeometrica implements DimensaoSuperficial {

	// como a flasse Figura2D j� � abstrata, ela n�o precisa implementar os m�todos da interface DimSup.
	// estes m�todos dever�o ser implementados por suas subclasses.
	
	@Override
	public String toString() {
		
		return super.toString() + "�rea: " + this.calcularArea() + "\n";
		
	} 
	
}
