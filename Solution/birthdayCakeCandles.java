public static int birthdayCakeCandles(List<Integer> candles) {
// Write your code here

    int count = 0;
    int max = candles.get(0);
    
    for(int k =0; k < candles.size(); ++k){
        if(candles.get(k).compareTo(max) > 0){
            max = candles.get(k);
            count = 1;
        }else if (candles.get(k).equals(max)) {
            count += 1;
        }
    }
    return count;
    }
}

