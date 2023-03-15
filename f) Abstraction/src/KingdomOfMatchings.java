import java.util.Scanner;

public class KingdomOfMatchings{

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        
        boolean flag = false;
        int carlosVotes;
        int numberOfVoters = 0;
        numberOfVoters = scanner.nextInt();
        int[] votesPerCandidate = new int[numberOfVoters];

        for(int eachVote: votesPerCandidate){
            votesPerCandidate[eachVote] = scanner.nextInt();
        }

        for(int i = 1; i < numberOfVoters; i++){
            carlosVotes = votesPerCandidate[0];
            if(carlosVotes >= votesPerCandidate[i] ){
                flag = true;
            }
        }
        
        if(flag){
            System.out.println("S");
        }else{
            System.out.println("N");
        }


    }

}

// The time has come for the buffoon election and a total election of N candidates have registered.
// each candidate will have 5 minutes to perfom in front of the audicence.
// After the performances, each citizen may vote for one of the candidated, and the most voted candidate will be elected.
// If there is a tie between one or more candidates. The one to have registered first will win.
// Knownig this, Carlos spent nights in front of the electoral office and ensured that his application was the first to be registered.

// The first line of input contains an integer N, (2 <= N <= 10^4).
// The next N lines will contain N positive integers v1....vn, one on each line, corresponding to the number of votes each candidate received,
// in order of registration.
// total votes <= 100.000