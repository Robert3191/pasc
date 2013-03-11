package PipesAndFilters.NoThreads.Worker;


import PipesAndFilters.NoThreads.Components.Components;
import PipesAndFilters.NoThreads.Components.Feet;
import PipesAndFilters.NoThreads.Product.Product;

public class WorkerAssembleFeet extends Worker {

	private String name;
	private float time = 40;
	private Components component = new Feet();

	
	public WorkerAssembleFeet(String name)
	{
		this.name = name;
	}
	
	public WorkerAssembleFeet(String name, float handicap)
	{
		this(name);
		this.time = this.time * handicap;
	}
	
	@Override
	public Product addComponent(Product product) 
	{
		product.addComponent(component);
		System.out.println("Worker:" + this.name + " has added feet to:" + product + " in:" + time + "mins");
		
		return product;
	}
	
	

}
