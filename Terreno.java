package cata_frutas;
import java.util.*;

public class Terreno {
	public int dimensao;
	public Elemento[][] terreno;
	public int espacosDisponiveis;
	public int pedra;
	public int[] frutas = new int[7];
	public int[] arvores = new int[7];
	
	public Terreno(int dimensao) {
		this.dimensao = dimensao;
		this.terreno = new Elemento[dimensao][dimensao];
		this.espacosDisponiveis = (dimensao * dimensao) - 2;
	}
	
	public void setPedra(int pedras) {
		if(pedras < this.espacosDisponiveis) {
			this.pedra = pedras;
			this.espacosDisponiveis -= pedras;
		}
		else {
			System.out.printf("\nO número %d de pedras é inválida para a dimensão %d.",pedras, this.dimensao);
		}
	}
	
	public void setFrutas(int[] frutas) {
		int numfrutas = frutas[0] + frutas[1] + frutas[2] + frutas[3] + frutas[4] + frutas[5] + frutas[6];
		if(numfrutas < this.espacosDisponiveis) {
			this.frutas = frutas;
			this.espacosDisponiveis -= numfrutas;
		}
		else {
			System.out.printf("\nO número %d de frutas é inválida para a dimensão %d.",numfrutas, this.dimensao);
		}
	}
	
	public void setArvores(int[] arvores) {
		int numarvores = arvores[1] + arvores[2] + arvores[3] + arvores[4] + arvores[5] + arvores[6];
		if(numarvores < this.espacosDisponiveis) {
			this.arvores = arvores;
			this.espacosDisponiveis -= numarvores;
		}
		else {
			System.out.printf("\nO número %d de árvores é inválida para a dimensão %d.",numarvores, this.dimensao);
		}
	}
	
	
	public int getPedras() {
		return this.pedra;
	}
	
	public int[] getFrutas() {
		return this.frutas;
	}
	
	public int[] getArvores() {
		return this.arvores;
	}
	
	
	/*
	 * ADICIONAR O METODO PARA A CRIACAO DO TERRENO DE EXEMPLO
	public void getExemplo() {
		
	}
	
	
	 * ADICIONAR OS METODOS PARA IMPORTAR E EXPORTAR AS ENTRADAS DA CRIACAO DO TERRENO
	public void importarEntradas() {
		if(this.espacosDisponiveis >= 0) {
			
		}
		else {
			System.out.println("\n Ocorreu um erro na criação do terreno, por favor verifique as entradas utilizadas.");
		}
	}
	
	public void exportarEntradas() {
		
	}
	*/
	
	
}
