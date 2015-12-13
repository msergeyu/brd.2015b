package Fixtures.Coffeemaker;

import Coffeemaker.CoffeeMaker;
import fit.ActionFixture;

public class AddInventory extends ActionFixture 
{
	
	private CoffeeMaker CM = new CoffeeMaker();
	private int coffee,milk,sugar,chocolate;
	
	
	public void setcoffee(int coffee)
	{
		this.coffee=coffee;
	}
	public void setmilk(int milk)
	{
		this.milk=milk;
	}
	public void setsugar(int sugar)
	{
		this.sugar=sugar;
	}
	public void setchocolate(int chocolate)
	{
		this.chocolate=chocolate;
	}
	
	public boolean Inventory() 
	{
		return CM.addInventory(coffee, milk, sugar, chocolate);
	}


}

