public class DVD
{
   //Declare the class variables.

   /** the title of the DVD */
   private String titleDVD;
   /** the number of available copies */
   private int numAvailCopies;

   /** Constructs a DVD object and sets the number of copies
    *  to 1.
    *  @param t the title of the DVD
    */

   public DVD(String t)
   {
      numAvailCopies = 1;
   }

   /** Increments the number of available copies of this DVD.
    */
   public void incrementCopies()
   {
      numAvailCopies++;
   }

   /** Decrements the number of available copies of this DVD.
    */
   public void decrementCopies()
   {
      numAvailCopies--;
   }

   /** Gets the title of this DVD.
    *
    *  @return the title of the DVD.
    */
   public String getTitle()
   {
      return titleDVD;
   }

   /** Gets the number of available copies for this DVD.
    *
    *  @return the number of available copies.
    */
   public int getNumCopies()
   {
      return numAvailCopies;
   }

   /** Returns a representation of this DVD object as a
    *  String in the format <title> copies: <num. copies>.
    *
    *  @return the String representation of the DVD.
    */

   public String toString()
   {
      String num = String.valueOf(numAvailCopies);
      return titleDVD + "copies: " + num;
   }

}
