package in.pwskills.nitin.bean;

import java.util.Random;

import org.springframework.stereotype.Component;

@Component("bat")
public class CricketBat {
	static {
		System.out.println("CricketBat.class file is loading..");
	}

	public CricketBat() {
		System.out.println("CricketBat Object is created...");
	}

	//BL
	public int scoreRuns() {
		System.out.println("CricketBat.scoreRuns()");
		return new Random().nextInt(200);
	}

}
