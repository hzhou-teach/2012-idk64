import java.util.*;
class Main {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
	int N = scan.nextInt();
	int ans = 0;
	ArrayList<Integer> list = new ArrayList<Integer>();
	int added_up = 0;
	for (int i = 0; i < N; i++) {
		list.add(scan.nextInt());
		}
	for (int i = 0; i < N; i++) {
		for (int j = i + 1; j < N; j++) {
				for (int k = i; k <= j; k++) {
					added_up = list.get(k) + added_up;
				}
				for (int k = i; k <= j; k++) {
					if (list.get(k) == (double) added_up / ((j - i) + 1)) {
						ans++;
						break;
					}
					
				}
				added_up = 0;
			}
		}
	System.out.println(ans + N);
  }
}