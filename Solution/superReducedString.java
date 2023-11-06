public static String superReducedString(String s) {
// Write your code here

    if(s.isEmpty()){
        return "Empty String";
    }
    StringBuilder result = new StringBuilder();
    int k =0;
    int i = s.length();

    while(k < i){
        char currChar = s.charAt(k);
        if(k <i-1 && currChar == s.charAt(k+1)){
            k += 2;
        }
        else
        {
            result.append(currChar);
            k++;
        }
    }   
    String reducedStr = result.toString();
    
    if (reducedStr.equals(s))
        {
        // return a;
        return reducedStr;
        } 
    else {
        return superReducedString(reducedStr);
    }
}

