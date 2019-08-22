package com.company;

public class Main {

//MAX_VALUE: to see the maximum value
//MIN_VALUE: to see the minimum value

    public static void main(String[] args) {

    //Integer for int

	   int myvalue = 10000;
	   int min_int_value = Integer.MIN_VALUE;
	   int max_int_value = Integer.MAX_VALUE;

	   System.out.println("Integer max value = " + max_int_value);
	   System.out.println("Integer min value = " + min_int_value);
	   System.out.println("Busted max value = "+(max_int_value + 1));
	   System.out.println("Busted min value = "+(min_int_value - 1));

	   int max__int_text = 2_147_483_647;//more than that will give an error
		System.out.println("can't be more than that = " + max__int_text);

	   //byte

		byte myminbytevalue = Byte.MIN_VALUE;
        byte mymaxbytevalue = Byte.MAX_VALUE;
		System.out.println("my byte min value: "+myminbytevalue);
		System.out.println("my byte max value: "+mymaxbytevalue);

		//short

		short myminshortvalue = Short.MIN_VALUE;
		short mymaxshortvalue = Short.MAX_VALUE;
		System.out.println("My short min value: "+ myminshortvalue);
		System.out.println("my short max value: "+ mymaxshortvalue);

		//long

		long mylongvalue = 100L;

        long myminlongvalue = Long.MIN_VALUE;
        long mymaxlongvalue = Long.MAX_VALUE;
		System.out.println("my max long value: " + mymaxlongvalue);
		System.out.println("my min long value: " + myminlongvalue);
        long long_text_int_convert = 2_147_483_647_234L;//Sem o L vai converter para int
		System.out.println(long_text_int_convert);

        //casting

		int mytotalyeah = (min_int_value/2);
		byte mynewbytevalue = (byte) (myminbytevalue / 2);//for byte
		System.out.println("it is a byte: "+mynewbytevalue);

		short mynewshortvalue = (short) (myminshortvalue/2);
		System.out.println("it is a short value: "+mynewshortvalue);




    }
}
