package algorithm.application;

import java.util.Map;

public class App {

	public static void main(String[] args) {
		Map<String, String> envs = System.getenv();
		envs.forEach((key, value) -> {System.out.println(String.format("key=[%s], value=[%s]", key, value));});
	}

}
