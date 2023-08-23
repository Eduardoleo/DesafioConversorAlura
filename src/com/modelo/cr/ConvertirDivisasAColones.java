package com.modelo.cr;

import javax.swing.JTextArea;

public class ConvertirDivisasAColones {
	
	public void ConvertirDolaresAColones(double valor, JTextArea jTextArea) {
		double monedaDolar = valor * 536.72;	//Realiza la operacion para convertir
		monedaDolar = (double) Math.round(monedaDolar *100d)/100;  //Le quita decimales a la operacion
		jTextArea.append(String.valueOf(monedaDolar));//imprime el resultado en un JtextArea en la PantallaConvertirDivisas
	}
	
	public void ConvertirEurosAColones(double valor, JTextArea jTextArea) {
		double monedaEuro = valor * 582.08;	//Realiza la operacion para convertir
		monedaEuro = (double) Math.round(monedaEuro *100)/100;  //Le quita decimales a la operacion
		jTextArea.append(String.valueOf(monedaEuro));//imprime el resultado en un JtextArea en la PantallaConvertirDivisas
	}
	
	public void ConvertirYenJaponesAColones(double valor, JTextArea jTextArea) {
		double monedaYen = valor * 3.68;	//Realiza la operacion para convertir
		monedaYen = (double) Math.round(monedaYen *100d)/100;  //Le quita decimales a la operacion
		jTextArea.append(String.valueOf(monedaYen));//imprime el resultado en un JtextArea en la PantallaConvertirDivisas
	}
	
	public void ConvertirFrancoZuizoAColones(double valor, JTextArea jTextArea) {
		double monedaFranco = valor * 609.71;	//Realiza la operacion para convertir
		monedaFranco = (double) Math.round(monedaFranco *100d)/100;  //Le quita decimales a la operacion
		jTextArea.append(String.valueOf(monedaFranco));//imprime el resultado en un JtextArea en la PantallaConvertirDivisas
	}
	
	public void ConvertirLibraEsterlinaAColones(double valor, JTextArea jTextArea) {
		double monedaLibra = valor * 683.26;	//Realiza la operacion para convertir
		monedaLibra = (double) Math.round(monedaLibra *100d)/100;  //Le quita decimales a la operacion
		jTextArea.append(String.valueOf(monedaLibra));//imprime el resultado en un JtextArea en la PantallaConvertirDivisas
	}
	
	public void ConvertirWonSurCoreanoAColones(double valor, JTextArea jTextArea) {
		double monedaWon = valor  * 0.40;	//Realiza la operacion para convertir
		monedaWon = (double) Math.round(monedaWon *100d)/100;  //Le quita decimales a la operacion
		jTextArea.append(String.valueOf(monedaWon));//imprime el resultado en un JtextArea en la PantallaConvertirDivisas
	}
	
	public void ConvertirPesoMexicanoAColones(double valor, JTextArea jTextArea) {
		double monedaPeso = valor * 31.74;	//Realiza la operacion para convertir
		monedaPeso = (double) Math.round(monedaPeso *100d)/100;  //Le quita decimales a la operacion
		jTextArea.append(String.valueOf(monedaPeso));//imprime el resultado en un JtextArea en la PantallaConvertirDivisas
	}
}
