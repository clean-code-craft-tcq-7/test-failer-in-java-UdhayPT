public class Misaligned {
    static int printColorMap() {
        String majorColors[] = {"White", "Red", "Black", "Yellow", "Violet"};
        String minorColors[] = {"Blue", "Orange", "Green", "Brown", "Slate"};
        int i = 0, j = 0;
        for(i = 0; i < 5; i++) {
            for(j = 0; j < 5; j++) {
            	if (i * 5 + j < 10) {
            		System.out.println(printColorFromSingleDigitNumbers(i,j, majorColors[i], minorColors[i]));
            	} else {
            		System.out.println(printColorFromDoubleDigitNumbers(i,j, majorColors[i], minorColors[i]));
            	}
            }
        }
        return i * j;
    }
    public static String printColorFromDoubleDigitNumbers(int i, int j, String majorColor, String minorColor) {
    	String number = Integer.toString(i * 5 + j);
    	String result = number.concat(" | " + majorColor + " | " + minorColor);
    	return result;
	}
    public static String printColorFromSingleDigitNumbers(int i, int j, String majorColor, String minorColor) {
    	String number = Integer.toString(i * 5 + j);
    	String result = number.concat(" | " + majorColor + " | " + minorColor);
    	return result;
	}
	public static void main(String[] args) {
		printColorMap();
        System.out.println("All is well (maybe!)");
    }
}
