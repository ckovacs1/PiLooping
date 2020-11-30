public class PiBetter{



    public static void main(String[] args){

        //sets the start of the pi equation and max loop value
        double piAppx = 1.0 - 1.0/3 + 1.0/5;
        int MAX_I_VALUE = 100000000;

        //loops over the original equation subtracting 1/the next odd number, then adding 1/next odd
        for (int i = 7; i <= MAX_I_VALUE; i+=2){

            piAppx -= 1.0/i;
            i += 2;
            piAppx += 1.0/i;
        }

        //multiplies appx by 4
        double finalPi = 4.0*piAppx;


        //prints out the final approximations in comparison to the number given by the pi function built in
        System.out.println("Pi approximation =\t" + finalPi);

        System.out.println("Math.PI = \t\t" + Math.PI);

        System.out.println("Math.PI - piAppx =\t"+ (Math.PI-finalPi) );
    }
}