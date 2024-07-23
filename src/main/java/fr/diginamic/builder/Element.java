package fr.diginamic.builder;

import java.text.DecimalFormat;


public class Element
{
	private String nom;
	private double quantite;
	
	//Constructors
	
	public Element(String nom, double quantite)
	{
		setNom(nom);
		setQuantite(quantite);
	}
	
	public Element() {}
	
	//ToString
	@Override
	public String toString()
	{
        DecimalFormat df = new DecimalFormat("#.###");
		
        return getNom() + ": " + df.format(getQuantite());
	}
	
	//Getters
	
	public String getNom()
	{
		return nom;
	}
	
	public double getQuantite()
	{
		return quantite;
	}
	
	//Setters
	
	public void setNom(String nom)
	{
		this.nom = nom;
	}
	
	public void setQuantite(double quantite)
	{
		this.quantite = quantite;
	}
}
