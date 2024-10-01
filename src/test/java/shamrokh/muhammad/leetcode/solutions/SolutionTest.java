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
        assertEquals(49, solution.maxArea(new int[]{1,8,6,2,5,4,8,3,7}));
    }

    @Test
    @Order(2)
    @DisplayName("Test Two")
    public void testTwo(){
        assertEquals(1, solution.maxArea(new int[]{1,1}));
    }

    @Test
    @Order(3)
    @DisplayName("Test Three")
    public void testThree(){
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