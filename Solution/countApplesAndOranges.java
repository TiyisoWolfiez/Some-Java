 public static void countApplesAndOranges(int s, int t, int a, int b, List<Integer> apples, List<Integer> oranges) {
    // Write your code here
    int appleCount = 0;
    int orangeCount = 0;
    
    for(int k = 0; k < apples.size(); k++){
        int posA = apples.get(k) + a;
        
        if(posA >= s && posA <= t){
            appleCount++;
        }
    }
    
    for(int j = 0; j < oranges.size(); j++){
        int posB = oranges.get(j) + b;
        
        if(posB >= s && posB <= t){
            orangeCount++;
        }
    }
    System.out.println(appleCount);
    System.out.println(orangeCount);
    
    }
