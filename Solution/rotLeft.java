public static List<Integer> rotLeft(List<Integer> a, int d) {
    int n = a.size();
    d = d % n; 
    
    // Reverse the first d elements
    reverse(a, 0, d - 1);
    
    // Reverse the remaining elements
    reverse(a, d, n - 1);
    
    // Reverse the entire array
    reverse(a, 0, n - 1);
    
    return a;
}

private static void reverse(List<Integer> a, int start, int end) {
    while (start < end) {
        int temp = a.get(start);
        a.set(start, a.get(end));
        a.set(end, temp);
        start++;
        end--;
    }
}


