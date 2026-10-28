package main;

import java.util.ArrayList;

public class TestZaMeteoPodatak {

	public static void main(String[] args) {
		ArrayList<MeteoPodatak> niz = new ArrayList<MeteoPodatak> ();
		niz.add(new MeteoPodatak("PG", "2026-10-25 00:11:11" , 43, 73 ,1004));
		niz.add(new MeteoPodatak("NK", "2026-10-25 00:11:11" , 9, 32 ,1004));
		niz.add(new MeteoPodatak("PG", "2026-10-25 13:19:11" , 43, 12 ,1004));
		niz.add(new MeteoPodatak("DG", "2026-10-25 16:11:11" , 10, 68 ,1004));
		
		ArrayList<MeteoPodatak> x = MeteoPodatak.izdvojPodatkeStanice(niz,"PG", "2026-10-25");
		for (MeteoPodatak a : x) {
			  System.out.println(a);
		}
}
}
