package Seção_2_MissãoDominar;

public enum MesesAno {

	JANEIRO, FEVEREIRO, MARCO, ABRIL, MAIO, JUNHO, JULHO, AGOSTO, SETEMBRO, OUTUBRO, NOVEMBRO, DEZEMBRO;
	
	public static void getEstacao(MesesAno mes) {

		switch (mes) {
		case JANEIRO: {
			System.out.println("Estação: VERÃO");
			break;
		}
		case FEVEREIRO: {
			System.out.println("Estação: VERÃO");
			break;
		}
		case MARCO: {
			System.out.println("Estação: VERÃO/OUTONO");
			break;
		}
		case ABRIL: {
			System.out.println("Estação: OUTONO");
			break;
		}
		case MAIO: {
			System.out.println("Estação: OUTONO");
			break;
		}
		case JUNHO: {
			System.out.println("Estação: OUTONO/INVERNO");
			break;
		}
		case JULHO: {
			System.out.println("Estação: INVERNO");
			break;
		}
		case AGOSTO: {
			System.out.println("Estação: INVERNO");
			break;
		}
		case SETEMBRO: {
			System.out.println("Estação: INVERNO/PRIMAVERA");
			break;
		}
		case OUTUBRO: {
			System.out.println("Estação: PRIMAVERA");
			break;
		}
		case NOVEMBRO: {
			System.out.println("Estação: PRIMAVERA");
			break;
		}
		case DEZEMBRO: {
			System.out.println("Estação: PRIMAVERA/VERÃO");
			break;
		}
		}

	}

	public static void imprimirMeses() {
		MesesAno[] meses = MesesAno.values();
		for (MesesAno mes : meses) {
			System.out.println(mes);
		}
	}

}