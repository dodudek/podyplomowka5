public class UncheckedExceptionTester {
    public static void main(String[] args) {

        UncheckedExceptionTester uncheckedExceptionTester = new UncheckedExceptionTester();
        int i = uncheckedExceptionTester.getNumberFromString("9b");
        if (i != -1) {
            System.out.println("Oto nasza licza pomnożona przez 99 " + (i * 99));
        }
    }

    public int getNumberFromString (String number) {
        try {
            return Integer.parseInt(number);
        }catch (NumberFormatException nfe){
            System.out.println("Coś poszło nie tak! Upewnij isę, ze przkazywany String jest liczbą!");

        }
        return -1;
    }
}
