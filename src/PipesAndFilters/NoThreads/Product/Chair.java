package PipesAndFilters.NoThreads.Product;

import java.util.ArrayList;

import PipesAndFilters.NoThreads.Components.Components;

public class Chair extends Product {
	
	private ArrayList<Components> components = new ArrayList<Components>();

	@Override
	public void addComponent(Components component) {
		components.add(component);
	}
	
	public void getComponents()
	{
		String str ="";
		int i;
		
		components.trimToSize();
		
		for(i = 0; i < components.size(); i ++)
		{
			str = str + components.get(i) + "\n";
		}
		
		System.out.println(str);
	}
	public String toString()
	{
		return "Chair";
	}

}
	