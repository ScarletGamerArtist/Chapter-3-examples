package AlannaChp3Examples.java;
/*
 * Alanna Botscharow
 * 9/18
 * Variable examples and notes.
 */

public class VariablesExample {

		public static void main(String[] args) {
			//datatype variableName;
			
			//letters
			char char1;//a single character     8bits
			//true or false
			boolean bool1;//true or false    64bits
			//Whole numbers
			byte x1;// (-128 to 127) 8bits
			nextByte(); 
			short x2; // -32768 to 32767 16bits
			nextShort();
			int num1;//whole number + or -  (-2147483648 to 2147483647)   32bit
			nextInt();
			long x3; // (-9223372036854775808 to 9223372036854775807) 64bits
			nextLong();
		
			
			//real numbers
			double num2;//fractional numbers + or -  (-1.79796931348623157E + 308 to -409e - 324) 64bits
			nextDouble();
			float x4; //Negative range:  (-3.4028235E + 38 to -1.4E - 45) 32bits
			nextFloat();
			
			String x5; // 64bits  not a data type
 			next();
 			nextline();
 			
			
			num1 = 10; 
			num2 = 3.754;
			char1 = 'f';
			bool1 = true; 
			
			num1 = num1 + num1;
			num1 = (6*5)*9*(5+4);
			int x,y,j,k;
			x = y = j = k = 5;
			 
			int z = 50; 
			System.out.print(x=7);
			
			
		    int count;
		    count = 1;
		  
		    
		    x=count++;
		    System.out.print(x);
		    x=++count; 
		    System.out.print(x);
		    
			
			
			
			
			
			
		}
}
