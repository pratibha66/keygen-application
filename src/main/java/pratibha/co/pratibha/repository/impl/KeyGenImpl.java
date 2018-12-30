package pratibha.co.pratibha.repository.impl;

import pratibha.co.pratibha.Permutation;
import pratibha.co.pratibha.repository.KeyGen;

import java.util.Set;

public class KeyGenImpl implements KeyGen{
    private static final String RANDOM_STRING = "abcde12345";
    public void generateAllKeys(){
        Set<String> keys =  Permutation.findPermutations(RANDOM_STRING, 4);

    }
}
