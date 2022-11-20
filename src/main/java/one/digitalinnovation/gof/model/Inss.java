package one.digitalinnovation.gof.model;

import javax.persistence.Entity;


public class Inss extends Imposto {

	@Override
	public void atualiza(double v) {
		this.valor = v*0.14;
	}

}
