package polymorphism;

import java.lang.*;
import java.lang.Override;

/**
 * Created by dabao on 2016/10/27.
 */
class AlertStatus{
	public String getStatus() {
		return "none";
	}
}
class RedAlertStatus extends AlertStatus{
	@Override
	public String getStatus() {
		return "Red";
	}
}

class YellowAlertStatus extends AlertStatus{
	@Override
	public String getStatus() {
		return "Yellow";
	}
}

class GreenAlertStatus extends AlertStatus{
	@Override
	public String getStatus() {
		return "Green";
	}
}

class StarShip{
	private AlertStatus status = new GreenAlertStatus();
	public void setStatus(AlertStatus istatus)
	{
		status = istatus;
	}

	public String toString(){
		return status.getStatus();
	}
}
public class E16_Starship {
	public static void main(String[] args)
	{
		StarShip eprise = new StarShip();
		System.out.println(eprise);
		eprise.setStatus(new YellowAlertStatus());
		System.out.println(eprise);
		eprise.setStatus(new RedAlertStatus());
		System.out.println(eprise);
	}
}
