package br.com.academia.utils;

/**
 * Cont�m informa��es sobre todas as unidades usadas no programa.
 * 
 * @author Jos� do Carmo de Melo Silva
 *
 */


public enum Unidades {
		DISTANCIA("Dist�ncia", "Km"), CALORIA("Caloria", "kcal"), ELEVACAO("Elevac�o", "m"),
		MINUTO("Minuto", "\'"), SEGUNDO("Segundo", "\""), VELOCIDADE("Velocidade", "Km/h"),
		RITMO("Ritmo", "/Km"), PESO("Peso", "kg"), ALTURA("Altura", "m"), PASSOS("Passos", "N�mero de Passos");
		
		private String nome;
		private String unidade;
		
		
		private Unidades(String nome, String unidade) {
			this.nome = nome;
			this.unidade = unidade;
		}


		public String getNome() {
			return nome;
		}


		public void setNome(String nome) {
			this.nome = nome;
		}


		public String getUnidade() {
			return unidade;
		}


		public void setUnidade(String unidade) {
			this.unidade = unidade;
		}
		
}