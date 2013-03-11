package PipesAndFilters.NoThreads.Worker;

import PipesAndFilters.NoThreads.Components.Components;
import PipesAndFilters.NoThreads.Components.StabilizerBar;
import PipesAndFilters.NoThreads.Product.Product;

public class WorkerAssembleStabilizerBar extends Worker {
	
	private String name;
	private float time = 20;
	private Components component = new StabilizerBar();
	
	
	public WorkerAssembleStabilizerBar(String name)
	{
		this.name = name;
	}
	
	public WorkerAssembleStabilizerBar(String name, float handicap)
	{
		this(name);
		this.time = this.time * handicap;
	}
	@Override
	public Product addComponent(Product product) 
	{
		product.addComponent(component);
		System.out.println("Worker:" + name + " has added stabilezer bar to:" + product + " in:" + time + "mins");
		
		return product;
	}
	
	


}
