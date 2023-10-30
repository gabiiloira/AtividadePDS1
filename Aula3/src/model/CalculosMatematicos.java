package model;

public class CalculosMatematicos{
	
	public float calcularAdicao(float PrimeiroNum, float SegundoNum){
		
		float adicao = PrimeiroNum + SegundoNum;
		return adicao;
		
	    }

	public float calcularSubtracao(float PrimeiroNum, float SegundoNum){
		
		float subtracao = PrimeiroNum - SegundoNum;
		return subtracao;
		
	}
	
	public float calcularMultiplicacao(float PrimeiroNum, float SegundoNum) {
		
		float multiplicacao = PrimeiroNum * SegundoNum;
		return multiplicacao;
		
	}
	
	public float calcularDivisao(float PrimeiroNum, float SegundoNum) {
		
		float divisao = PrimeiroNum / SegundoNum;
		return divisao;
	}
}