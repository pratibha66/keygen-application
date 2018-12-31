package pratibha.co.pratibha.repository.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;
import pratibha.co.pratibha.Permutation;
import pratibha.co.pratibha.repository.KeyGen;

import java.util.Set;
@Repository
public class KeyGenImpl implements KeyGen{
    @Autowired
    private JdbcTemplate jdbcTemplate;
    private static final String RANDOM_STRING = "abcde12345";
    public void generateAllKeys(){
        Set<String> keys =  Permutation.findPermutations(RANDOM_STRING, 4);
        try {
            for(String key : keys){
                jdbcTemplate.update(
                        "INSERT INTO available_urls(short_url) VALUES (?)", key);
            }
        } catch (DataAccessException ex){
            ex.printStackTrace();
        }

    }
}
