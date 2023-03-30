class A16{
    public static void main(String args[]){
        int b = 120;
        String s = new String(Integer.toString(b));
        
        System.out.println(" int value into String "+Integer.toString(b));
        System.out.println(" int value into Integer instance.. "+Integer.valueOf(b));
        System.out.println("String instance into Integer instance. "+Integer.valueOf(s));
        System.out.println("int value into binary" +Integer.toBinaryString(b) );
        System.out.println("int value into octal"+Integer.toOctalString(b) );
        System.out.println("int value into hexadecimal "+Integer.toHexString(b));
    }
}