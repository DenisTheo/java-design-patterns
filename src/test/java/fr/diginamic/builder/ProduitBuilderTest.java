package fr.diginamic.builder;

import static org.junit.Assert.*;
import org.junit.Test;

public class ProduitBuilderTest
{
	ProduitBuilder builder;
	
	@Test
	public void test()
	{
		Produit prod = new ProduitBuilder("concentré de tomates")
						.addIngredient(new Ingredient("tomate", 70000))
						.addAdditif(new Additif("colorant", 500))
						.addAdditif(new Additif("Sucre", 15000))
						.build();

		assertEquals(prod.getNom(), "concentré de tomates");
		assertEquals(prod.getAdditifList().size(), 2);
		assertEquals(prod.getAllergeneList().size(), 0);
		
		prod = new  ProduitBuilder("fail").build();
		
		assertEquals(prod, null);
	}
}
