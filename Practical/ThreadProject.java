class TicketBookingSystem{
	private int total_seats;
	// parametrized contructor
	TicketBookingSystem(int seats){
		this.total_seats=seats;
	}
	synchronized void bookSeat(int seats) {
		if(total_seats>=seats) {
			System.out.println("your "+seats+ " is booked ");
			total_seats=total_seats-seats;
			System.out.println("Avaliable seats :"+total_seats);
		}
		else {
			System.out.println("Seats cannot booked");
		   System.out.println("Avaliable seats :"+total_seats);
		
	}
}
}
public class ThreadProject  extends Thread{
	static TicketBookingSystem book; // object of TicketBookingSystem 
	 int seat;
	public void run() {
		book.bookSeat(seat);
	}

	public static void main(String[] args) {
		
		book= new TicketBookingSystem(40);
		ThreadProject p1 = new ThreadProject();
		p1.seat=10;
		p1.start();
		ThreadProject anu = new ThreadProject();
		anu.seat=5;
		anu.start();
		ThreadProject v = new ThreadProject();
		v.seat=20;
		v.start();
		ThreadProject jk = new ThreadProject();
		jk.seat=10;
		jk.start();
		ThreadProject suga = new ThreadProject();
		suga.seat=2;
		suga.start();
		
	}

}
