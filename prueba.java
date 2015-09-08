import java.util.*;
public class prueba {
	
	public static void main(String args[]){
		Set<BinaryTree<String>> n = new TreeSet<BinaryTree<String>>();
		Vector<BinaryTree<String>> M = new Vector<BinaryTree<String>>();
		n.add(new BinaryTree<String>("BOB",1,null,null));
		n.add(new BinaryTree<String>("Pedro",1,null,null));
		n.add(new BinaryTree<String>("Maria",3,null,null));
		n.add(new BinaryTree<String>("Juan",2,null,null));
		n.add(new BinaryTree<String>("Bill",2,null,null));
		n.add(new BinaryTree<String>("BO",4,null,null));
		n.add(new BinaryTree<String>("BOTAS",1,null,null));
		
		M.addAll(n);
		
		for(Iterator<BinaryTree<String>> ir= M.iterator(); ir.hasNext();){
			BinaryTree<String> m = ir.next();
			String s = (String) m.getE();
			System.out.println("Es: "  + s + "   con f: " + m.getFrecuencia() + "   "+ M.indexOf(m)); 
		}
		
		Iterator<BinaryTree<String>> f = n.iterator();
		BinaryTree<String> primero = M.elementAt(0);
		M.removeElementAt(0);
		BinaryTree<String> segundo = M.elementAt(0);
		M.removeElementAt(0);
		M.add(unir(primero,segundo)); 
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
			System.out.println("Es: "  + s + "   con f: " + m.getFrecuencia()+ "   "+ M.indexOf(m)); 
		}
		
		Iterator<BinaryTree<String>> fr = n.iterator();
		BinaryTree<String> primeror = M.elementAt(0);
		M.removeElementAt(0);
		BinaryTree<String> segundor = M.elementAt(0);
		M.removeElementAt(0);
		M.add(unir(primeror,segundor)); 
		
		int s = 0;
		int t = M.size()-1;
		
		while(s == 0){
			int frec  = M.elementAt(t).getFrecuencia();
			int frec2 = M.elementAt(t-1).getFrecuencia();
			System.out.println("3");
			if(frec2<=frec){
				s =1;
			}else{
				Collections.swap(M, t, t-1);
				t -=1;
			}
		}
		
		for(Iterator<BinaryTree<String>> ir = M.iterator(); ir.hasNext();){
			BinaryTree m = ir.next();
			String j = (String) m.getE();
			System.out.println("Es: "  + j + "   con f: " + m.getFrecuencia()+ "   "+ M.indexOf(m)); 
		}
		
		
	}
	
	public static BinaryTree<String> unir(BinaryTree<String> primero, BinaryTree<String> segundo){
		BinaryTree<String> nuevo = new BinaryTree<String>((primero.getE()+segundo.getE()),(primero.getFrecuencia()+ segundo.getFrecuencia()),null,null);
		return nuevo;
		
		
	}
 	

}
