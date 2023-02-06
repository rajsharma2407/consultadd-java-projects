class ExceptionHandling{
    public static void divide()throws ArithmeticException{
            int a = 10;
            int b = 0;
            if(b == 0){
                throw new ArithmeticException("Division by zero");
            }
            int z = a/b;
    }

    public static void main(String[] args){
        try{
        divide();
        }catch(ArithmeticException err){
            System.out.println("Error Occured " + err);
        }finally{
            System.out.println("100");
        }
    }
}