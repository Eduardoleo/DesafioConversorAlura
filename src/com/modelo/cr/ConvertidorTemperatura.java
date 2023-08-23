package com.modelo.cr;

import javax.swing.JTextArea;

public class ConvertidorTemperatura {
	
	public void GradosCelsiusAGradosFahrenheit(double valor, JTextArea jTextArea) {
		double temperatura = (valor * 9/5) + 32;
		jTextArea.append(String.valueOf( temperatura + "°F"));//imprime el resultado en un JtextArea en la PantallaCOnvertirTEmperatura
	}
	
	public void GradosCelsiusAGradosKelvin(double valor, JTextArea jTextArea) {
		double temperatura = valor + 273.15;
		jTextArea.append(String.valueOf( temperatura + " K"));//imprime el resultado en un JtextArea en la PantallaCOnvertirTEmperatura
	}
	
	public void GradosCelsiusAGradosRankine(double valor, JTextArea jTextArea) {
		double temperatura = (valor + 273.15) * 9/5;
		jTextArea.append(String.valueOf( temperatura + "°R"));//imprime el resultado en un JtextArea en la PantallaCOnvertirTEmperatura
	}
	
	public void GradosFahrenheitAGradosCelsius(double valor, JTextArea jTextArea) {
		double temperatura = (valor - 32) * 5/9;
		temperatura = (double) Math.round(temperatura *100d)/100;  //Le quita decimales a la operacion
		jTextArea.append(String.valueOf( temperatura + "\u00B0C"));//imprime el resultado en un JtextArea en la PantallaCOnvertirTEmperatura
	}
	
	public void GradosFahrenheitAGradosKelvin(double valor, JTextArea jTextArea) {
		double temperatura =  (valor + 459.67) * 5/9;
		temperatura = (double) Math.round(temperatura *100d)/100;  //Le quita decimales a la operacion
		jTextArea.append(String.valueOf( temperatura + " K "));//imprime el resultado en un JtextArea en la PantallaCOnvertirTEmperatura
	}
	
	public void GradosFahrenheitAGradosRankine(double valor, JTextArea jTextArea) {
		double temperatura = valor + 459.67;
		temperatura = (double) Math.round(temperatura *100d)/100;  //Le quita decimales a la operacion
		jTextArea.append(String.valueOf( temperatura + "°R"));//imprime el resultado en un JtextArea en la PantallaCOnvertirTEmperatura
	}
	
	public void GradosKelvinAGradosCelsius(double valor, JTextArea jTextArea) {
		double temperatura = valor - 273.15;
		temperatura = (double) Math.round(temperatura *100d)/100;  //Le quita decimales a la operacion
		jTextArea.append(String.valueOf( temperatura + "\u00B0C"));//imprime el resultado en un JtextArea en la PantallaCOnvertirTEmperatura
	}
	
	public void GradosKelvinAGradosFahrenheit(double valor, JTextArea jTextArea) {
		double temperatura =(valor * 9/5) - 459.67;
		jTextArea.append(String.valueOf( temperatura + "°F"));//imprime el resultado en un JtextArea en la PantallaCOnvertirTEmperatura
	}
	
	public void GradosKelvinAGradosRankine(double valor, JTextArea jTextArea) {
		double temperatura = valor * 9/5;
		temperatura = (double) Math.round(temperatura *100d)/100;  //Le quita decimales a la operacion
		jTextArea.append(String.valueOf( temperatura + "°R"));//imprime el resultado en un JtextArea en la PantallaCOnvertirTEmperatura
	}
	
	public void GradosRankineAGradosCelsius(double valor, JTextArea jTextArea) {
		double temperatura = (valor - 491.67) * 5/9 ;
		temperatura = (double) Math.round(temperatura *100d)/100;  //Le quita decimales a la operacion
		jTextArea.append(String.valueOf( temperatura + "\u00B0C"));//imprime el resultado en un JtextArea en la PantallaCOnvertirTEmperatura
	}
	
	public void GradosRankineAGradosKelvin(double valor, JTextArea jTextArea) {
		double temperatura = valor * 5/9;
		temperatura = (double) Math.round(temperatura *100d)/100;  //Le quita decimales a la operacion
		jTextArea.append(String.valueOf( temperatura + " K"));//imprime el resultado en un JtextArea en la PantallaCOnvertirTEmperatura
	}
	
	public void GradosRankineAGradosFahrenheit(double valor, JTextArea jTextArea) {
		double temperatura = valor - 459.67;
		jTextArea.append(String.valueOf( temperatura + "°F"));//imprime el resultado en un JtextArea en la PantallaCOnvertirTEmperatura
	}
	
}
