package Hashing;

import java.util.*;

class MigrationAnalyzer {
    public int longestConsecutiveRun(int[] ids) {
        Set<Integer> idSet = new HashSet<>();
        for (int id : ids) idSet.add(id);

        int longest = 0;
        for (int id : idSet) {
            if (!idSet.contains(id - 1)) { // start of a run
                int length = 1;
                int current = id;
                while (idSet.contains(current + 1)) {
                    current++;
                    length++;
                }
                longest = Math.max(longest, length);
            }
        }
        return longest;
    }
}
