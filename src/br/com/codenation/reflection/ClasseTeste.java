package br.com.codenation.reflection;

import java.math.BigDecimal;

public class ClasseTeste {
	
	@Soma
    private BigDecimal atributoA =  new BigDecimal(10.6);
    private BigDecimal atributoC =  new BigDecimal(10.6);
    private BigDecimal atributoD =  new BigDecimal(10.6);
    
    @Soma
    private BigDecimal atributoB = new BigDecimal(10.6);

	public BigDecimal getAtributoA() {
		return atributoA;
	}

	public void setAtributoA(BigDecimal atributoA) {
		this.atributoA = atributoA;
	}

	public BigDecimal getAtributoC() {
		return atributoC;
	}

	public void setAtributoC(BigDecimal atributoC) {
		this.atributoC = atributoC;
	}

	public BigDecimal getAtributoD() {
		return atributoD;
	}

	public void setAtributoD(BigDecimal atributoD) {
		this.atributoD = atributoD;
	}

	public BigDecimal getAtributoB() {
		return atributoB;
	}

	public void setAtributoB(BigDecimal atributoB) {
		this.atributoB = atributoB;
	}


}
