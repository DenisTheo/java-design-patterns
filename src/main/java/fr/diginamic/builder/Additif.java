package fr.diginamic.builder;

public class Additif extends Element
{
	public Additif(String nom, double quantite)
	{
		super (nom, quantite);
	}
	
	@Override
	public String toString()
	{
		return "Additif[" + super.toString() + "]";
	}
}
