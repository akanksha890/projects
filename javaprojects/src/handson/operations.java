package handson;

public class operations{

	public double opr(double m,double num1,double num2) {
		int z=(int)m;
		switch(z) {
		case 1:
			return num1+num2;
		case 2:
			return num1-num2;
		case 3:
			return num1*num2;
		case 4:
			return num1/num2;
		default:
			System.out.println("Invalid Choice..!!");
			break;
		}
		return 0;
		
	}
}

