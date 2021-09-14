public class Assignment1 {
    public static void main(String[] args) throws Exception {
        int total = 0;
        for (String arg: args){
            try{
                Integer i = Integer.parseInt(arg);
                total = total + i;
            } 
            catch (Exception e){
                System.out.printf("'%s' cannot be turned into an integer!\n", arg);
            }
        }
        System.out.printf("Sum of the integer arguments: %d\n", total);
    }
}
