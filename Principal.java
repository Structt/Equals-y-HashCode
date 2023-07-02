package Ejercicio1;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Personas per=new  Personas(1,"Cesar");
		Personas per1=new Personas(1,"Cesar");
		
		if(per.equals(per1))
		{
			System.out.println("Son iguales");
		}
		else {
			System.out.println("No son iguales");
		}

	}

}
