import sun.reflect.generics.tree.Tree;

import java.util.SortedSet;
import java.util.TreeSet;

/**
 * Created by gabriel on 16/02/2017.
 * Codewars Challenge, the task is to return the first longest string
 * consisting of K consecutive strings taken in the array.
 */
public class LongestConsec {

    public static void main(String[] args) {
        String[] testData = {"zone", "abigail", "theta", "form", "libe", "zas", "theta", "abigail"};
        //String[] testData = {"wlwsasphmxx","owiaxujylentrklctozmymu","wpgozvxxiu"};
        //String[] testData = {"ejjjjmmtthh", "zxxuueeg", "aanlljrrrxx", "dqqqaaabbb", "oocccffuucccjjjkkkjyyyeehh"};
        //String[] testData = {"it","wkppv","ixoyx", "3452", "zzzzzzzzzzzz"};
        System.out.println(longestConsec(testData, 2));
    }

    public static String longestConsec(String[] strarr, int k){
        int numConsecStr = strarr.length - k;
        SortedSet<String> consecStrings = new TreeSet<String>();
        StringBuilder b = new StringBuilder();
        String[] longest = new String[1];
        if(strarr.length == 0 || k > strarr.length-1 || k <= 0){
            return "";
        }
        for(int i = 0; i <= numConsecStr; i++){
            b.delete(0, b.length());
            for(int s = i; s < i + k; s++){
                b.append(strarr[s]);
            }
            consecStrings.add(b.toString());
        }
        int maxLen = 0;
        for(String n: consecStrings){
            int len = n.length();
            if(maxLen == 0 || len > maxLen){
                longest[0] = n;
                maxLen = len;
            }
        }

        return longest[0];
    }
}
