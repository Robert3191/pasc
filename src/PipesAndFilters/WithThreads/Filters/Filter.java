package PipesAndFilters.WithThreads.Filters;

import PipesAndFilters.NoThreads.Product.Product;
import PipesAndFilters.NoThreads.Worker.Worker;
import PipesAndFilters.WithThreads.Pipes.Pipe;
import PipesAndFilters.WithThreads.Exceptions.*;

public class Filter implements Runnable {
	
	private Pipe pipeIN;
	private Pipe pipeOUT;
	
	private Worker worker;
	
	public Filter(Worker worker)
	{
		this.worker = worker;
	}
	
	private synchronized Product readData() 
	{
		Product product = pipeIN.readData();
		
		while(product == null){
			try {
				this.wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		return worker.addComponent(product);
		
	}

	private synchronized void writeData(Product product)
	{
		while(pipeOUT.writeData(product) ==  false)
		{
			try {
				this.wait();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
			
			
	}

	@Override
	public void run()
	{	
		Product product = readData();
		while(product == null)
			try {
				wait();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		
		
	writeData(product);
	}

}
