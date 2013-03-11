package PipesAndFilters.NoThreads.Worker;

import PipesAndFilters.NoThreads.Components.Components;
import PipesAndFilters.NoThreads.Components.Package;

import PipesAndFilters.NoThreads.Product.Product;

public class WorkerPackage extends Worker {

	private String name;
	private float time = 10;
	private Components component = new Package();
	
	
	public WorkerPackage(String name)
	{
		this.name = name;
	}
	
	public WorkerPackage(String name, float handicap)
	{
		this(name);
		this.time = this.time * handicap;
	}
	
	@Override
	public Product addComponent(Product product) 
	{
		product.addComponent(component);
		System.out.println("Worker:" + name + " has pack the: " + product + " in:" + time + "mins");
		
		return product;
	}
	

}
