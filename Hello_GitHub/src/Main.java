public class Main {
	public static void main(String[] args) {
		
		Sobrenome sobrenome = new Sobrenome();
		Nome nome = new Nome();
		
		nome.setNome("Sergio Rafael");
		sobrenome.setSobrenome(" Lemke");
		
		System.out.println(nome.getNome() + sobrenome.getSobrenome());
	}
}