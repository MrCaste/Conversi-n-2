
public class M1_06_Pedro_Castellano_Gonzalez {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		final double METROPULGADAS = 39.37;
		int contador = 0, pulgada = 0;
		int longitud = 144 / 12;
		float valorMetro=0;
		
		System.out.println("-----TABLA PULGADAS A METROS-----\n");
		
		while (contador<longitud) {
			
			for (int i=1 ; i <= 13; i++) {
				
				if (i==13) {
					
					System.out.println("-------------------------------------");
					
				} else {
					pulgada++;
					valorMetro =(float) (pulgada / METROPULGADAS);
					System.out.println(pulgada+" pulgadas = "+valorMetro+"   metros ");

				}
			}
			
			contador++;
		}

	}

}
