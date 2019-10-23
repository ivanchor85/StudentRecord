public class StudentRecord
{
   //contains scores.length values and scores.length > 1
   private int [] scores;
   
   //Constructs a StudentRecord object with an array of scores.
   public StudentRecord(int [] s)
   {
      scores = s;
   }
   
   /** returns the average (arithmetic mean) of the values in scores
    *  whose subscripts are between first and last, inclusive
    *  PRECONDITION: 0 <= first <= last < scores.length
    */
   private double average(int first, int last)
   {  double avg = 0.0;
       for(int i=first;i<=last;i++){
         avg+=scores[i-1];
      } 
      avg/=(last-first+1);
      return avg; //here so the class compiles
   }
    
   /** returns true if each successive value in scores is greater than
    *  or equal to the previous value; false otherwise.
    */
   private boolean hasImproved()
   {  
      for(int i=0;i<scores.length-1;i++){
          if(scores[i+1]<scores[i]){
              return false;
            }
        }
        
      return true; //here so the class compiles
   }  
   
   /** if the values in scores have imrpoved, returns the average of
    *  the elements in scores with indexes greater than or equal to 
    *  scores.length/2; otherwise, returns the average of all the 
    *  values in scores
    */
   public double finalAverage()
   {  double total = 0.0;
      int numbers = (scores.length+1)/2;
      if(hasImproved()==true){
         for(int i=numbers;i<scores.length;i++){
             total+=scores[i];
            }
         total/=numbers;
         return total;
        }
      return average(1,scores.length); //here so the class compiles
   } 
}