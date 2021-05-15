public class LeetCode072_Edit_distance {
    public static void main(String[] args) {
        System.out.println("keep happy");
        System.out.println(minDistance("horse", "ros"));
    }

    /**
     Let following be the function definition :-

     f(i, j) := minimum cost (or steps) required to convert first i characters of word1 to first j characters of word2

     Case 1: word1[i] == word2[j], i.e. the ith the jth character matches.

     f(i, j) = f(i - 1, j - 1)

     Case 2: word1[i] != word2[j], then we must either insert, delete or replace, whichever is cheaper

     f(i, j) = 1 + min { f(i, j - 1), f(i - 1, j), f(i - 1, j - 1) }

     f(i, j - 1) represents insert operation
     f(i - 1, j) represents delete operation
     f(i - 1, j - 1) represents replace operation
     Here, we consider any operation from word1 to word2. It means, when we say insert operation, we insert a new character after word1 that matches the jth character of word2. So, now have to match i characters of word1 to j - 1 characters of word2. Same goes for other 2 operations as well.

     Note that the problem is symmetric. The insert operation in one direction (i.e. from word1 to word2) is same as delete operation in other. So, we could choose any direction.

     Above equations become the recursive definitions for DP.

     Base Case:

     f(0, k) = f(k, 0) = k

     Below is the direct bottom-up translation of this recurrent relation. It is only important to take care of 0-based index with actual code :-


     * */
    public static int minDistance(String word1, String word2) {
        return word2.length();
    }
}
