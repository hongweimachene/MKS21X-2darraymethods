public class ArrayMethods {
  public static int rowSum(int[][] ary, int x) {
    int sum = 0;
    if (x > ary.length - 1) {
      return sum;
    }
    for (int i = 0; i < ary[x].length; i++) {
      sum+=ary[x][i];
    }
    return sum;
  }

  public static int columnSum(int[][] ary, int x) {
    int sum = 0;
    for (int i = 0; i < ary.length; i++) {
      if (x < ary[i].length) {
        sum += ary[i][x];
      }
    }
    return sum;
  }
}