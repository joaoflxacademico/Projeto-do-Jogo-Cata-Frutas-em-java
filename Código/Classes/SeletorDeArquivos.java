package cata_frutas;
import java.io.*;
public class SeletorDeArquivos {
	File PastaMae;
	String CaminhoPastaImagens;
	public SeletorDeArquivos(File x) {
		 if (x.exists() && x.isFile()) {
	            System.out.println("Arquivo encontrado: " + x.getAbsolutePath());
	        }
		this.PastaMae=x.getParentFile();
		if (PastaMae.exists() && PastaMae.isFile()) {
            System.out.println("Arquivo encontrado: " + PastaMae.getAbsolutePath());
        }
		this.CaminhoPastaImagens= PastaMae.getAbsolutePath()+ File.separator +"imagens";
	}
	 
	public String DescreverCaminhoDaImagem(String NomeImagem) {
		return (CaminhoPastaImagens+ File.separator +NomeImagem);
	}
}
