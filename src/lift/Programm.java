package lift;

import java.awt.List;
import java.util.ArrayList;

public class Programm {
	public static void main(String[] args) {
       Lift lift = new Lift();
       int n_passangers = 100;
       ArrayList<Thread> thread = new ArrayList<Thread>();
       for(int i = 0; i < n_passangers;++i) {
    	   Passenger p = new Passenger(lift);
    	   Thread t = new Thread(p);
    	   thread.add(t);
       }
       for(Thread t : thread) {
    	   t.start();
       }
    }
}
