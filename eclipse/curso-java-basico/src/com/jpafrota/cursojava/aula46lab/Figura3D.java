package com.jpafrota.cursojava.aula46lab;

public abstract class Figura3D extends FiguraGeometrica implements DimensaoSuperficial, DimensaoVolumetrica {

	// como a flasse Figura3D j� � abstrata, ela n�o precisa implementar os m�todos das interfaces DimSup e DimVol.
	
	@Override
	public String toString() {
		
		return super.toString() + "�rea: " + this.calcularArea() + "\nVolume: " + this.calcularVolume() + "\n";
		
	} 
}
