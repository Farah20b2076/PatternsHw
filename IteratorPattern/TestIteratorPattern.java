public class TestIteratorPattern {
    public static void main(String[] args) {
        Days day = new Days();
  
        for(Iterator iter = day.getIterator(); iter.hasNext();){
           String today = (String)iter.next();
           System.out.println("Day : " + today);
        } 	
     }
}
