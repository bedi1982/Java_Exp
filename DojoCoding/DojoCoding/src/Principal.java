import java.util.Scanner;

//Java é vida
public class Principal {

	public static void main(String[] args) {
		ListaDeAFazeres lista = new ListaDeAFazeres();
		int opcaoSelecionada = 0;
		Scanner ler = new Scanner(System.in);
		Item it = null;

		// TODO criar scanner
		
		do  {
			lista.imprimir();
			switch (opcaoSelecionada) {
			case 1:
				System.out.println("Digite um item");
				it = new Item(ler.next());
				lista.inserir(it);
				break;
			case 2:
				System.out.println("Digite um item para remover");
				it = new Item(ler.next());
				lista.remover(it);
				break;
			case 3:
				System.out.println("Segue item abaixo:");
				lista.imprimir();
				break;
			case 4:
				System.out.println("Lista foi limpa");
				lista.removerTodos();
				break;
			case 5:
				System.out.println("Lista ordenada:");
				lista.ordenar();
				lista.imprimir();
				break;
			default:
				break;
			}
			System.out.println(retornaOpcoes());
			opcaoSelecionada = ler.nextInt();
			
		}
		while (opcaoSelecionada != 6);


	}

	private static String retornaOpcoes() {
		StringBuilder sb = new StringBuilder();
		sb.append("Escolha umas das Opções: \n");
		sb.append("Inserir (1): \n");
		sb.append("Remover (2): \n");
		sb.append("Listar (3): \n");
		sb.append("Remover todos (4): \n");
		sb.append("Ordenar (5): \n");
		sb.append("Encerrar (6): \n");
		return sb.toString();
	}

}
