package br.com.universidade.tela;

import javax.swing.JOptionPane;

public class Magica {
	
	public static float f(String msg) {
		return Float.parseFloat(t(msg));
	}
	public static int i(String msg) {
		return Integer.parseInt(t(msg));
	}
	
	public static String t(String msg) {
		return JOptionPane.showInputDialog(msg).toLowerCase();
	}
	
	public static double d(String msg) {
		return Double.parseDouble(t(msg));
	}
}
