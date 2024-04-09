package Task5;

public class ObjectOccurrence {
    private String name;
    public int occurrence;

   public ObjectOccurrence(String name) {
       this.name = name;
       this.occurrence = 1;
   }

   public String getName() {
       return name;
   }

   public int getOccurrence() {
       return occurrence;
   }

   public void incrementOccurrence() {
       occurrence += 1;
   }
}
