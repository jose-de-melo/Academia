package br.com.academia.utils;

import java.net.URL;

public class Recurso {
		/**
		 * Obt�m a localiza��o de um recurso no sistema de arquivos do sistema operacional. 
		 */
		public static URL obterLocalizacao(String nome) {
			return Recurso.class.getResource(nome);
		}
}
