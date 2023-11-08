public static int getTotalX(List<Integer> a, List<Integer> b) {
    int factorCount = 0;
    
    for(int k = 1; k <= 100; k++){  
        // Assuming the numbers are within 1 to 100
        
        boolean isFactorOfAllInA = true;
        boolean isFactorForAllInB = true;
        
        for(int numA : a){
            if(k % numA != 0){
                isFactorOfAllInA = false;
                break;
            }
        }
        
        for(int numB : b){
            if(numB % k != 0){
                isFactorForAllInB = false;
                break;
            }
        }
        
        if(isFactorOfAllInA && isFactorForAllInB){
            factorCount++;
        }
    }
    
    return factorCount;
}
