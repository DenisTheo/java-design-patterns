package fr.diginamic.factory;

import fr.diginamic.factory.entities.Element;
import fr.diginamic.factory.enums.Type;
import fr.diginamic.factory.enums.Unite;

public class FactoryTest
{
	public static void main(String[] args)
	{
        Element additif = ElementFactory.Factory(Type.ADDITIF, "colorants", 15.2758, Unite.MICRO_GRAMMES);
        System.out.println(additif);
        
        Element allergene = ElementFactory.Factory(Type.ALLERGENE, "arachides", 25000.0, Unite.MILLI_GRAMMES);
        System.out.println(allergene);

		Element ingredient1 = ElementFactory.Factory(Type.INGREDIENT, "pomme de terre", 1250.3, Unite.MILLI_GRAMMES);
        System.out.println(ingredient1);
		Element ingredient2 = ElementFactory.Factory(Type.INGREDIENT, "riz", 15000, Unite.MILLI_GRAMMES);
        System.out.println(ingredient2);
		Element ingredient3 = ElementFactory.Factory(Type.INGREDIENT, "tomate", 2425.44, Unite.MICRO_GRAMMES);
        System.out.println(ingredient3);
	}
}
