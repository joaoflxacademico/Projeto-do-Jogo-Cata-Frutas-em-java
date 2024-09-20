package cata_frutas;
import java.util.*;
import java.math.*;

class Ponto {
	public int x;
	public int y;
	
	public Ponto(int x, int y) {
		this.x = x;
		this.y = y;
	}
	
	public void setX(int x) {
		this.x = x;
	}
	
	public void setY(int y) {
		this.y = y;
	}
	
	public int getX() {
		return this.x;
	}
	
	public int getY() {
		return this.y;
	}
}

class Elemento {
	Ponto posicao;
	
	public Elemento(int x, int y) {
		this.posicao = new Ponto(x,y);
	}
	
	public void setPosicao(int x, int y) {
		this.posicao.setX(x);
		this.posicao.setY(y);
	}
	
	public Ponto getPosicao() {
		return this.posicao;
	}
	
}


class Jogador extends Elemento {
	public String nome;
	public int movimentos;
	public int tamanhoMochila;
	public Mochila mochilaJogador;
	
	public Jogador(int x, int y, String nome,int tamanhoMochila) {
		super(x,y);
		this.nome = nome;
		this.mochilaJogador = new Mochila(tamanhoMochila);
	}
	
	public void movimentar(int direcao) {
		/*
		if(direcao == 1 && this.y <= matriz.length) {
			this.y ++;
		}
		if(direcao == 2 && this.x >= 0) {
			this.x --;
		}
		if(direcao == 3 && this.x <= matriz.length) {
			this.x ++;
		}
		if(direcao == 4 && this.y >= 0) {
			this.y --;
		}
		*/
	}
	
}


class Mochila{
	public Fruta[] mochila;
	
	public Mochila(int tamanho) {
		this.mochila = new Fruta[tamanho];
	}
	
	public Fruta retornaFruta(int posicao) {
		Fruta retorno = null;
		if(posicao > 0 && posicao < this.mochila.length) {
			if(this.mochila[posicao] != null) {
				retorno = this.mochila[posicao];
				}
			else {
				System.out.printf("\nPosição %d inválida para o tamanho %d da mochila.", posicao, this.mochila.length);
			}
		}
		else {
			System.out.printf("\nPosição %d inválida para o tamanho %d da mochila.", posicao, this.mochila.length);
		}
		return retorno;
	}
	
	public void armazenaFruta(Fruta fruta) {
		if(this.mochilaCheia() != true) {
			for(int i = 0; i < this.mochila.length; i++) {
				if(this.mochila[i] == null) {
					this.mochila[i] = fruta;
					System.out.printf("Fruta %s armazenada com sucesso.", fruta.nome);
					break;
				}
			}
		}
	}
	
	public boolean mochilaCheia() {
		boolean resp = false;
		for(int i = 0; i < this.mochila.length; i++) {
			if(this.mochila[i] == null) {
				resp = false;
				break;
			}
			else {
				resp = true;
			}
		}
		return resp;
	}
}


class Gramas extends Elemento {	
	public Gramas(int x, int y) {
		super(x,y);
	}
}

class Pedra extends Elemento {
	public Pedra(int x, int y) {
		super(x,y);
	}
}


abstract class Arvore extends Elemento{
	Fruta tipofruta;
	int ultimaFruta;
	
	public Arvore(int x, int y, Fruta fruta) {
		super(x,y);
		this.tipofruta = fruta;
		this.ultimaFruta = 0;
	}
	
	public Fruta getFruta() {
		Fruta fruta = null;
		if(ultimaFruta == 0) {
			int i = (int) Math.round(Math.random() * 10);
			int j = (int) Math.round(Math.random() * 10);
			int i2 = 0;
			int j2 = 0;
			if((i <= 10) && (i >= 7)) {
				i2 = 1;
			}
			if((i <= 6) && (i >= 4)) {
				i2 = 0;
			}
			if((i <= 3) && (i >= 1)){
				i2 = -1;
			}
			if((j <= 10) && (j >= 7)) {
				j2 = 1;
			}	
			if((j <= 6) && (j >= 4)) {
				j2 = 0;
			}
			if((j <= 3) && (j >= 1)){
				j2 = -1;
			}
			fruta = this.tipofruta;
			fruta.setPosicao(this.posicao.getX() + i2,this.posicao.getY() + j2);
		}
		else {
			fruta = null;
		}
		
		return fruta;
	}
}


abstract class Fruta extends Elemento{
	public String nome;
	public boolean bichada;
	
	public Fruta(int x, int y, String nome, boolean bichada) {
		super(x, y);
		this.nome = nome;
		this.bichada = bichada;
	}
	
	public abstract void efeito();
	
}

class Abacate extends Fruta{
	
	public Abacate(int x, int y, String nome, boolean bichada) {
		super(x,y,nome,bichada);
	}
	
	@Override
 	public void efeito() {
		
	};
}


public class Classes {

	
	
}
