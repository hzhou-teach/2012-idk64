import java.util.*;
class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int N = scan.nextInt();
		int even_counter = 0;
		int odd_counter = 0;
		int ans = 0;
		int distance_from_N = 0;
		int[] input = new int[N];
		for (int i = 0; i < N; i++) {
			if (scan.nextInt()%2 == 0) {
				input[i] = 0;
			}
			else {
				input[i] = 1;
			}
			
		}
		if (N%2 == 0) {
			for (int i = 0; i < N; i++) {
				if (input[i] == 0) {
					even_counter++;
				}
			}
			if (even_counter != N/2) {
			distance_from_N = Math.abs(N/2 - even_counter);
			
				ans = N - (2 * distance_from_N) + 1;
				
			}
			else {
				ans = N;
			}
		}
		else if (N%2 != 0){
			for (int i = 0; i < N; i++) {
				if (input[i] == 0) {
					even_counter++;
				}
			}
			if (even_counter == (N/2 + 1)) {
				ans = N;
			}
			else if (even_counter < N/2 + 1){
				distance_from_N = Math.abs((N/2 + 1) - even_counter);
				if ((distance_from_N + 1)%3 == 0){
					ans = N - ((2 * (distance_from_N + 1))/3) + 1;
				}
				else if ((distance_from_N + 2)%3 == 0) {
					ans = N - (2 * (distance_from_N + 2))/3;
				}
				else if ((distance_from_N)%3 == 0) {
					ans = N - (2 * (distance_from_N))/3;
					
				}
			}
			else if (even_counter > N/2 + 1) {
				distance_from_N = Math.abs((N/2 + 1) - even_counter);
				
				ans = N - (2 * distance_from_N);
			}
		}
		
		
		System.out.println(ans);
		
	}
}
