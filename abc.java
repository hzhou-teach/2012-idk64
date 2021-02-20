import java.util.*;
import java.io.*;
class Main {
  public static void main(String[] args){
   Scanner scan = new Scanner(System.in);
	    int[] list = new int[7];
	    int a = 0;
	    ArrayList<Integer> order = new ArrayList<Integer>();
	    int a_b_c_index = 0;
	    int a_b_c = 0;
	    for (int i = 0; i < 7; i++){
	      list[i] = scan.nextInt();
	    }
	    for (int i = 0; i < 7; i++) {
	    	if (list[i] > a_b_c) { 
                a_b_c = list[i]; 
                a_b_c_index = i;
	    	}
	    }
	    
		for (int i = 0; i < 7; i++) {
			for (int j = i + 1; j < 7; j++) {
				for (int k = j + 1; k < 7; k++) {
					if (list[i] + list[j] + list[k] == a_b_c) {
						
						for (int h = 0; h < 7; h++) {
							if (h != i && 
								h != j && 
								h != k && 
								h != a_b_c_index) {
								a = list[h] + a;
							}
						}
						if (a / 2 == a_b_c) {
							order.add(list[i]);
							order.add(list[j]);
							order.add(list[k]);
							Collections.sort(order);
							System.out.println(order.get(0) + " " + order.get(1) + " " + order.get(2));
							break;
						}
						else {
							a = 0;
						}
					}
				}
			}
		}
}
}