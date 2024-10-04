package shamrokh.muhammad.leetcode;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import shamrokh.muhammad.leetcode.solutions.Solution;

import java.util.List;


@SpringBootApplication
public class LeetcodeApplication {

	public static void main(String[] args) {
		SpringApplication.run(LeetcodeApplication.class, args);
	}

	@Bean
	public CommandLineRunner commandLineRunner(){
		return runner -> {
			List<String> result = new Solution().generateParenthesis(3);

			result.forEach(System.out::println);
		};
	}

}
