package modelo;

public enum CombustivelEnum {
		
		DIESEL(1, "Oleo Disel"), COMUM(2, "Gasolina Comum"), ADITIVADA(3, "Gasolina Aditivada"), ETANOL(4, "Etanol");
		
		private String descricao;
		
		private CombustivelEnum(int codigo, String descricao) {
			this.descricao = descricao;
		}
		
		@Override
		public String toString() {
			// TODO Auto-generated method stub
			return this.descricao;
		}
		
	}