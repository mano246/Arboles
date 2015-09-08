import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class Codificador {
	private String Decodificada;
	private VectorHeap<String> VH;
	private Set<String> sets = new HashSet<String>();
	private static Set<BinaryTree> Heap2 = new TreeSet<BinaryTree>();
	private SkewHeap<String> Heap= new SkewHeap<String>();
	
	public Codificador(String DEC){
		this.Decodificada = DEC;
		VH = new VectorHeap<String>();
	}
	
	public void Decodificar (){
		for(int i = 0; i< Decodificada.length()-1;i++ ){
			char nuevo = Decodificada.charAt(i);
			String Valor = Character.toString(nuevo);
			sets.add(Valor);
		}	
		for(Iterator<String> ir = sets.iterator(); ir.hasNext();){
			int frecuencia = 0;
			String Valor = ir.next();
			for(int j = 0; j<Decodificada.length()-1;j++){
				String vq = Character.toString(Decodificada.charAt(j));
				if(Valor.compareTo(vq) == 0){
					frecuencia++;
				}
			}
			BinaryTree<String> nuevo = new BinaryTree<String>(Valor,frecuencia,null,null);
			VH.Agregarorden(nuevo);
		}
		
		VH.AgregarHeap();
		VH.crear();
	}

	public static void Agregar(BinaryTree modificado){
		Heap2.add(modificado);
	}
	
	

}
