import java.util.Scanner;
public class Placa_veiculo {
	public static void main(String[] args) {
		
		Scanner in = new Scanner (System.in);
		
			int placa;
			System.out.println("Digite o ultimo número da placa do carro");
			placa = in.nextInt();
			
			switch (placa) {
			case 1:
			case 2:
				System.out.println("Seu carro não podera circular na Segunda-Feira.");
				break;
			case 3:
			case 4:
				System.out.println("Seu carro não podera circular na Terça-Feira.");
			case 5:
			case 6:
				System.out.println("Seu carro não podera circular na Quarta-Feira.");
				break;
			case 7:
			case 8:
				System.out.println("Seu carro não podera circular na Quinta-Feira.");
				break;
			case 9:
			case 0:
				System.out.println("Seu carro não podera circular na Sexta-Feira.");
				break;
			default:
				System.out.println("Número inválido");
		in.close();

			}
	}

}

