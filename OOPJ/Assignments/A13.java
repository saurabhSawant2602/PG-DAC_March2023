class A13
{
    public static void main(String args[]){
        /* Write a program to convert:
a. short value into String
b. short value into Short instance.
c. String instance into Short instan
      */
      short s =14;
      String S = Short.toString(s);
      Short s1 = new Short(s);
      String S1 = new String(Short.toString(s)) ;
      
       System.out.println("Short to String : "+S);
      System.out.println("Short to Short Instance : "+s1);
      System.out.println("Short to StringInstance : "+S1);
    }
} 