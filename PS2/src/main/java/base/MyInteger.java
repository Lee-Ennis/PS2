package base;

public class MyInteger {
	
	private int iValue;
	
	public MyInteger(int iValue){
		this.iValue = iValue;
	}
	
	public int getiValue(){
		return iValue;
	}
	
	public boolean isEven(){
		if (this.iValue % 2 == 0)
			return true;
		else
			return false;
	
	}
	
	public boolean isOdd(){
		if (this.iValue % 2 > 0)
			return true;
		else 
			return false;
		
	}
	
	public boolean isPrime(){
		return true;
	}
	
	
	public static boolean isEven(int x){
		if (x % 2 == 0)
			return true;
		else 
			return false;
	}
	
	public static boolean isOdd(int x){
		if (x % 2 > 0)
			return true;
		else
			return false;
	}
	
	public static boolean isPrime(int x){
		if (x % 2 == 0)
			return false;
		for (int i = 3; i * i <= x; i += 2)
			if (x % i == 0) return false;
		if (x < 2) 
			return false;
		if (x == 2) 
			return true;
		return true;
					
	}
	
	public static boolean isEven(MyInteger number){
		if (MyInteger.isEven(number) == true) 
			return true;
		else
			return false;
	}
	
	public static boolean isOdd(MyInteger number){
		if (MyInteger.isEven(number) == false)
			return true;
		else 
			return false;
	}
	
	public static boolean isPrime(MyInteger number){
		if (MyInteger.isPrime(number) == true)
			return true;
		else
			return false;
	}
	
	public boolean equals(int i){
		if (this.iValue == i)
			return true;
		else
			return false;
				
	}
	
	public boolean equals(MyInteger number){
		if (this.iValue == number.iValue)
			return true;
		else
			return false;
	}

}
