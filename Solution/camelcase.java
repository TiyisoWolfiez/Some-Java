public static int camelcase(String s) {
// Write your code here
    int k = 1;
    
    for(int i = 0; i < s.length(); i++){
        if(Character.isUpperCase(s.charAt(i))){
            k++;
        }
    }
    return k;
    
    }
}
