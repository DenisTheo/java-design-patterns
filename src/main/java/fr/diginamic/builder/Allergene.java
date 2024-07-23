package fr.diginamic.builder;

public class Allergene extends Element
{
	public Allergene(String nom, double quantite)
	{
		super (nom, quantite);
	}
	
	@Override
	public String toString()
	{
		return "Additif[" + super.toString() + "]";
	}
}
