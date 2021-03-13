public class Lesson {
    public static void main(String[] args) {
        byte byteVal=100;
        short shortVal=-1500;
        int intVal=250000000;
        long longVal=1520000000000000000L;
        float floatVal=55.25F;
        double doubleVal=562.672;
        char charVal='\u0000';
        boolean boolenVal=true;

        System.out.println(Lesson.calculate(1F,2F,3F,0.5F));
        System.out.println(Lesson.checkIntValues(10,5));
        Lesson.printPosNeg(-43);
    }

    static double calculate(float a,float b,float c,float d){
        return a*(b+(c/d));
    }

    static boolean checkIntValues(int first,int second ){
        long sum=first+second;
        return (sum>10)&&(sum<20);
    }

    static void printPosNeg (int val){
        if (val<0){
            System.out.println("Отрицательное");
        } else{
            System.out.println("Положительное");
        }
    }
}
