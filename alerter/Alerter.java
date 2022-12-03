
public class Alerter {
    static int alertFailureCount = 0;
    static int networkAlertStub(float celcius) {
        System.out.println("ALERT: Temperature is " + celcius + " celcius");
        // Return 200 for ok
        // Return 500 for not-ok
        // stub always succeeds and returns 200
        // Assuming till 158 F / 70 C, its fine
        if(celcius < 70) {
        	return 200;
        }
        return 500;
    }
    static void alertInCelcius(float farenheit) {
        float celcius = (farenheit - 32) * 5 / 9;
        int returnCode = networkAlertStub(celcius);
        if (returnCode != 200) {
            // non-ok response is not an error! Issues happen in life!
            // let us keep a count of failures to report
            // However, this code doesn't count failures!
            // Add a test below to catch this bug. Alter the stub above, if needed.
            alertFailureCount += 1;
        }
    }
    public static void main(String[] args) {
        System.out.printf("%d alerts failed.\n", alertFailureCount);
        System.out.println("All is well (maybe!)\n");
    }
}
