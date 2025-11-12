package Aufgabe4;

public class TimeExamples {
	
	public static void main(String[] args) {
		
		System.out.println("Aufgabe 4a");
		System.out.println(formatTime(1,2,3));
		System.out.println("\n\nAufgabe 4b");
		formatTimeFromSeconds(18101);
		System.out.println("\n\nAufgabe 4c");
		timeDifference(14, 20, 33, 14, 21,21);
	}
	
	public static String formatTime(int hours, int minutes, int seconds)
	{
		return String.format("Aktuelle Uhrzeit: %02d:%02d:%02d Uhr", hours, minutes, seconds);
	}
	
	public static void formatTimeFromSeconds(int x)
	{
		int hours = x/3600;
		int minutes = (x%3600)/60;
		int seconds =  (x%3600)%60;
		System.out.format("Aktuelle Uhrzeit: 0%1d:0%1d:%1d Uhr", hours, minutes, seconds);
	}
	
	public static void timeDifference(int hoursA, int minutesA, int secondsA, int hoursB, int minutesB, int secondsB)
	{
		
		int hours = hoursB - hoursA;
		int hours2secs = hours * 3600;
		int minutes = minutesB - minutesA;
		int minutes2secs = minutes * 60;
		int seconds = secondsB - secondsA;
		int allSecs = hours2secs + minutes2secs +seconds;
		System.out.format("Zwischen %1d:%1d:%1d Uhr und %1d:%1d:%1d Uhr sind %1d Sekunden vergangen", hoursA, minutesA, secondsA, hoursB, minutesB, secondsB, allSecs);;
	}
}

