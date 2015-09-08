import java.util.Collections;
import java.util.Set;
import java.util.TreeSet;
import java.util.Vector;

public class VectorHeap <E extends Comparable<E>>{
	Set<BinaryTree<E>> n;
	Vector<BinaryTree<E>> M;
	
	public VectorHeap(){
		n = new TreeSet<BinaryTree<E>>();
		M = new Vector<BinaryTree<E>>();
	}
	
	@SuppressWarnings("unchecked")
	public BinaryTree<E> Unir(BinaryTree<E> left,BinaryTree<E> Right){
		int frecuenciat = left.getFrecuencia()+ Right.getFrecuencia();
		BinaryTree<E> nuevo = new BinaryTree<E>((E) "", frecuenciat,left,Right); 
		left.setParent(nuevo);
		Right.setParent(nuevo);
		return nuevo;
	}
	
	public void Agregarorden(BinaryTree<E> agregado){
		n.add(agregado);
	}
	
	public void AgregarHeap(){
		M.addAll(n);
	}
	
	public void crear(){
		while(M.size() >1){
			BinaryTree<E> primero = M.elementAt(0);
			M.removeElementAt(0);
			BinaryTree<E> segundo = M.elementAt(0);
			M.removeElementAt(0);
			M.add(Unir(primero,segundo));
			
			int p = 0;
			int R = M.size()-1;
			
			while(p == 0){
				int frec  = M.elementAt(R).getFrecuencia();
				int frec2 = M.elementAt(R-1).getFrecuencia();
				if(frec2<=frec){
					p =1;
				}else{
					Collections.swap(M, R, R-1);
					R -=1;
				}
			}
		}
	}
	
	
}
