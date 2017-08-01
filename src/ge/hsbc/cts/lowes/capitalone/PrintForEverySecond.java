package ge.hsbc.cts.lowes.capitalone;

import java.util.Timer;
import java.util.TimerTask;

public class PrintForEverySecond {

	public static void main(String[] args) {
		System.out.println("test");

		Timer timer = new Timer();

		timer.schedule(new TimerTask() {
			int count = 1;

			@Override
			public void run() {
				System.out.println("Timer " + count);
				count++;
			}
		}, 0, 1000); //set to 1 sec 60000 is 1 minute

	}

}
