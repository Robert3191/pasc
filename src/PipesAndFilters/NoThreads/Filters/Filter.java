package PipesAndFilters.NoThreads.Filters;

import PipesAndFilters.NoThreads.Product.Product;
import PipesAndFilters.NoThreads.Worker.Worker;

public class Filter {
	
	private Filter nextFilter;
	private Worker worker;
	private Boolean lastFilter=false;
	
	public Filter(Worker worker)
	{
		this.worker		= worker;
	}
	
	public void setLastFilter()
	{
		this.lastFilter = true;
	}
	public void startFilter(Filter nextFilter)
	{
		this.nextFilter = nextFilter;
	}
	
	public Product doJob(Product product)
	{
		if(lastFilter) return worker.addComponent(product);
		else return nextFilter.doJob(worker.addComponent(product));
		
	}

	public String toString()
	{
		return worker.toString();
	}
}
