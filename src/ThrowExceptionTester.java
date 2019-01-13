public class ThrowExceptionTester {

    public static void main(String[] args) {

        ThrowExceptionTester throwExceptionTester = new ThrowExceptionTester();

        int hours = -3;
        int numberOfSecends = 0;

        try {
            numberOfSecends= throwExceptionTester.getNumberOfSeconds(hours);
        } catch (IllegalArgumentException iae) {
            numberOfSecends= throwExceptionTester.getNumberOfSeconds(hours * -1);
        }

        System.out.println("Liczba sekund to: " + numberOfSecends);
    }

    public int getNumberOfSeconds (int hours){

        if (hours<0){
            throw new IllegalArgumentException("Liczba godzin mus być większa lub równa 0" + hours);
        }
        return hours * 60 * 60;

    }
}
