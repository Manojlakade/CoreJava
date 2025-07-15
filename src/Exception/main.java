package Exception;

public class main {
    public static void main(String[] args) {
        // Exception= An event that interupts normal flow of program
         //         (dividing by 0,file not found,mismatch input type)
         //         surround dangerous code in try{} block
         //         try{},catch{},finally{}

        int a=0;
        try {
            System.out.println(1 / 0);
        }
        catch(Exception e){
            System.out.println("something went wrong");
        }finally{
            System.out.println("this executes every time");  //Finally block executes even if there is exception or not
                                                            // only in 3 conditions finally block doesnt execute
                                                                // 1.USE OF System.exit() method
                                                                // 2. execption in finaly block
                                                                // 3.the death of thread
        }


    }
}
