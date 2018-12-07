class Exercises07 {

  public static boolean odd(final boolean a, final boolean b, final boolean c) {
    final int ba = a ? 1 : 0;
    final int bb = b ? 1 : 0;
    final int bc = c ? 1 : 0;
    final int sum = ba + bb + bc;
    return (sum == 1) || (sum == 3);
  }
  
  public static boolean majority(final boolean a, final boolean b, final boolean c) {
    return (a && b) || (a && c) || (b && c);
  }
  
  public static boolean equal(final int[] a, final int[] b) {
    if (a == b) return true;
    if (a == null || b == null) return false;
    final int l = a.length;
    if (l != b.length) return false;
    for (int i = 0; i < l; ++i) if (a[i] != b[i]) return false;
    return true;
  }
  
  public static boolean triangular(final double a, final double b, final double c) {
    return (a < b+c) && (b < a+c) && (c < a+b);
  }
  
}