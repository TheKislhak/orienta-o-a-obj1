package car;

public class AviaoObjeto {

	public static void main(String[] args) {
		Aviao aviao = new Aviao ();
		
		aviao.setCoraviao("Branco");
		aviao.setMarca2("Boeing");
		aviao.setPassageiros(50);
		aviao.setPilotos(2);
		
		
		//Chamando o método get() para apresentar os objetos
		System.out.println("————— Objeto 1 —————");
		System.out.println(aviao.getCoraviao());
		System.out.println(aviao.getMarca2());
		System.out.println(aviao.getPassageiros());
		System.out.println(aviao.getPilotos());
	}

}
