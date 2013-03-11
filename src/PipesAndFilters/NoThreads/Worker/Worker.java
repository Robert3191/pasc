package PipesAndFilters.NoThreads.Worker;

import PipesAndFilters.NoThreads.Product.Product;

public abstract class Worker {
	
//	private String name;
//	
//	public Worker(String name)
//	{
//		this.name = name;
//	}
	
	public abstract Product addComponent(Product product);
	
	
	
}
