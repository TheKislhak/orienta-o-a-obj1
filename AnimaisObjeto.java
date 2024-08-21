package car;

public class AnimaisObjeto {

	public static void main(String[] args) {
		Animal animal1 = new Animal ();
		Animal animal2 = new Animal ();
		Animal animal3 = new Animal ();
		Animal animal4 = new Animal ();
		Animal animal5 = new Animal ();
		Animal animal6 = new Animal ();
		Animal animal7 = new Animal ();
		Animal animal8 = new Animal ();

		animal1.setNomeanimal("Vaca");
		animal1.setRaca("Gado-bolvino");
		animal1.setPortetamanho("Grande");
		animal1.setSom("Mujido");

		animal2.setNomeanimal("Bezerro");
		animal2.setRaca("Gado-bolvino");
		animal2.setPortetamanho("Pequeno");
		animal2.setSom("Mujido");

		animal3.setNomeanimal("Cordeiro");
		animal3.setRaca("Sub-família Caprinae");
		animal3.setPortetamanho("Pequeno");
		animal3.setSom("Balido");

		animal4.setNomeanimal("Cachorro");
		animal4.setRaca("Canino");
		animal4.setPortetamanho("pequeno");
		animal4.setSom("Latido");

		animal5.setNomeanimal("Coelhinho");
		animal5.setRaca("American rabbit");
		animal5.setPortetamanho("Pequeno");
		animal5.setSom("Chiar ou guinchar");

		animal6.setNomeanimal("Coelho");
		animal6.setRaca("American rabbit");
		animal6.setPortetamanho("Pequeno");
		animal6.setSom("Chiar ou guinchar");

		animal7.setNomeanimal("Pinto");
		animal7.setRaca("Subespécie doméstica da espécie Gallus gallus");
		animal7.setPortetamanho("Pequeno");
		animal7.setSom("Pia");

		animal8.setNomeanimal("Galinha");
		animal8.setRaca("Subespécie doméstica da espécie Gallus gallus");
		animal8.setPortetamanho("Pequeno");
		animal8.setSom("Cacarejo");


		//Chamando o método get() para apresentar os objetos
		System.out.println("————— Objeto 1 —————");
		System.out.println(animal1.getNomeanimal());
		System.out.println(animal1.getRaca());
		System.out.println(animal1.getPortetamanho());
		System.out.println(animal1.getSom());

		System.out.println("————— Objeto 2 —————");
		System.out.println(animal2.getNomeanimal());
		System.out.println(animal2.getRaca());
		System.out.println(animal2.getPortetamanho());
		System.out.println(animal2.getSom());

		System.out.println("————— Objeto 3 —————");
		System.out.println(animal3.getNomeanimal());
		System.out.println(animal3.getRaca());
		System.out.println(animal3.getPortetamanho());
		System.out.println(animal3.getSom());

		System.out.println("————— Objeto 4 —————");
		System.out.println(animal4.getNomeanimal());
		System.out.println(animal4.getRaca());
		System.out.println(animal4.getPortetamanho());
		System.out.println(animal4.getSom());

		System.out.println("————— Objeto 5 —————");
		System.out.println(animal5.getNomeanimal());
		System.out.println(animal5.getRaca());
		System.out.println(animal5.getPortetamanho());
		System.out.println(animal5.getSom());

		System.out.println("————— Objeto 6 —————");
		System.out.println(animal6.getNomeanimal());
		System.out.println(animal6.getRaca());
		System.out.println(animal6.getPortetamanho());
		System.out.println(animal6.getSom());

		System.out.println("————— Objeto 7 —————");
		System.out.println(animal7.getNomeanimal());
		System.out.println(animal7.getRaca());
		System.out.println(animal7.getPortetamanho());
		System.out.println(animal7.getSom());

		System.out.println("————— Objeto 8 —————");
		System.out.println(animal8.getNomeanimal());
		System.out.println(animal8.getRaca());
		System.out.println(animal8.getPortetamanho());
		System.out.println(animal8.getSom());

	}

}
