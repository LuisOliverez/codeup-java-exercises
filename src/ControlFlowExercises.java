public class ControlFlowExercises {
    public static void main(String[] args) {

// -------------------------#1---------------------
//        int i = 5;
//        while(i <= 15) {
//            System.out.print(i);
//            i++;
//        }

//        long i = 2;
//        do {
//            System.out.println(i);
//            i *= i;
//        }while (i < 1000000L);

//if int has capacity, why is a long needed to prevent overflow???


//        long i = 2;
//        do {
//            System.out.println(i);
//            i *= i;
//        } while (i < 1000000L);


//        for (long i = 2; i <1000000L; i *= i){
//            System.out.println(i);
//        }



// -------------------------#2---------------------

        for(int i = 1; i <= 100; i++){
            if(i % 3 == 0 && i % 5 ==0){
                System.out.println("FizzBuzz");
            }else if(i %3 == 0){
                System.out.println("Fiz");
            } else if (i % 5 ==0) {
                System.out.println("Buzz");
            }else {
                System.out.println(i);
            }
        }





// -------------------------#3---------------------


// -------------------------#4---------------------


    }


}
