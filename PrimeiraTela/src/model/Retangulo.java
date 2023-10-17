package model;

public class Retangulo {
	
		public float calcularArea(float base, float altura) {
			float area = base * altura;
			return area;
		}
		
		public float calcularPerimetro(float base, float altura) {
			float perimetro = (base + altura) * 2;
			return perimetro;
		}

	}