
public class SkewHeap<E extends Comparable<E>> {
	protected BinaryTree<E> root;
	protected final BinaryTree<E> EMPTY = new BinaryTree<E>();
	protected int count;
	
	public SkewHeap(){
		root = EMPTY;
		count = 0;
	}
	
	public E getFirst(){
		return root.getE();
	}
	
	protected static <E extends Comparable<E>> BinaryTree<E> merge(BinaryTree<E> left, BinaryTree<E> right){
		/*if(left.isEmpty()) return right;
		if(right.isEmpty()) return left;
		E leftVal = left.getE();
		E rightVal = right.getE();
		BinaryTree<E> result;
		if(rightVal.compareTo(leftVal)<0){
			result = merge(right,left);
		}else{
			result = left;
		}
		if(result.left().isEmpty()){
			result.setLeft(right);
		}else{
			BinaryTree<E> temp = result.right();
			result.setRight(result.left());
			result.setLeft(merge(temp,right));
		}*/
		int nuevafrec = left.getFrecuencia() + right.getFrecuencia();
		BinaryTree<E> result;
		result = new BinaryTree<E>(null,nuevafrec,left,right);
		return result;
			
	}
	
	public void add(BinaryTree smallTree){
		merge(root,smallTree);
		count ++;	
	}
	
	public E remove(E value){
		E result = root.getE();
		root = merge(root.left(),root.right());
		count--;
		return result;
	}

}
