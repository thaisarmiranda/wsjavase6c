package br.com.livraria.tela;

import javax.swing.JOptionPane;

public class Magica {

	public static String t(String msg) {
		return JOptionPane.showInputDialog(msg).toUpperCase();
	}
	
	public static int i(String msg) {
		return Integer.parseInt(t(msg));
	}
	
	public static float f(String msg) {
		return Float.parseFloat(t(msg));
	}
	
	public static double d(String msg) {
		return Double.parseDouble(t(msg));
	}
	
	public static boolean b(String msg) {
		return Boolean.parseBoolean(t(msg));
	}
}
