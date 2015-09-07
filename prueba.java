import java.util.*;
public class prueba {
	
	public static void main(String args[]){
		Set<BinaryTree<String>> n = new TreeSet<BinaryTree<String>>();
		Vector<BinaryTree<String>> M = new Vector<BinaryTree<String>>();
		n.add(new BinaryTree<String>("BOB",1,null,null));
		n.add(new BinaryTree<String>("Bos",1,null,null));
		n.add(new BinaryTree<String>("Bor",3,null,null));
		n.add(new BinaryTree<String>("Bip",2,null,null));
		n.add(new BinaryTree<String>("Bill",2,null,null));
		n.add(new BinaryTree<String>("BO",4,null,null));
		n.add(new BinaryTree<String>("BOs",1,null,null));
		
		M.addAll(n);
		
		for(Iterator<BinaryTree<String>> ir= M.iterator(); ir.hasNext();){
			BinaryTree m = ir.next();
			String s = (String) m.getE();
			System.out.println("Es: "  + s + "con f: " + m.getFrecuencia()); 
		}
		
		Iterator<BinaryTree<String>> f = n.iterator();
		M.add(unir(f.next(),f.next())); 
		n.hashCode();
		
		int p = 0;
		int R = M.size()-1;
		
		while(p == 0){
			int frec  = M.elementAt(R).getFrecuencia();
			int frec2 = M.elementAt(R-1).getFrecuencia();
			System.out.println("3");
			if(frec2<=frec){
				p =1;
			}else{
				Collections.swap(M, R, R-1);
				R -=1;
			}
		}
		
		for(Iterator<BinaryTree<String>> ir= M.iterator(); ir.hasNext();){
			BinaryTree m = ir.next();
			String s = (String) m.getE();
			System.out.println("Es: "  + s + "con f: " + m.getFrecuencia()); 
		}
		
		
	}
	
	public static BinaryTree<String> unir(BinaryTree<String> primero, BinaryTree<String> segundo){
		BinaryTree<String> nuevo = new BinaryTree<String>((primero.getE()+segundo.getE()),(primero.getFrecuencia()+ segundo.getFrecuencia()),null,null);
		return nuevo;
		
		
	}
 	

}
