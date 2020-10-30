package hilos;

public class HiloConRunnable 
{

	public static void main(String[] args)
	{
		HiloRun misHilos =new HiloRun();
		
		Thread PrimerHilo = new Thread(misHilos);
		Thread SegundoHilo = new Thread(misHilos);
		Thread TercerHilo = new Thread(misHilos);
		
		PrimerHilo.setName("Primer Hilo");
		PrimerHilo.setName("Segundo Hilo");
		PrimerHilo.setName("Tercer Hilo");
		
		PrimerHilo.start();
		SegundoHilo.start();
		TercerHilo.start();
		
		try 
		{
			PrimerHilo.join();
			SegundoHilo.join();
			TercerHilo.join();
		} catch(InterruptedException e) {e. printStackTrace();} 
		
		System.out.println("Termina hilos Main.");
		
		

	}

}

   class HiloRun implements Runnable
{
	@Override
	
	public void run()
	{
		for (int x=0; x<10; x++)
		{
			String nombreHilo = Thread.currentThread().getName();
			System.out.println(nombreHilo);
		}
	}
	
}
