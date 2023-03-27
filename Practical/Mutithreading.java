
//public class Mutithreading  extends Thread{
public class Mutithreading implements Runnable{

	 		private int Threadnumber;
			// TODO Auto-generated method stub
		@Override
public void run() { // this methods override
			for(int i=1;i<=5;i++) {
				System.out.println(i+"thread from" +Threadnumber); // which doing thread 
			} 
	//	if(Threadnumber==3) {
		//	throw new RuntimeException();
	//	}
	
		try {
			Thread.sleep(100);
		}
		catch(InterruptedException e){
			
		}
}
	
		public Mutithreading(int Threadnumber) {
			this.Threadnumber=Threadnumber;
		}
		public static void main(String args[]) {
			for(int i=0;i<=5;i++) {
			 //Mutithreading  me  =  new  Mutithreading(i); //using extends thread
			// me.start(); //using extends threads
			
				Mutithreading me = new Mutithreading(i);//using Runnable
				Thread te = new Thread(me);//using Runnable
				te.start();
				}
			
			
	}

		
}

