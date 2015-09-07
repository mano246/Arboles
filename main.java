import java.util.Scanner;

public class main{
	 
	public static void main(String args[]){
		Scanner human = new Scanner(System.in);
		BinaryTree<String> database = new BinaryTree<String>("a computer");
		System.out.println("Jugar?");
		
		while(human.nextLine().equals("YES")){
			System.out.println("piensa yo adivino");
			play(human,database);
			System.out.println("otra vez");
		}
		System.out.println("Va");
	}
	
	public static void play(Scanner human,BinaryTree<String> database){
		if(!database.left.isEmpty()){
			System.out.println(database.getE());
			if(human.nextLine().equals("YES")){
				play(human,database.left);
			}else{
				play(human,database.right);
			}
		}else{
			System.out.println("sera ?" + database.getE());
			if(human.nextLine().equals("YES")){
				System.out.println("LE ATINE ");
			}else{
				System.out.println("Entonces?¬¬");
				BinaryTree<String> nuevo = new BinaryTree<String>(human.nextLine());
				BinaryTree<String> viejo = new BinaryTree<String>(database.getE());
				database.setLeft(nuevo);
				database.setRight(viejo);
				System.out.println("como los distingo "+ nuevo.getE() +" de "+ viejo.getE());
				database.setE(human.nextLine());
			}
		}
	}

}
