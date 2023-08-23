package com.modelo.cr;
import javax.swing.JOptionPane;
import javax.swing.JTextArea;

public class ConvertirColonesADivisas {
	
	//convierte de Colones a Dolares estadounidenses
	public void ConvertirColonesADolares(double valor, JTextArea jTextArea) {
		double monedaDolar = valor / 536.72;	//Realiza la operacion para convertir
		monedaDolar = (double) Math.round(monedaDolar *100d)/100;  //Le quita decimales a la operacion
		jTextArea.append(String.valueOf(monedaDolar));//imprime el resultado en un JtextArea en la PantallaConvertirDivisas
	}
	
	public void ConvertirColonesAEuros(double valor, JTextArea jTextArea) {
		double monedaEuro = valor * 0.0017;	//Realiza la operacion para convertir
		monedaEuro = (double) Math.round(monedaEuro *100)/100;  //Le quita decimales a la operacion
		jTextArea.append(String.valueOf(monedaEuro));//imprime el resultado en un JtextArea en la PantallaConvertirDivisas
	}
	
	public void ConvertirColonesAYenJapones(double valor, JTextArea jTextArea) {
		double monedaYen = valor * 0.27;	//Realiza la operacion para convertir
		monedaYen = (double) Math.round(monedaYen *100d)/100;  //Le quita decimales a la operacion
		jTextArea.append(String.valueOf(monedaYen));//imprime el resultado en un JtextArea en la PantallaConvertirDivisas
	}
	
	public void ConvertirColonesAFrancoZuizo(double valor, JTextArea jTextArea) {
		double monedaFranco = valor * 0.0016;	//Realiza la operacion para convertir
		monedaFranco = (double) Math.round(monedaFranco *100d)/100;  //Le quita decimales a la operacion
		jTextArea.append(String.valueOf(monedaFranco));//imprime el resultado en un JtextArea en la PantallaConvertirDivisas
	}
	
	public void ConvertirColonesALibraEsterlina(double valor, JTextArea jTextArea) {
		double monedaLibra = valor  * 0.0015;	//Realiza la operacion para convertir
		monedaLibra = (double) Math.round(monedaLibra *100d)/100;  //Le quita decimales a la operacion
		jTextArea.append(String.valueOf(monedaLibra));//imprime el resultado en un JtextArea en la PantallaConvertirDivisas
	}
	
	public void ConvertirColonesAWonSurCoreano(double valor, JTextArea jTextArea) {
		double monedaWon = valor  * 2.48;	//Realiza la operacion para convertir
		monedaWon = (double) Math.round(monedaWon *100d)/100;  //Le quita decimales a la operacion
		jTextArea.append(String.valueOf(monedaWon));//imprime el resultado en un JtextArea en la PantallaConvertirDivisas
	}
	
	public void ConvertirColonesAPesoMexicano(double valor, JTextArea jTextArea) {
		double monedaPeso = valor * 0.031;	//Realiza la operacion para convertir
		monedaPeso = (double) Math.round(monedaPeso *100d)/100;  //Le quita decimales a la operacion
		jTextArea.append(String.valueOf(monedaPeso));//imprime el resultado en un JtextArea en la PantallaConvertirDivisas
	}
	
}


