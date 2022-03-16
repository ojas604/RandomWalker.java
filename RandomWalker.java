/*************************************************************************
 *  Compilation:  javac RandomWalker.java
 *  Execution:    java RandomWalker 10
 *
 *  @author: Ojas Jain // oj34@rutgers.edu // NETid: oj34
 *
 * The program RandomWalker that takes an int command-line argument n
 * and simulates the motion of a random walk for n steps. Print the
 * location at each step (including the starting point), treating the
 * starting point as the origin (0, 0). Also, print the square of the
 * final Euclidean distance from the origin.
 *
 *  % java RandomWalker 10
 * (0,0)
 * (-1,0)
 * (-1,-1)
 * (-1,-2)
 * (-1,-3)
 * (-1,-4)
 * (-1,-5)
 * (0,-5)
 * (-1,-5)
 * (-2,-5)
 * (-2,-4)
 * Squared distance = 20.0
 *
 *************************************************************************/

public class RandomWalker {

    public static void main(String[] args) {

        double squaredDistance = 0.0;
        int X = 0;
        int Y = 0;
        int rotation = 0;
        
        int inputSteps = Integer.parseInt(args[0]);

        System.out.println("("+X+","+Y+")");
        while(rotation < inputSteps) {

                int random = (int)(Math.random()*4);
                random = (random % 4);
                if (random == 0)
                        X += 1;
                else if(random == 1)
                        X-=1;
                else if (random == 2)
                        Y+=1;
                else
                        Y-=1;
                System.out.println("("+X+","+Y+")");
                rotation++;
            }

        squaredDistance = ((X)*(X))+((Y)*(Y));
        System.out.println("Squared distance = " + squaredDistance);
    }
}