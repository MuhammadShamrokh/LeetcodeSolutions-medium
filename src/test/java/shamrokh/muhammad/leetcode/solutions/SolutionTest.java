package shamrokh.muhammad.leetcode.solutions;

import org.junit.jupiter.api.*;
import org.springframework.boot.test.context.SpringBootTest;

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
        assertEquals(3, solution.lengthOfLongestSubstring("abcabcbb"));
    }

    @Test
    @Order(2)
    @DisplayName("Test Two")
    public void testTwo(){
        assertEquals(1, solution.lengthOfLongestSubstring("bbbbb"));
    }

    @Test
    @Order(3)
    @DisplayName("Test Three")
    public void testThree(){
        assertEquals(3, solution.lengthOfLongestSubstring("pwwkew"));
    }


}