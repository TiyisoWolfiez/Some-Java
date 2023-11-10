public static void bonAppetit(List<Integer> bill, int k, int b) {
    String bon = "Bon Appetit";
    int Anna = bill.get(k);
    int sum = 0;
    
    for(int n = 0; n < bill.size(); n++){
        sum += bill.get(n);
    }
    
    int total = (sum - Anna) / 2;
    
    if (total == b) {
        System.out.println(bon);
    } else {
        int moneyOwed = Anna / 2;
        System.out.println(moneyOwed);
    }
}
