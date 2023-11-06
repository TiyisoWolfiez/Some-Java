public static List<Integer> compareTriplets(List<Integer> a, List<Integer> b) {
    int _a = 0, _b = 0;
    int[] res = {_a, _b};
    
    for(int i = 0;i < a.size();i++){
        if(a.get(i).compareTo(b.get(i))> 0){
            _a += 1;
        } else if(a.get(i).compareTo(b.get(i)) < 0){
            _b++;
        }
        else{
            // Do nothing if the elements are equal
        }
    }
    List<Integer> result = new ArrayList<>();
    result.add(_a);
    result.add(_b);
    return result;
}

