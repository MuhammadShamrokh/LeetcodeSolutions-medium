package shamrokh.muhammad.leetcode.solutions;

import org.junit.jupiter.api.*;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
class SolutionTest {

    Solution solution;
    @BeforeEach
    public void init(){
        solution = new Solution();
    }

    @Test
    @Order(1)
    @DisplayName("Test one")
    public void testOne(){
        assertIterableEquals(Arrays.asList("ad","ae","af","bd","be","bf","cd","ce","cf"), solution.letterCombinations("23"));
    }

    @Test
    @Order(2)
    @DisplayName("Test Two")
    public void testTwo(){
        assertIterableEquals(List.of(), solution.letterCombinations(""));
    }

    @Test
    @Order(3)
    @DisplayName("Test Three")
    public void testThree(){
        assertIterableEquals(List.of("a","b","c"), solution.letterCombinations("2"));
    }

    @Test
    @Order(4)
    @DisplayName("Test Four")
    public void testFour(){
    }

    @Test
    @Order(5)
    @DisplayName("Test Five")
    public void testFive(){
    }


}