package model;

public class Gasolina {
	
	public float calcularLitros(float preco, float pagamento) {
		float litros = pagamento / preco;
		return litros;
	}

}