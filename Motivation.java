/*
Motivation.java
@Yo
02/08/17
*/
//This program isn't at its perfection, future modify is expected.
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class Motivation{

		//create an instance of SimpleDateFormat used for formatting
		//String representation of date (M/D/Y)
        DateFormat df = new SimpleDateFormat("MM/dd/yyyy");
		//get the date today using calender objects
		Date today = Calendar.getInstance().getTime();
		//declaring variable and turning date object to String
		private String da = df.format(today);
		private String speech[] = new String [33];// declaring an array of 33 spaces


		//constructor - inserting each qoute to a specific index of the array
		public Motivation(){
			speech[0] = "Strength does not come from winning. Your struggles develop your strengths. When you go through hardships and decide not to surrender, that is strength. - Arnold Schwarzenegger";
			speech[1] =	"The world breaks everyone, and afterward, some are strong at the broken places. - Ernest Hemingway";
			speech[2] = "All the adversity I’ve had in my life, all my troubles and obstacles, have strengthened me.... You may not realize it when it happens, but a kick in the teeth may be the best thing in the world for you. - Walt Disney";
			speech[3] = "There are two ways of exerting one’s strength: one is pushing down, the other is pulling up. - Booker T. Washington";
			speech[4] = "A truly strong person does not need the approval of others any more than a lion needs the approval of sheep. Vernon Howard";
			speech[5] = "I like criticism. It makes you strong. - LeBron James";
			speech[6] = "There are better starters than me but I’m a strong finisher. - Usain Bolt";
			speech[7] = "He who believes is strong; he who doubts is weak. Strong convictions precede great actions. - Louisa May Alcott";
			speech[8] = "Strength and growth come only through continuous effort and struggle. - Napoleon Hill";
			speech[9] = "Make up your mind that no matter what comes your way, no matter how difficult, no matter how unfair, you will do more than simply survive. You will thrive in spite of it. - Joel Osteen";
			speech[10] = "Tough times never last, but tough people do. - Robert H. Schuller";
			speech[11] =  "Difficulties are meant to rouse, not discourage. The human spirit is to grow strong by conflict. - William Ellery Channing";
			speech[12] = "Nothing is more beautiful than the smile that has struggled through the tears. - Demi Lovato";
			speech[13] = "I believe in being strong when everything seems to be going wrong. I believe that happy girls are the prettiest girls. I believe that tomorrow is another day and I believe in miracles. - Audrey Hepburn";
			speech[14] = "That which does not kill us makes us stronger. - Friedrich Nietzsche";
			speech[15] =  "Sometimes you don’t realize your own strength until you come face to face with your greatest weakness. - Susan Gale";
			speech[16] = "Be very strong... be very methodical in your life if you want to be a champion. - Alberto Juantorena";
			speech[17] = "Life is very interesting. In the end, some of your greatest pains become your greatest strengths. - Drew Barrymore";
			speech[18] = "I like feeling strong. It keeps my mental floor higher. - Pink";
			speech[19] = "I love the man that can smile in trouble, that can gather strength from distress, and grow brave by reflection. ’Tis the business of little minds to shrink, but he whose heart is firm, and whose conscience approves his conduct, will pursue his principles unto death. - Thomas Paine";
			speech[20] =  "Stay strong. Stand up. Have a voice. - Shawn Johnson";
			speech[21] = "The Pessimist Sees Difficulty In Every Opportunity. The Optimist Sees The Opportunity In Every Difficulty. - Winston Churchill";
			speech[22] = "Don’t Let Yesterday Take Up Too Much Of Today. -Will Rogers";
			speech[23] = "You Learn More From Failure Than From Success. Don’t Let It Stop You. Failure Builds Character.- Unknown";
			speech[24] = "It’s Not Whether You Get Knocked Down, It’s Whether You Get Up.- Vince Lombardi";
			speech[25] = "If You Are Working On Something That You Really Care About, You Don’t Have To Be Pushed. The Vision Pulls You.- Steve Jobs";
			speech[26] = "People Who Are Crazy Enough To Think They Can Change The World, Are The Ones Who Do.- Rob Siltanen";
			speech[27] = "Failure Will Never Overtake Me If My Determination To Succeed Is Strong Enough.- Og Mandino";
			speech[28] = "Entrepreneurs Are Great At Dealing With Uncertainty And Also Very Good At Minimizing Risk. That’s The Classic Entrepreneur.- Mohnish Pabrai";
			speech[29] = "We May Encounter Many Defeats But We Must Not Be Defeated.- Maya Angelou";
			speech[30] = "Knowing Is Not Enough; We Must Apply. Wishing Is Not Enough; We Must Do. - Johann Wolfgang Von Goethe";
			speech[31] = "Imagine Your Life Is Perfect In Every Respect; What Would It Look Like? - Brian Tracy";
		}
		//compute part where if statements is used for selecting the quote for each date in August
		public void compute(){
			//using .contains method to check if String da hold a certain date and month that I want
			if(da.contains("08/01")){
							System.out.println(speech[0]);
			}
			else if(da.contains("08/02")){
							System.out.println(speech[1]);
			}
			else if(da.contains("08/03")){
							System.out.println(speech[2]);
			}
			else if(da.contains("08/04")){
							System.out.println(speech[3]);
			}
			else if(da.contains("08/05")){
							System.out.println(speech[4]);
			}
			else if(da.contains("08/06")){
							System.out.println(speech[5]);
			}
			else if(da.contains("08/07")){
							System.out.println(speech[6]);
			}
			else if(da.contains("08/08")){
							System.out.println(speech[7]);
			}
			else if(da.contains("08/09")){
							System.out.println(speech[8]);
			}
			else if(da.contains("08/10")){
							System.out.println(speech[9]);
			}
			else if(da.contains("08/11")){
							System.out.println(speech[10]);
			}
			else if(da.contains("08/12")){
							System.out.println(speech[11]);
			}
			else if(da.contains("08/13")){
							System.out.println(speech[12]);
			}
			else if(da.contains("08/14")){
							System.out.println(speech[13]);
			}
			else if(da.contains("08/15")){
							System.out.println(speech[14]);
			}
			else if(da.contains("08/16")){
							System.out.println(speech[15]);
			}
			else if(da.contains("08/17")){
							System.out.println(speech[16]);
			}
			else if(da.contains("08/18")){
							System.out.println(speech[17]);
			}
			else if(da.contains("08/19")){
							System.out.println(speech[18]);
			}
			else if(da.contains("08/20")){
							System.out.println(speech[19]);
			}
			else if(da.contains("08/21")){
							System.out.println(speech[20]);
			}
			else if(da.contains("08/22")){
							System.out.println(speech[21]);
			}
			else if(da.contains("08/23")){
							System.out.println(speech[22]);
			}
			else if(da.contains("08/24")){
							System.out.println(speech[23]);
			}
			else if(da.contains("08/25")){
							System.out.println(speech[24]);
			}
			else if(da.contains("08/26")){
							System.out.println(speech[25]);
			}
			else if(da.contains("08/27")){
							System.out.println(speech[26]);
			}
			else if(da.contains("08/28")){
							System.out.println(speech[27]);
			}
			else if(da.contains("08/29")){
							System.out.println(speech[28]);
			}
			else if(da.contains("08/30")){
							System.out.println(speech[29]);
			}
			else{
							System.out.println(speech[30]);
			}
		}

}
/*
Credits
- https://www.briantracy.com/blog/personal-success/26-motivational-quotes-for-success/
- http://www.success.com/article/21-motivational-quotes-about-strength
*/