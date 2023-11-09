public static List<Integer> breakingRecords(List<Integer> scores) {
    // Write your code here
        int most = 0;
        int least = 0;
        
        int highestScore = scores.get(0);
        int lowestScore = scores.get(0);
        
        for(int n : scores){
            if(n > highestScore){
                highestScore = n;
                most++;
            }
            
            if(n < lowestScore){
                lowestScore = n;
                least++;
            }
        }
        List<Integer> result = new ArrayList<>();
        result.add(most);
        result.add(least);
        
        return result;
}
