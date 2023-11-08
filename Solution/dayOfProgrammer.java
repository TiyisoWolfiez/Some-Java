public static String dayOfProgrammer(int year) {
    // Write your code here
        if(year == 1918){
            return "26.09.1918";
        }
        
        String yy = String.valueOf(year);
        String ddmmyy;
        String ddmm = "12.09.";
        String ddMM = "13.09.";
        
        if(year > 1918 && year % 400 == 0 || year % 4 == 0 && year % 100 != 0)      {
            ddmmyy = ddmm.concat(yy);
            return ddmmyy;
        }
        else if(year < 1917 && year % 4 == 0){
                ddmmyy = ddmm.concat(yy);
                return ddmmyy;
        }
        else{
                ddmmyy = ddMM.concat(yy);
                return ddmmyy;
        } 
}
