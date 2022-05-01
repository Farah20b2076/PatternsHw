public class Days implements Container {
    public String day[] = {"Monday" , "Tuesday" ,"Wednesday" , "Thursday"};

   @Override
   public Iterator getIterator() {
      return new DayIterator();
   }

   private class DayIterator implements Iterator {

      int index;

      @Override
      public boolean hasNext() {
      
         if(index < day.length){
            return true;
         }
         return false;
      }

      @Override
      public Object next() {
      
         if(this.hasNext()){
            return day[index++];
         }
         return null;
      }		
   }
}
