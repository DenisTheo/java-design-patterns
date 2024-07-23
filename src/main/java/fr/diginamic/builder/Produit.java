package fr.diginamic.builder;

import java.util.ArrayList;
import java.util.List;

public class Produit
{
	private String nom;
	private String grade;
	private Categorie categorie;
	private Marque marque;
	private List<Ingredient> ingredientList;
	private List<Allergene> allergeneList;
	private List<Additif> additifList;

	public Produit(ProduitBuilder builder)
	{
        setNom(builder.getNom());
        setGrade(builder.getGrade());
        setCategorie(builder.getCategorie());
        setMarque(builder.getMarque());
        setIngredientList(builder.getIngredientList());
        setAllergeneList(builder.getAllergeneList());
        setAdditifList(builder.getAdditifList());
    }
	
	public void setNom(String nom)
	{
		this.nom = nom;
	}
	
	public String getNom()
	{
		return this.nom;
	}
	
	public void setGrade(String grade)
	{
		this.grade = grade;
	}
	
	public String getGrade()
	{
		return this.grade;
	}
	
	public void setCategorie(Categorie categorie)
	{
		this.categorie = categorie;
	}
	
	public Categorie getCategorie()
	{
		return this.categorie;
	}
	
	public void setMarque(Marque marque)
	{
		this.marque = marque;
	}
	
	public Marque getMarque()
	{
		return this.marque;
	}
	
	public void setAdditifList(List<Additif> additifList)
	{
		this.additifList = additifList;
	}
	
	public List<Additif> getAdditifList()
	{
		return this.additifList;
	}
	
	public void setAllergeneList(List<Allergene> allergeneList)
	{
		this.allergeneList = allergeneList;
	}
	
	public List<Allergene> getAllergeneList()
	{
		return this.allergeneList;
	}
	
	public void setIngredientList(List<Ingredient> ingredientList)
	{
		this.ingredientList = ingredientList;
	}
	
	public List<Ingredient> getIngredientList()
	{
		return this.ingredientList;
	}
	
	@Override
    public String toString()
	{
        return nom + " [grade " + grade + ", categorie " + categorie.getNom() + ", " + marque.getNom()
        	+ ", ingredients: " + ingredientList + ", allergenes: " + allergeneList + ", additifs: " + additifList + "]";
    }
}
