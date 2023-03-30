class A28{
    public static void main(String args[]){
        double b = 120;
        String s = new String(Double.toString(b));
        
        System.out.println("double value into String "+Double.toString(b));
        System.out.println("double value into double instance.. "+Double.valueOf(b));
        System.out.println("double instance into double instance. "+Double.valueOf(s));
        System.out.println("double value into hexadecimal "+Double.toHexString(b));
        System.out.println("double value into binary :"+ Long.toBinaryString(Double.doubleToLongBits(b)));
        System.out.println("double value into octal :"+ Long.toOctalString(Double.doubleToLongBits(b)));
    }
}