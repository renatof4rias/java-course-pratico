package Seção_2;

public class Aula_39 {

	// ValueOf  ->  Primitivo para Wrapper
	// Textos e Primitivos
	
	int a = 10; // <- Primitivo
	Integer a1 = Integer.valueOf(a);  //PRIMITIVO PARA WRAPPER

	String b = "123";
	Integer b1 = Integer.valueOf(b);  // STRING PARA WRAPPER NUMERICO

	// CASO A STRING NAO ESTEJA DE ACORDO COM A "SINTAXE" CORRETA 
	// A CLASSE LANÇA UM EXCEPTION 
	
	
	// ParseXxx  -> Texto para Primitivos 
	
	String c = "123";
	int c1 = Integer.parseInt(c);
	
	// CASO A STRING NAO ESTEJA DE ACORDO COM A "SINTAXE" CORRETA 
	// A CLASSE LANÇA UM EXCEPTION 
	
	
	// XxxValue  -> Wrapper para Primitivo
	// xxx = TIPO
	Integer d = Integer.valueOf(10);
	int d1 = d.intValue();
	
	
	
	//AUTOBOXING
	int e = 10;
	Integer e1 = e;
	
	
	//UNBOXING
	Integer f = 10;
	int f1 = f;
	
	
	
	
}
