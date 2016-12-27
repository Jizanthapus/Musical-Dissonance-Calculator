import java.util.Scanner;

public class dissonance   
{
	public static void main (String[] args) {
		
		// Initialize variables
		String cord = null;
		int numOfNotes;
		Boolean done = false;
		
		// Setup initial objects
		Scanner inMode = new Scanner(System.in);
		Scanner inCord = new Scanner(System.in);
		Scanner inCont = new Scanner(System.in);
		
	while (!done)	{
		
		int mode = 1;
		//System.out.print("Enter 0 for input or 1 for test string: ");
		//int mode = inMode.nextInt();
		//System.out.println();
		
		// Take in chord
		switch(mode) {
		case 1:		System.out.print("Enter your cord as notes with spaces: ");
					cord = inCord.nextLine();
					break;
		case 2: 	cord = "F A C";
					break;
		default:	System.out.println("Invalid Selection, using test string");
					cord = "C E G";
					break;
		}
		
		// Convert input to arraylist
		String[] notes = cord.split(" ");
		
//		//TODO Check for unsupported notes
//		for (String s : notes) {
//			if ((s.equals("A")) || 
//				!s.equals("B") || 
//				!s.equals("C") || 
//				!s.equals("D") ||
//				!s.equals("E") ||
//				!s.equals("F") ||
//				!s.equals("F#") ||
//				!s.equals("C#") ||
//				!s.equals("G#") ||
//				!s.equals("D#") ||
//				!s.equals("A#") ||
//				!s.equals("Gb") ||
//				!s.equals("Db") ||
//				!s.equals("Ab") ||
//				!s.equals("Eb") ||
//				!s.equals("Bb")) {
//				System.out.println("You have entered an unsupported note.");
//				System.out.println("Valid notes are: A B C .");
//			}
//		}
		
		// Start int array based on number of notes
		int[] notesInt = new int[notes.length];
		numOfNotes = notes.length;
		
		// Assign numerical 0s to notes
		for (int i = 0; i < notes.length; i++) {
			if (notes[i].equals("C")) {
				notesInt[i] = 0;
			}
			if (notes[i].equals("G")) {
				notesInt[i] = 1;
			}
			if (notes[i].equals("D")) {
				notesInt[i] = 2;
			}
			if (notes[i].equals("A")) {
				notesInt[i] = 3;
			}
			if (notes[i].equals("E")) {
				notesInt[i] = 4;
			}
			if (notes[i].equals("B")) {
				notesInt[i] = 5;
			}
			if (notes[i].equals("F#") || notes[i].equals("Gb")) {
				notesInt[i] = 6;
			}
			if (notes[i].equals("C#") || notes[i].equals("Db")) {
				notesInt[i] = 7;
			}
			if (notes[i].equals("G#") || notes[i].equals("Ab")) {
				notesInt[i] = 8;
			}
			if (notes[i].equals("D#") || notes[i].equals("Eb")) {
				notesInt[i] = 9;
			}
			if (notes[i].equals("A#") || notes[i].equals("Bb")) {
				notesInt[i] = 10;
			}
			if (notes[i].equals("F")) {
				notesInt[i] = 11;
			}
		}
		
		// Perform calculation
		int numOfRelations = numOfNotes - 1;
		int total = 0;
		int ticks = 0;
		
		for (int i = 1; i <= numOfRelations; i++) {
			for (int j = 0; j < numOfNotes; j++) {
				if (i+j < numOfNotes){
					int temp = notesInt[i+j] - notesInt[j];
					
					if (temp <= -7) {
						temp = temp + 12;
					} else if (Math.abs(temp) >= 6) {
							temp = temp - 12;
						}
					
					total = total + temp;
					ticks++;
					System.out.println(notes[j] + " (" + notesInt[j] + ") to " + notes[j+i] + " (" + notesInt[j+i] + ") is " + temp);
				}
			}
		}
		
		float fTotal = total;
		float fTicks = ticks;
		float dissonance = fTotal/fTicks;
		
		// Output
		System.out.println();
		System.out.println("The calculated dissonance is: " + dissonance);
		System.out.println("dissonance = total / ticks: " + dissonance + " = " + total + " / " + ticks);
	
		System.out.print("Would you like to go again? (y/n) ");
		String cont = inCont.nextLine();
		if (cont.equals("n")) {
			done = true;
		}
	
	}
		
		
		
		
		//System.out.println();
		
		// Test output
//		for (int i = 0; i < notes.length; i++) {
//			System.out.printf("%-30.30s  %-30.30s%n", notes[i], notesInt[i]);
//		}
		//System.out.println();
		//System.out.println("notes is: " + notes.length);
		//System.out.println("notesInt is: " + notesInt.length);
		
	inMode.close();
	inCont.close();
	inCord.close();

	}
}
