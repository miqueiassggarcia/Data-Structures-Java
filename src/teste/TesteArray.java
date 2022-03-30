package teste;

import java.util.ArrayList;

public class TesteArray {
	public static void main(String[] args) {
		ArrayList<String> arrayList = new ArrayList<String>();
		
		arrayList.add("A");
		arrayList.add("C");
		arrayList.add("U");
		
		System.out.println(arrayList);
		
		arrayList.add(1, "B");
		
		System.out.println(arrayList);
		
		boolean existe = arrayList.contains("O");
		
		if(existe) {
			System.out.println("O elemento existe");
		} else {
			System.out.println("O elemento não existe");
		}
		
		int pos = arrayList.indexOf("U");
		
		if(pos > -1) {
			System.out.println("O elemento existe");
		} else {
			System.out.println("O elemento não existe");
		}
		
		System.out.println(arrayList.get(0));
		
		arrayList.remove(0);
		arrayList.remove("B");
		
		System.out.println(arrayList);
		
		System.out.println(arrayList.size());
	}
}
