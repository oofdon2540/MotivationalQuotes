/*
MotivationApp.java
@Yo
02/08/17
*/
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
public class MotivationApp{
	public static void main(String args[]){
		DateFormat df = new SimpleDateFormat("MM/dd/yyyy");

		Date today = Calendar.getInstance().getTime();

		String da = df.format(today);
		String speech[] = new String [3];

		//creates an object
		Motivation myMo = new Motivation();


		myMo.compute();










}
}