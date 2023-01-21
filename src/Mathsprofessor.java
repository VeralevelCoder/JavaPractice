import java.util.*;


class MathProfessor{
    public static void main(String args[]){
//        Scanner sc = new Scanner(System.in);
//        int n=sc.nextInt();
//        sc.nextLine();
//        String B=sc.nextLine();
//        String a[]=new String[n];
//        for(int i=0;i<n;i++)
//        {
//            a[i]=sc.nextLine();
//        }
        int[] res=mathProfessor(3,"iye", new String[]{"hi", "bye", "bebe"});;
        for(int i:res)
            System.out.print(i+" ");

    }

    static int[] mathProfessor(int n,String B,String[] a){
        int[] counts = new int[a.length];
        for (int i = 0; i < a.length; i++) {
            HashSet<Character> uniqueLetters = new HashSet<>();
            for (int j = 0; j < a[i].length(); j++) {
                if (B.indexOf(a[i].charAt(j)) >= 0) {
                    uniqueLetters.add(a[i].charAt(j));
                }

            }
            counts[i] = uniqueLetters.size();
        }
        return counts;
    }
}

/* 
  Crio Methodology
  
  Milestone 1: Understand the problem clearly
  1. Ask questions & clarify the problem statement clearly.
  2. *Type down* an example or two to confirm your understanding of the input/output & extend it to test cases
  
  Milestone 2: Finalize approach & execution plan
  1. Understand what type of problem you are solving.
       a. Obvious logic, tests ability to convert logic to code
       b. Figuring out logic
       c. Knowledge of specific domain or concepts
       d. Knowledge of specific algorithm
       e. Mapping real world into abstract concepts/data structures
  2. Brainstorm multiple ways to solve the problem and pick one
  3. Get to a point where you can explain your approach to a 10 year old
  4. Take a stab at the high-level logic & *type it down*.
  5. Try to offload processing to functions & keeping your main code small.
  
  Milestone 3: Code by expanding your pseudocode
  1. Have frequent runs of your code, dont wait for the end
  2. Make sure you name the variables, functions clearly.
  3. Avoid constants in your code unless necessary; go for generic functions, you can use examples for your thinking though.
  4. Use libraries as much as possible
  
  Milestone 4: Prove to the interviewer that your code works with unit tests
  1. Make sure you check boundary conditions
  2. Time & storage complexity
  3. Suggest optimizations if applicable
  */