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
    @DisplayName("Test One")
    public void testOne(){
        //Input: nums = [1,2,3]
        //Output: [1,3,2]
        int[] expected = new int[]{1, 3, 2};
        int[] input = new int[]{1,2,3};

        solution.nextPermutation(input);

        assertArrayEquals(expected, input);
    }

    @Test
    @Order(2)
    @DisplayName("Test Two")
    public void testTwo(){
        //Input: nums = [3,2,1]
        //Output: [1,2,3]
        int[] expected = new int[]{1,2,3};
        int[] input = new int[]{3,2,1};

        solution.nextPermutation(input);

        assertArrayEquals(expected, input);
    }

    @Test
    @Order(3)
    @DisplayName("Test Three")
    public void testThree(){
        //Input: nums = [1,1,5]
        //Output: [1,5,1]
        int[] expected = new int[]{1,5,1};
        int[] input = new int[]{1,1,5};

        solution.nextPermutation(input);

        assertArrayEquals(expected, input);
    }

    @Test
    @Order(4)
    @DisplayName("Test Four")
    public void testFour(){
        //Input: nums = [1,3,2]
        //Output: [2,1,3]

        int[] expected = new int[]{2,1,3};
        int[] input = new int[]{1,3,2};

        solution.nextPermutation(input);

        assertArrayEquals(expected, input);
    }

    @Test
    @Order(5)
    @DisplayName("Test Five")
    public void testFive(){
    }


}