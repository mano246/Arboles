
public class BinaryTree<E> implements Comparable<BinaryTree>{
	protected E valor;
	protected int frecuencia;
	protected boolean raiz;
	protected boolean isLeft;
	
	protected BinaryTree<E> parent;
	protected BinaryTree<E> left,right;
	
	public BinaryTree(){
		valor = null;
		frecuencia = 0;
		parent = null;
		left = this;
		right = this;
	}
	public BinaryTree(E val){
		this.valor = val;
		parent = null;
		left = new BinaryTree<E>();
		right = new BinaryTree<E>();
	}
	public BinaryTree(E val,int Frec,BinaryTree<E> left, BinaryTree<E> right ){
		this.frecuencia = Frec;
		this.valor = val;
		raiz = false;
		parent = null;
		this.left = left;
		this.right = right;
	}
	public BinaryTree(E val,BinaryTree<E> left, BinaryTree<E> right){
		this.valor = val;
		raiz = false;
		if(left == null){
			left = new BinaryTree<E>();
			if(left.get)
		}
		setLeft(left);
		if(right == null){
			right = new BinaryTree<E>();
		}
		setRight(right);
	}
	
	public void setLeft(BinaryTree<E> newleft){
		if(isEmpty()){
			return;
		}
		if(left != null && left.parent == this){
			left.setParent(null);			
		}
		left = newleft;
		isLeft = true;
		left.setParent(this);
	}
	public void setRight(BinaryTree<E> newright){
		if(isEmpty()){
			return;
		}
		if(right != null && right.parent == this){
			right.setParent(null);			
		}
		right = newright;
		right.setParent(this);
	}
	
	protected void setParent(BinaryTree<E> newParent){
		if(!isEmpty()){
			parent = newParent;
		}
	}
	
	protected BinaryTree<E> getParent(){
		if(!isEmpty()){
			return parent;
		}
		
	}
	
	public boolean isEmpty(){
		if(valor == null && frecuencia == 0){
			boolean cual = true;
			return cual;
		}
		return false;
	}
	
	public BinaryTree<E> left(){
		return left;
	}
	
	public BinaryTree<E> right(){
		return right;
	}
	
	public E getE(){
		return valor;
	}
	public void setE(E nuevo){
		this.valor = nuevo;
	}
	public int getFrecuencia() {
		return frecuencia;
	}
	public void setFrecuencia(int frecuencia) {
		this.frecuencia = frecuencia;
	}
	@Override
	public int compareTo(BinaryTree o) {
		// TODO Auto-generated method stub
		if(this.getFrecuencia() == o.getFrecuencia() && this.getE() == o.getE())return 0;
		if(this.getFrecuencia() > o.getFrecuencia()) return 1;
		return -1;
	}
	public boolean IsLeft(){
		return isLeft;
		
	}
} 
