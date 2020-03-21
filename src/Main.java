public class Main {

    private static long count ( long number ) {
        long sum = 0;

        while ( number > 0 ) {
            sum += number % 10;
            number /= 10;
        }

        return sum;
    }

    public static String balancedNum ( long number ) {
        if ( number < 100 ) {
            return "Balanced";
        }

        String numberStr = String.valueOf ( number );
        long firstNumber, secondNumber;

        int midIndex = numberStr.length ( ) / 2;

        if ( numberStr.length ( ) % 2 == 0 ) {
            firstNumber = Long.parseLong ( numberStr.substring ( 0 , midIndex - 1 ) );
        } else {
            firstNumber = Long.parseLong ( numberStr.substring ( 0 , midIndex ) );
        }

        secondNumber = Long.parseLong ( numberStr.substring ( midIndex + 1 ) );

        if ( count ( firstNumber ) == count ( secondNumber ) ) {
            return "Balanced";
        } else {
            return "Not Balanced";
        }
    }

    public static void main ( String[] args ) {
    }
}
