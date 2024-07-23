package fr.diginamic.composite;

import java.util.ArrayList;
import java.util.List;

public class Service implements IElement
{
	public String nom;
	private List<IElement> elements = new ArrayList<>();
	
	public Service(String nom)
	{
		this.nom = nom;
	}
	
	public void addElement(IElement element)
	{
		elements.add(element);
	}
	
	@Override
	public double calculerSalaire()
	{
		return 0;
	}
}
