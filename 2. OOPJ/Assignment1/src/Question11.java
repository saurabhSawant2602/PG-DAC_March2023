class Question11{
    public static void main(String[] args){
        String s = new String(args[0]);
        char ch = s.charAt(0);
        

        if(Character.isDigit(ch)){
            System.out.println("entered character is digit " +ch);
        }
        else{
            if(Character.isLowerCase(ch)){
                System.out.println("lowercase convert into uppercase " + Character.toUpperCase(ch));
            }
            else{
                System.out.println(" uppercase convert into lowercase " + Character.toLowerCase(ch));
            }
            

        }

    }
    
}