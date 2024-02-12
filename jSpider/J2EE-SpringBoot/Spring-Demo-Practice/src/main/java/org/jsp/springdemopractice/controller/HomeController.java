package org.jsp.springdemopractice.controller;


import org.jsp.springdemopractice.dto.User;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {

	@GetMapping("/evenorodd/{num}")
	public String evenOrOdd(@PathVariable(name = "num") int number) {
		if (number % 2 == 0) {
			return number + " is an Even";
		}
		return number + " is an Odd";
	}

	// api for prime or not
	@GetMapping("/prime/{num}")
	public String isPrime(@PathVariable int num) {
		int c = 0;
		for (int i = 1; i <= num; i++) {
			if (num % i == 0) {
				c++;
			}
		}
		return c == 2 ? "Prime Number" : "Not a Prime Number";
	}

	// api for Armstrong
	public static int count(int num) {
		int c = 0;
		while (num != 0) {
			c++;
			num = num / 10;
		}
		return c;
	}

	@GetMapping("/armstrong/{num}")
	public String isArmstrong(@PathVariable int num) {
		int n = num;
		int totalCount = count(num);
		int sum = 0;
		while (num != 0) {
			int r = num % 10;
			sum = (int) (sum + Math.pow(r, totalCount));
			num = num / 10;
		}
		return sum == n ? "Armstrong" : "Not a Armstrong";
	}

	// reverse of the number

	@GetMapping("/reverse/{num}")
	public String isreverse(@PathVariable int num) {
		int rev = 0;
		while (num != 0) {
			int r = num % 10;
			rev = (rev * 10) + r;
			num = num / 10;
		}

		return "reverse of the" + num + " =" + rev;
	}

	// api for count the digit
	@GetMapping("/count/{num}")
	public String countDigit(@PathVariable int num) {
		int n = num;
		int c = 0;
		while (num != 0) {
			c++;
			num = num / 10;
		}
		return "Number " + n + " Count is:" + c;
	}

	// api for reverse String
	@GetMapping("/reversestring/{s}")
	public String reverseString(@PathVariable String s) {
		String ans = "";
		for (int i = s.length() - 1; i >= 0; i--) {
			ans = ans + s.charAt(i);
		}
		return "Reverse of the " + ans;
	}

	// api for square
	@GetMapping("/square/{num}")
	public String square(@PathVariable int num) {
		return "The Square of the " + num + " =" + num * num;

	}

	// api for even count
	@GetMapping("/evencount/{num}")
	public String evenCount(@PathVariable int num) {
		int c = 0;
		int n = num;
		while (num != 0) {
			int r = num % 10;
			if (r % 2 == 0) {
				c++;
			}
			num = num / 10;
		}
		return "Total Count of number " + n + " is" + c;

	}

	// odd count
	@GetMapping("/oddcount/{num}")
	public String oddCount(@PathVariable int num) {
		int c = 0;
		int n = num;
		while (num != 0) {
			int r = num % 10;
			if (r % 2 == 1) {
				c++;
			}
			num = num / 10;
		}
		return "Total Count of number " + n + " is " + c;
	}

	// api for vowel count
	@GetMapping("/vowelcount/{s}")
	public String vowelCount(@PathVariable String s) {
		int count = 0;
		s = s.toLowerCase();
		for (int i = 0; i < s.length(); i++) {
			char c = s.charAt(i);
			if (c >= 'a' && c <= 'z') {
				if (c == 'a' || c == 'e' || c == 'o' || c == 'i' || c == 'u') {
					count++;
				}
			}
		}
		return "Vowel in String : " + s + "= " + count;
	}

	// api for consonent count
	@GetMapping("/consonentcount/{s}")
	public String consonentCount(@PathVariable String s) {
		int count = 0;
		s = s.toLowerCase();
		for (int i = 0; i < s.length(); i++) {
			char c = s.charAt(i);
			if (c >= 'a' && c <= 'z') {
				if (c == 'a' || c == 'e' || c == 'o' || c == 'i' || c == 'u') {
					continue;
				} else {
					count++;
				}
			}
		}
		return "Consonent in String : " + s + "= " + count;
	}

	// api for special character count

	@GetMapping("/specialcount/{s}")
	public String specialCount(@PathVariable String s) {
		int count = 0;
		s = s.toLowerCase();
		for (int i = 0; i < s.length(); i++) {
			char c = s.charAt(i);
			if (c >= 'a' && c <= 'z' || c >= '0' && c <= '9') {
				continue;
			} else {
				count++;
			}
		}
		return "Special character in String : " + s + "= " + count;
	}

	// api for number digit count
	@GetMapping("/numbercount/{s}")
	public String numberCount(@PathVariable String s) {
		int count = 0;
		s = s.toLowerCase();
		for (int i = 0; i < s.length(); i++) {
			char c = s.charAt(i);
			if (c >= '0' && c <= '9') {
				count++;
			}
		}
		return "Number Digit in String : " + s + "= " + count;
	}
	
	//posting the User data
			@PostMapping("/user")
			public String printDetailS(@RequestBody User u) {
				System.out.println("User Id: "+u.getId());
				System.out.println("User Name: "+u.getName());
				System.out.println("User Email: "+u.getEmail());
				System.out.println("User phone: "+u.getPhone());
				System.out.println("User Password: "+u.getPassword());
				System.out.println();
				return "User detials Printed";
			}

}
