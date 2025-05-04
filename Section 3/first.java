public class first {
    public static void main(String[] args) {
        System.out.println("Hello");
        int firstNumber = 5; 
        System.out.println(firstNumber);
        firstNumber = 10;
        System.out.println(firstNumber);
        firstNumber = (10+5)+(2*10);
        System.out.println(firstNumber);

        //byte, short, int and long are the primitive data type for whole numbers
        byte minValueForByte = Byte.MIN_VALUE; //Byte is the wrapper class 2^8
        byte maxValueForByte = Byte.MAX_VALUE;
        System.out.println("Minimum Byte value: " + minValueForByte + ", Maximum Byte value: "+ maxValueForByte);
        short minValueForShort = Short.MIN_VALUE; //Short is the wrapper class 2^16
        short maxValueForShort = Short.MAX_VALUE;
        System.out.println("Minimum Short value: " + minValueForShort + ", Maximum Short value: "+ maxValueForShort);
        int minValueForInt = Integer.MIN_VALUE; //Interger is the wrapper class 2^32
        int maxValueForInt = Integer.MAX_VALUE;
        System.out.println("Minimum integer value: " + minValueForInt + ", Maximum integer value: "+ maxValueForInt);
        long minValueForLong = Long.MIN_VALUE; //Longr is the wrapper class 2^64
        long maxValueForLong = Long.MAX_VALUE;
        System.out.println("Minimum Long value: " + minValueForLong + ", Maximum Long value: "+ maxValueForLong);
        long longNum = 10000000000000L;
        System.out.println(longNum);
        byte newByteValue = (byte) (minValueForByte/2); //Casting
        System.out.println(newByteValue);

        //float, duble are primitive data type for decimal numbers
        float myFloatValue =  10.245f;
        double myDoubleValue = 10.235d;//double is default for decimal numbers
        System.out.println(myFloatValue+" "+ myDoubleValue);

        //char, boolean are primitive data type for non numeric characters
        char firstCHarOfMyName = 'M';
        System.out.println(firstCHarOfMyName);
        char myUnicode = '\u004D';
        System.out.println(myUnicode);
        char myUnicodeValue = 77;
        System.out.println(myUnicodeValue);
        char queMarkUnicode = '\u003F';
        System.out.println(queMarkUnicode);
        boolean trueValue = true;
        boolean falseValue = false;
        System.out.println(trueValue+", "+falseValue);
        
    }
}
