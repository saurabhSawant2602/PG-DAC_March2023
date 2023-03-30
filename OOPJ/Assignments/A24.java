class A24{
    public static void main(String args[]){
        float b = 120;
        String s = new String(Float.toString(b));
        
        System.out.println("float value into String "+Float.toString(b));
        System.out.println("float value into float instance.. "+Float.valueOf(b));
        System.out.println("String instance into float instance. "+Float.valueOf(s));
        System.out.println("float value into hexadecimal "+Float.toHexString(b));
    }
}