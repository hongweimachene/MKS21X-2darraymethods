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

  public static int[] allRowSums(int[][] ary) {
    int[] arySum = new int[ary.length];
    for (int i = 0; i < ary.length; i++) {
      arySum[i]=rowSum(ary, i);
    }
    return arySum;
  }

  public static int[] allColSums(int[][] ary) {
    int maxLen = 0;
    for (int i = 0; i < ary.length; i++) {
      if (ary[i].length > maxLen) {
        maxLen = ary[i].length;
      }
    }
    int[] arySum = new int[maxLen];
    for (int j = 0; j < maxLen; j++) {
      arySum[j]=columnSum(ary, j);
    }
    return arySum;
  }

  public static boolean isRowMagic(int[][] ary) {
    int sum = rowSum(ary, 0);
    for (int i = 0; i < ary.length; i++){
      if (sum != rowSum(ary, i)) {
        return false;
      }
    }
    return true;
  }

  public static boolean isColumnMagic(int[][] ary) {
    int maxLen = 0;
    for (int i = 0; i < ary.length; i++) {
      if (ary[i].length > maxLen) {
        maxLen = ary[i].length;
      }
    }
    int sum = columnSum(ary, 0);
    for (int j = 0; j < maxLen; j++) {
      if (sum != columnSum(ary, j)) {
        return false;
      }
    }
    return true;
  }
}
