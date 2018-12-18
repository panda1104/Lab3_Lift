package lift;

public class Passenger implements Runnable{
private Lift lift;
Passenger(Lift l){
	lift = l;
}
@Override
public void run() {
	// TODO Auto-generated method stub
	lift.process();
}
}
