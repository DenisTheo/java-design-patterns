package fr.diginamic.builder;

import java.util.ArrayList;
import java.util.List;

public class ProduitBuilder
{
	private String nom;
    private String grade;
    private Categorie categorie;
    private Marque marque;
    private List<Ingredient> ingredientList = new ArrayList<>();
    private List<Allergene> allergeneList = new ArrayList<>();
    private List<Additif> additifList = new ArrayList<>();

    
    public ProduitBuilder(String nom)
    {
        this.nom = nom;
        grade = null;
        categorie = null;
        marque = null;
        ingredientList = new ArrayList<>();
        allergeneList = new ArrayList<>();
        additifList = new ArrayList<>();
    }

    public ProduitBuilder setGrade(String grade)
    {
        this.grade = grade;
        return this;
    }

    public ProduitBuilder setCategorie(Categorie categorie)
    {
        this.categorie = categorie;
        return this;
    }

    public ProduitBuilder setMarque(Marque marque)
    {
        this.marque = marque;
        return this;
    }

    public ProduitBuilder addIngredient(Ingredient ingredient)
    {
        ingredientList.add(ingredient);
        return this;
    }

    public ProduitBuilder addAllergene(Allergene allergene)
    {
        allergeneList.add(allergene);
        return this;
    }

    public ProduitBuilder addAdditif(Additif additif)
    {
        additifList.add(additif);
        return this;
    }
	
	public String getNom()
	{
		return this.nom;
	}
	
	public String getGrade()
	{
		return this.grade;
	}
	
	public Categorie getCategorie()
	{
		return this.categorie;
	}
	
	public Marque getMarque()
	{
		return this.marque;
	}
	
	public List<Additif> getAdditifList()
	{
		return this.additifList;
	}
	
	public List<Allergene> getAllergeneList()
	{
		return this.allergeneList;
	}
	
	public List<Ingredient> getIngredientList()
	{
		return this.ingredientList;
	}

    public Produit build()
    {
    	if(ingredientList.size() >= 1)
    		return (Produit) new Produit(this);
    	else
    		return null;
    }

}
