package shamrokh.muhammad.leetcode;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import shamrokh.muhammad.leetcode.solutions.Solution;

@SpringBootApplication
public class LeetcodeApplication {

	public static void main(String[] args) {
		SpringApplication.run(LeetcodeApplication.class, args);
	}

	@Bean
	public CommandLineRunner commandLineRunner()
	{
		return runner -> new Solution().threeSum(new int[]{-1,0,1,2,-1,-4});
	}

}
