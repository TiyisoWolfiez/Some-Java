public static int birthday(List<Integer> s, int d, int m) {
    int ways = 0;

    for(int k = m - 1; k < s.size(); k++){
        int sum = 0;
        for (int i = k; i > k - m; i--) {
            sum += s.get(i);
        }
        if(sum == d){
            ways++;
        }
    }
    
    return ways;
}
