/*
   Project 1 - Sample1.java; A simple class to demonstrate the relationship
	                          between object and class.

   CT01498 - Beginning Java; Fairfax County Public Schools,
                             Adult And Community Education
*/

class Sample1
{
   private int     intObjectField;
   private float   floatObjectField;

   private static int     intClassField = 0;
   private static float   floatClassField = 0.0f;

   public Sample1()
   {
      intObjectField = 0;
      floatObjectField = 0;
   }

   /**
    * Accessor for integer field value
    */
   public int getIntObjectFieldValue()         
   {
      return intObjectField;
   }

   /**
    * Accessor for integer field value
    */
   public void setIntObjectFieldValue(int inNewValue)         
   {
      intObjectField = inNewValue;
   }

   /**
    * Accessor for float field value
    */
   public float getFloatObjectFieldValue()         
   {
      return floatObjectField;
   }

   /**
    * Accessor for float field value
    */
   public void setFloatObjectFieldValue(float inNewValue)         
   {
      floatObjectField = inNewValue;
   }

   /**
    * Dump the current object values to standard output
    */
   public void dumpObjectValues()
   {
      System.out.print( "int field value: " + intObjectField );
      System.out.println( ", float field value: " + floatObjectField );
   }

   /**
    * Accessor for class integer field value
    */
   public static int getIntClassFieldValue()
   {
      return intClassField;
   }

   /**
    * Accessor for class integer field value
    */
   public static void setIntClassFieldValue(int inNewValue)         
   {
      intClassField = inNewValue;
   }

   /**
    * Accessor for class float field value
    */
   public static float getFloatClassFieldValue()         
   {
      return floatClassField;
   }

   /**
    * Accessor for class float field value
    */
   public static void setFloatClassFieldValue(float inNewValue)         
   {
      floatClassField = inNewValue;
   }

   /**
    * Dump the current class values to standard output
    */
   public static void dumpClassValues()
   {
      System.out.print( "class int field value: " + intClassField );
      System.out.println( ", class float field value: " + floatClassField );
   }

}   //   Sample1 class
