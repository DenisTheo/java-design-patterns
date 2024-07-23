package fr.diginamic.composite;

public class TestComposite
{
	Employe dir = new Employe("RASPEY", "Cécile", 10000.0);
	Employe archi = new Employe("BECHKAR", "Bilel", 8000.0);

	Employe cds1 = new Employe("RANMEY", "JB", 7500.0);
	Employe concepteur = new Employe("DOE", "Jeanne", 3500.0);

	Employe cds2 = new Employe("GUINEAU", "Kévin", 7500.0);
	Employe leadDev = new Employe("MARTIN", "Paul", 3500.0);

	Service dsin = new Service("DSIN");
	Service bigData = new Service("Big Data");
	Service javaDev = new Service("Java Dev");
	/*
	dsin.addElement("BigData");
	dsin.addElement("Java Dev");
	
	dsin.addElement(dir);
	dsin.addElement(archi);

	bigData.addElement(csds1);
	bigData.addElement(concepteur);

	javaDev.addElement(csds2);
	javaDev.addElement(leadDev);
	
	System.out.println(bigData.calculerSalaire());
	System.out.println(javaDev.calculerSalaire());
	System.out.println(dsin.calculerSalaire());*/
}
