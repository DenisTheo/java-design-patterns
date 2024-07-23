package fr.diginamic.builder;

public class Ingredient extends Element
{
	public Ingredient(String nom, double quantite)
	{
		super (nom, quantite);
	}
	
	@Override
	public String toString()
	{
		return "Additif[" + super.toString() + "]";
	}
}
