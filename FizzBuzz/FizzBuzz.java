public class FizzBuzz{
    private static final String FIZZ = "Fizz";
    private static final String BUZZ = "Buzz";
    private static final int DEFAULT_FIZZ = 3;
    private static final int DEFAULT_BUZZ = 5;
    private static final int DEFAULT_FROM = 1;
    private static final int DEFAULT_TO = 100;
    
    private FizzBuzz(){
        //prevent instantiation
    }
    public static String fizzBuzz(){
        return fizzBuzz(DEFAULT_FIZZ, DEFAULT_BUZZ, DEFAULT_FROM, DEFAULT_TO);
    }
    public static String fizzBuzz(int fizz, int buzz){
       return fizzBuzz(fizz, buzz, DEFAULT_FROM, DEFAULT_TO);
    }
    public static String fizzBuzz(int fizz, int buzz, int from, int to){
        StringBuilder output = new StringBuilder(); 
        if(from < 1){
            from = DEFAULT_FROM; //set invalid to default
        } if(to < from){
            to = from; //set invalid to equal to from
        }
        //TODO: add validation for fizz and buzz params
        for(int i = from; i <= to; i++){
            if(i % fizz == 0){
                output.append(FIZZ);
                if(i % buzz == 0){
                    output.append(BUZZ);
                }
            } else if(i % buzz == 0){
                output.append(BUZZ);
            } else{
                output.append(i);
            }
            output.append(System.lineSeparator());
        }
        return output.toString();
    }
    public static void main(String[] args){
        System.out.print(FizzBuzz.fizzBuzz());
    }
} 
