public static String kangaroo(int x1, int v1, int x2, int v2) {
    // Write your code here
    
    String yes = "YES";
    String no = "NO";
    
    if (v1 == v2) {
        if (x1 == x2) {
            return yes;
        } else {
            return no;
        }
    }
    
    if ((x2 - x1) % (v1 - v2) == 0 && (x2 - x1) / (v1 - v2) >= 0) {
        return yes;
    } else {
        return no;
    }
}
