class A6{
     public static void main(String args[]){
        boolean b =true ;
        String s = Boolean.toString( b ) ;
        System.out.println("New string value is : " + s);

        Boolean B = new Boolean ("true");
        System.out.println("New Boolean instance value is : " + B);
          //Boolean.valueOf();
          
        String S ="true";
        boolean ab= Boolean.parseBoolean(S);
        System.out.println("new boleean valu is ::"+S);

        Boolean B1 = new Boolean (S);
        System.out.println("String to boolean instance value is : " + B1);


     }
    
    
     
    
    
}