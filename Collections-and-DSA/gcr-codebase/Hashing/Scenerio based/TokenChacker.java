package Hashing;

import java.util.*;

class TokenChecker {
    public boolean hasDuplicateToken(String[] tokens) {
        Set<String> seen = new HashSet<>();
        for (String token : tokens) {
            if (!seen.add(token)) { // add() returns false if already present
                return true;
            }
        }
        return false;
    }
}
