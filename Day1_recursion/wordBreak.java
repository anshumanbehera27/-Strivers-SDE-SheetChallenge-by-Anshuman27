package resursionREv.permutation;

import java.util.ArrayList;
import java.util.HashSet;

public class wordBreak {
    public static ArrayList<String> wordBreakHelper(String s, int idx, HashSet<String> dictSet, int size)
    {
        // Base Condition
        if (idx == size)
        {
            ArrayList<String> temp = new ArrayList<>();
            temp.add("");
            return temp;
        }

        ArrayList<String> subPart = new ArrayList<>();
        ArrayList<String> completePart = new ArrayList<>();

        String word = "";

        // Start exploring the sentence from the index until we wouldn't find 'j' such that substring [index,j] exists in the dictionary as a word
        for (int j = idx; j < size; j++)
        {
            word += s.charAt(j);
            if (dictSet.contains(word) == false)
            {
                continue;
            }

            // Get the answer for rest of sentence from 'j' to s.size()
            subPart = wordBreakHelper(s, j + 1, dictSet, size);

            //  Append "word" with all the answer that we got
            for (int i = 0; i < subPart.size(); i++)
            {
                if (subPart.get(i).length() != 0)
                {
                    String temp = word;
                    temp += " ";
                    temp += subPart.get(i);
                    subPart.set(i , temp);
                }
                else
                {
                    subPart.set(i, word);
                }
            }

            for (int i = 0; i < subPart.size(); i++)
            {
                completePart.add(subPart.get(i));
            }
        }

        return completePart;
    }

    public static ArrayList<String> wordBreak(String s, ArrayList<String> dictionary)
    {
        // Set to check the whether any word exists in the dictionary or not
        HashSet<String> dictSet = new HashSet<String>();

        for (int i = 0; i < dictionary.size(); i++) {
            dictSet.add(dictionary.get(i));
        }

        return wordBreakHelper(s, 0, dictSet, s.length());
    }

}
