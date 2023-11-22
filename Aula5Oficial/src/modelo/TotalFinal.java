package modelo;

public class TotalFinal {
	
		public float aVista (float oleo, float combustivel) {
			float valorTotal = oleo + combustivel;
			return valorTotal;
		}
		
		public float aPrazo (float oleo, float combustivel, int dias) {
			
			float valorTotal = oleo + combustivel;
			float parcela = valorTotal/dias;
			
			if(dias >= 30) {
				
				dias = (int) (valorTotal * 0.1);
			}
			return parcela;
		}
	}