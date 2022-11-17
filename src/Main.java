import java.time.LocalTime;
import java.util.Scanner;

public class Main {
	private static final int wordper_minute =5;

	public static void main(String[] args) {
		System.out.println("Check your typing speed here");
		try {
            Thread.sleep(2000);
        } catch (Exception e) { }
        System.out.println("You are about to start");
        try {
            Thread.sleep(1000);
        } catch (Exception e) { }
        System.out.println("3");
        try {
            Thread.sleep(1000);
        } catch (Exception e) { }
        System.out.println("2");
        try {
            Thread.sleep(1000);
        } catch (Exception e) { }
        System.out.println("1");
        try {
            Thread.sleep(1000);
        } catch (Exception e) { }
        
        double starting_time= LocalTime.now().toNanoOfDay();
        System.out.println("A small giggle, a smile or laughter can change the entire environment and\n"+
        					"brings a positive vibe to the whole surrounding. Nothing in this world can work\n"+
        					"faster than laughter to bring a change in a patient’s condition. When a patient is\n"+
        					"struggling with his own life, the doctor asks him and the entire family to make him \n"+
        					"smile and stay happy. Laughter is the best medicine because it activates the hormones\n"+
        					"and increases the immunity in the human body, making it able to fight against diseases.\n"+
        					"The laughter brings a positive vibe to the human body, and the whole atmosphere is filled\n"+
        					"with positivity. Therefore, laughter is faster healing medicine for everyone.\n");
        System.out.println();

        System.out.print("Start Typing : ");
        Scanner sc =new Scanner(System.in);
        String text = sc.nextLine();
        System.out.println();

        double ending_time=LocalTime.now().toNanoOfDay();
        double tot_time= ending_time -starting_time;
        double sec = tot_time/ 1000000000.0;
        int chars = text.length();
        int wpm=(int)((((double)chars/wordper_minute)/sec)*60);
        System.out.println("You can type "+wpm+" words per minute.\n");
        System.out.println("Run the code to try again\n");
        try {
            Thread.sleep(1000);
        } catch (Exception e) { }
        System.out.println("Thankyou!");
    }
}
