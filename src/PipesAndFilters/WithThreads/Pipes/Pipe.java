package PipesAndFilters.WithThreads.Pipes;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.Queue;

import PipesAndFilters.NoThreads.Product.Product;


public class Pipe {
	
	Queue<Product> productData = new LinkedList<Product>();
	private int bufferMax;
	private int bufferSize = 0;
	
	public Pipe(int bufferMax)
	{
		this.bufferMax = bufferMax;
	}
	
	public boolean writeData(Product product)
	{
		if(bufferSize == bufferMax)
			return false;
		
		productData.add(product);
		bufferSize ++;
		
		return true;
	}
	
	public Product readData()
	{
		bufferSize --;
		notifyAll();
		return productData.poll();
		
	}

}
