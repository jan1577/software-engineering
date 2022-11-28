package main;

public class client {
	
	public static void main(String args[]) {
		
		Composite Olympics = new Composite("Olympics Teams", 420, 69);
		
		 Team teakwondo = new Team("Women's Teakwondo", 25, 3);
	     Team waterpolo = new Team("Women's Waterpolo", 22, 2);
	     Team artisticGymnastics = new Team("Women's Artistic Gymnastics", 10, 6);

	     Composite womenChina = new Composite("Women", 200, 31);
	     womenChina.addComp(teakwondo);
	     womenChina.addComp(waterpolo);
	     womenChina.addComp(artisticGymnastics);

	     Team shooting = new Team("Men's Shooting", 10, 1);

	     Composite menChina = new Composite("Men", 99, 3);
	     menChina.addComp(shooting);


	     Composite chinaTeam = new Composite("China", 200, 100);
	     chinaTeam.addComp(womenChina);
	     chinaTeam.addComp(menChina);

	     Composite asiaTeam = new Composite("Asia", 100, 32);
	     asiaTeam.addComp(chinaTeam);

	     // europe
	     //germany

	     Team cycling = new Team("Women's Cycling", 55, 10);
	     Team tennis = new Team("Women's Tennis", 32, 4);

	     Composite womenGermany = new Composite("Women", 22, 12);
	     womenGermany.addComp(cycling);
	     womenGermany.addComp(tennis);

	     Team tableTennis = new Team("Men's Table Tennis", 15, 7);
	     Team footballGermany = new Team("Men's Football", 68, 10);

	     Composite menGermany = new Composite("Men", 23, 13);
	     menGermany.addComp(tableTennis);
	     menGermany.addComp(footballGermany);

	     Composite germanyTeam = new Composite("Germany", 19, 5);
	     germanyTeam.addComp(womenGermany);
	     germanyTeam.addComp(menGermany);

	     // italy

	     Team alpineSki = new Team("Women's Alpine Ski", 35, 11);

	     Composite womenItaly = new Composite("Women", 22, 9);
	     womenItaly.addComp(alpineSki);

	     Team footballItaly = new Team("Men's Football", 78, 8);
	     Team swimming = new Team("Men's Swimming", 45, 12);

	     Composite menItaly = new Composite("Men", 9, 2);
	     menItaly.addComp(footballItaly);
	     menItaly.addComp(swimming);

	    Composite italyTeam = new Composite("Italy", 23, 9);
	    italyTeam.addComp(womenItaly);
	    italyTeam.addComp(menItaly);


		Composite europeTeam = new Composite("Europe", 24, 8);
		europeTeam.addComp(germanyTeam);
		europeTeam.addComp(italyTeam);

	    // olympic team

	    Composite olympicTeam = new Composite("Olympic Team", 19, 1);
	    olympicTeam.addComp(asiaTeam);
	    olympicTeam.addComp(europeTeam);
	}

}
