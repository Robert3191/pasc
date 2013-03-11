package PipesAndFilters.NoThreads.Worker;

import PipesAndFilters.NoThreads.Components.BackRest;
import PipesAndFilters.NoThreads.Components.Components;
import PipesAndFilters.NoThreads.Product.Product;

public class WorkerAssembleBackRest extends Worker{
	
	private String name;
	private float time = 15;
	private Components component = new BackRest();

	public WorkerAssembleBackRest(String name)
	{
		this.name = name;
	}
	
	public WorkerAssembleBackRest(String name, float handicap)
	{
		this(name);
		this.time = this.time * handicap;
	}
	
	@Override
	public Product addComponent(Product product) 
	{
		product.addComponent(component);
		System.out.println("Worker:" + this.name + " has added backrest to:" + product + " in:" + time + "mins");
		return product;
	}

}
