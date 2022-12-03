import org.junit.jupiter.api.Test;

class MisalignedTest {

	@Test
	void testPrintColorMap() {
		int result = Misaligned.printColorMap();
        assert(result == 25);
	}
	
	@Test
	void testPrintColorFromDoubleDigitNumbers() {
		String result = Misaligned.printColorFromDoubleDigitNumbers(2, 5, "White", "Blue");
		assert result.equals("15 | White | Blue");
	}
	
	@Test
	void testPrintColorFromSingleDigitNumbers() {
		String result = Misaligned.printColorFromSingleDigitNumbers(0, 5, "White", "Blue");
		assert result.equals("5  | White | Blue");
	}

}
