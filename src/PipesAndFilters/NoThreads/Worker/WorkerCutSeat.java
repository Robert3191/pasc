package PipesAndFilters.NoThreads.Worker;

import PipesAndFilters.NoThreads.Components.Components;
import PipesAndFilters.NoThreads.Components.CutSeat;
import PipesAndFilters.NoThreads.Product.Product;

public class WorkerCutSeat extends Worker {

	private String name;
	private float time = 10;
	private Components component = new CutSeat();

	
	public WorkerCutSeat(String name)
	{
		this.name = name;
	}
	
	public WorkerCutSeat(String name, float handicap)
	{
		this(name);
		this.time = this.time * handicap;
	}
	
	
	@Override
	public Product addComponent(Product product) 
	{
		product.addComponent(component);
		System.out.println("Worker:" + this.name + " has cut the seat to:" + product + " in:" + time + "mins");
		
		return product;
	}

	
}
