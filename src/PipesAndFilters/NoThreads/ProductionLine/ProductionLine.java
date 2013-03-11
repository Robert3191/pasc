package PipesAndFilters.NoThreads.ProductionLine;

import java.util.ArrayList;

import PipesAndFilters.NoThreads.Filters.Filter;
import PipesAndFilters.NoThreads.Product.Product;

public class ProductionLine {

	private ArrayList<Filter> prodLineFilters = new ArrayList<Filter>();
	
	public void addFilter(Filter filter)
	{
		prodLineFilters.add(filter);
	}
	
	public void startFactory(Product product)
	{
		prodLineFilters.trimToSize();

		Filter filter;
		int i;
		
		for(i = 0; i < prodLineFilters.size()-1; i ++)
		{

			filter = prodLineFilters.get(i);

			filter.startFilter(prodLineFilters.get(i+1));	
		}
		
		prodLineFilters.get(prodLineFilters.size()-1).setLastFilter();
		prodLineFilters.get(0).doJob(product);
		
		
	}
}
