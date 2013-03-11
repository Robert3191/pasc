package PipesAndFilters.NoThreads;

import PipesAndFilters.NoThreads.Filters.Filter;
import PipesAndFilters.NoThreads.Product.Chair;
import PipesAndFilters.NoThreads.Product.Product;
import PipesAndFilters.NoThreads.ProductionLine.ProductionLine;
import PipesAndFilters.NoThreads.Worker.Worker;
import PipesAndFilters.NoThreads.Worker.WorkerAssembleBackRest;
import PipesAndFilters.NoThreads.Worker.WorkerAssembleFeet;
import PipesAndFilters.NoThreads.Worker.WorkerAssembleStabilizerBar;
import PipesAndFilters.NoThreads.Worker.WorkerCutSeat;
import PipesAndFilters.NoThreads.Worker.WorkerPackage;


public class Client {

	public static void main(String args[])
	{
		Product scaun = new Chair();
		
		Worker workerBR 	= new WorkerAssembleBackRest("Petre",5);
		Worker workerF 		= new WorkerAssembleFeet("Vasile",(float) 0.5);
		Worker workerSB 	= new WorkerAssembleStabilizerBar("Gheo");
		Worker workerCS 	= new WorkerCutSeat("Ion");
		Worker workerP		= new WorkerPackage("Petru");
		
		Filter flBR 	= new Filter(workerBR);
		Filter flF 		= new Filter(workerF);
		Filter flSB 	= new Filter(workerSB);
		Filter flCS 	= new Filter(workerCS);
		Filter flP 		= new Filter(workerP);
		
		ProductionLine LinieProductie1 = new ProductionLine();
		
		LinieProductie1.addFilter(flBR);
		LinieProductie1.addFilter(flF);
		LinieProductie1.addFilter(flSB);
		LinieProductie1.addFilter(flCS);
		LinieProductie1.addFilter(flP);
		
		LinieProductie1.startFactory(scaun);
		
		scaun.getComponents();
	}
}
