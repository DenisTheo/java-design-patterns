package fr.diginamic.builder;

public class Marque
{
	private String nom;

    public Marque(String nom)
    {
        setNom(nom);
    }

    public String getNom()
    {
        return nom;
    }
    
    public void setNom(String nom)
    {
    	this.nom = nom;
    }
}
