public class dissonance 
{
	public static void main (String[] args) {
		
		// Initialize variables
		String cord;
		int numOfNotes;
		
		// Setup initial objects
		//Scanner in = new Scanner(System.in);
		
		// Take in chord
		//System.out.print("Enter your cord as notes with no spacing: ");
		//cords = in.nextLine();
		//in.close();
		cord = "C G D A E B F# C# G# D# A# F Gb Db Ab Eb Bb";
		
		// Convert input to arraylist
		String[] notes = cord.split(" ");
		
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
		
		for (int i = 1; i < numOfRelations; i++) {
			for (int j = 0; j < numOfNotes; j++) {
				total = notesInt[j];
			}
		}
		
		// Output
		System.out.println("The calculated dissonance is: " + total);
		
		// Test output
		for (int i = 0; i < notes.length; i++) {
			System.out.printf("%-30.30s  %-30.30s%n", notes[i], notesInt[i]);
		}
		System.out.println("notes is: " + notes.length);
		System.out.println("notesInt is: " + notesInt.length);

	}
}
