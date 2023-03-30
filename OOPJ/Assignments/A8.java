class A8{
    public static void main(String args[]){
        byte b = 4;
        String s = Byte.toString(b);
        System.out.println("Byte to String value is : "+b);
        
        byte by=14;
        Byte B =new Byte(by);
        System.out.println("Byte to byte instance value is : "+B);
    
        String s1 = "a";
        String S = new String(s1);
        System.out.println("String instant is = "+S);
        Byte B1 = new Byte(Byte.parseByte(S));
        //Integer B1 = new Integer(Integer.parseInt(S));
        System.out.println("String instant to byte instant = "+B1);

    }
} 