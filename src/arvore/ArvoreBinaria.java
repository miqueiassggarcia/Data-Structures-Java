package arvore;

public class ArvoreBinaria<T extends Comparable<T>> {
	private T data;
	private ArvoreBinaria<T> right;
	private ArvoreBinaria<T> left;
	
	public ArvoreBinaria(T value) {
		this.data = value;
		this.right = null;
		this.left = null;
	}
	
	public void insert(T value) {
		if(this.data == null) {
			this.data = value;
		} else if(value.compareTo(this.data) < 0) {
			if(this.left != null) {
				this.left.insert(value);
			} else {
				ArvoreBinaria<T> novoRamoEsquerda = new ArvoreBinaria<T>(value);
				this.left = novoRamoEsquerda;
			}
		} else if(value.compareTo(this.data) > 0) {
			if(this.right != null) {
				this.right.insert(value);
			} else {
				ArvoreBinaria<T> novoRamoDireita = new ArvoreBinaria<T>(value);
				this.right = novoRamoDireita;
			}
		}
	}
	
	public void print_central() {
		if(this.data != null) {
			if(this.left != null) {
				this.left.print_central();
			}
			System.out.print(this.data + " ");
			if(this.right != null) {
				this.right.print_central();
			}
		}
	}
	
	public int test_of_left_node() {
		if(this.left != null) {
			return this.left.total_nodes();
		} else {
			return 0;
		}
	}
	
	
	public int test_of_right_node() {
		if(this.right != null) {
			return this.right.total_nodes();
		} else {
			return 0;
		}
	}
	
	public int total_nodes() {
		if(this.data == null) {
			return 0;
		} else {
			return test_of_left_node() + test_of_right_node() + 1;
		}
	}
	
	public int altura() {
		if(this.data == null) {
			return -1;
		} else {
			int esq = 0;
			if(this.left != null) {
				esq = this.left.altura();
			} else {
				esq = -1;
			}
			
			int dir = 0;
			if(this.right != null) {
				dir = this.right.altura();
			} else {
				dir = -1;
			}
			
			if(esq > dir) {
				return esq + 1;
			} else {
				return dir + 1;
			}
		}
	}
}
