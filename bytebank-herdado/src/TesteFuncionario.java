
public class TesteFuncionario {

	public static void main(String[] args) {

		Cliente cliente = new Cliente();
		
		Gerente nico = new Gerente();
		nico.setNome("Nico Steppot");
		nico.setCpf("012.345.678-90");
		nico.setSalario(2600.00);

		System.out.println(nico.getNome());
		System.out.println(nico.getBonificacao());;
	}

}
