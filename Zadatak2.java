package main;

public class Zadatak2 {

	public static void main(String[] args) {
		String s = "c123s015g028t068r002p012h52b10020*CS";
		String izl = dajPodatke(s);
		System.out.println(izl);
	}
	public static String dajPodatke(String s) {
		String izl = " ";
		
		int iT = s.indexOf("t");
		float tt = Float.parseFloat(s.substring(iT+1, iT+4));
		float temp = (tt -32) * 5/90;
		
		int iH = s.indexOf("h");
		float hh = Float.parseFloat(s.substring(iH+1, iH+3));
		
		int iP = s.indexOf("b");
		float pp = Float.parseFloat(s.substring(iP+1, iP+6)) *0.1f;
		
		izl = String.format("\"temp\" = " + temp + ", \"vlaznost\" = " + hh + ", \"pritisak\" = " + pp);
	
		
		return izl;
	}

}
