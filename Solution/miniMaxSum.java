public static void miniMaxSum(List<Integer> arr) {
    // Write your code here
    List<Integer> sortedArr = new ArrayList<>(arr);
    Collections.sort(sortedArr);
    
    long min = 0;
    long max = 0;
    
    for(int i=0;i<sortedArr.size()-1;++i){
        min += sortedArr.get(i);
    }
    
    for (int j = 1; j < sortedArr.size(); j++) {
        max += sortedArr.get(j);
    }
    
    System.out.print(min + " " + max);
}    




