class A20{
    public static void main(String args[]){
        
     long l =38475756;
     String s = Long.toString(l);
     Long L =new Long(l);
     String S = new String(s);
     Long L1 = Long.valueOf(S);

    System.out.println("long value into String :"+s);
    System.out.println("long value into Long instance : "+L);
    System.out.println("String instance into Long instance :"+S);
    System.out.println("long value into binary :" +Long.toBinaryString(L));
    System.out.println("long value into octoal :"+Long.toOctalString(L));
    System.out.println("long value into hexadecimal :"+Long.toHexString(L));


    }
}
