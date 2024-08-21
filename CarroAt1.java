package car;

public class CarroAt1 {

	public static void main(String[] args) {
		//Criando objetos da classe Pessoa
				Carro carro1 = new Carro();
				
				//Obj 1
				carro1.setNome("Fiesta");
				carro1.setMarca("Ford");
				carro1.setCor("Amarelo");
				carro1.setMotor("v8");
				carro1.setAno(2012);
				carro1.setValor(20000);
				
				
				//Chamando o método get() para apresentar os objetos
				System.out.println("————— Objeto 1 —————");
				System.out.println(carro1.getNome());
				System.out.println(carro1.getMarca());
				System.out.println(carro1.getCor());
				System.out.println(carro1.getMotor());
				System.out.println(carro1.getAno());
				System.out.println(carro1.getValor());
				
	}

}
