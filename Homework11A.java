import java.util.ArrayList;

public class Homework11A extends Homework11 {
  private ArrayList<Integer> listA;

  public Homework11A() {
  	listA = new ArrayList<Integer>();
  	}

  public int problem4() {
    int sum = 0;
    for (int i : list) {
      sum += i;
    }
    return sum;
  }

  public void problem2(int n) {
    int num = 0;
    while (num < list.size()) {
        int x = list.get(num);
    		if ((n % x) != 0) {
    			list.remove(num);
  			} else {
  				num += 1;
  		}
  	}
  }
}
