public static List<Integer> gradingStudents(List<Integer> grades) {
    // Write your code here
    
        List<Integer> rounded = new ArrayList<>();
        
        for (Integer grade : grades) {
            int nextMultipleOf5 = (grade / 5 + 1) * 5;
   
            if(grade < 38){
                rounded.add(grade);
            }else if(nextMultipleOf5 - grade  < 3){
                rounded.add(nextMultipleOf5);
            } else{
                rounded.add(grade);
            }
        }
        return rounded;
  }
