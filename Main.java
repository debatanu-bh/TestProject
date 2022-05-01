package Examples;

public class revNum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	System.out.println(val());	
	}
	public static boolean val() {
		
		
		int number = -121, reverse = 0, fix;
		fix=number;
        boolean flag=true;
        if (number<0) {
			flag=false;
		}
			while(number > 0)   
			{  
			int remainder = number % 10;  
			reverse = reverse * 10 + remainder;  
			number = number/10;  
			 

}
			if (fix==reverse) {
                flag=true;
                
				// System.out.println("Value is true");
			}
			else {
				// System.out.println(fix+"  "+reverse+"ERROR");
                flag=false;
			}
			// System.out.println(reverse);
        return flag;
}
}