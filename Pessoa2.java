package car;

import ex.Pessoa;

public class Pessoa2 {

	public static void main(String[] args) {
		Pessoa pes = new Pessoa();
		Pessoa pes2 = new Pessoa();
		
		pes.setId(123123l);
		pes.setNome("Clover");
		pes.setTel(19995473409l);
		pes.setCpf(87623687623l);
		pes.setRg(1234587698l);
		
		pes2.setId(34698327);
		pes2.setNome("Frisk");
		pes2.setTel(19993560033l);
		pes2.setCpf(34569872674l);
		pes2.setRg(33423472384l);
		
		System.out.println("————— Objeto 1 —————");
		System.out.println(pes.getId());
		System.out.println(pes.getNome());
		System.out.println(pes.getTel());
		System.out.println(pes.getCpf());
		System.out.println(pes.getRg());

		System.out.println("————— Objeto 2 —————");
		System.out.println(pes2.getId());
		System.out.println(pes2.getNome());
		System.out.println(pes2.getTel());
		System.out.println(pes2.getCpf());
		System.out.println(pes2.getRg());
		

	}

}
