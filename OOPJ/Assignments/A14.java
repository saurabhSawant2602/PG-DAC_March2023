class A14 {

    public static void main(String[] args) {
        short a = 101;
        Short s = new Short(a);
        System.out.println(s.byteValue());
        System.out.println(s.shortValue());
        System.out.println(s.intValue());
        System.out.println(s.floatValue());
        System.out.println(s.doubleValue());
        System.out.println(s.longValue());
    }
    
}