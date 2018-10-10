package mavendemo;

import org.junit.Test;

import com.mvn.entity.HelloWorld;

public class HelloTest {
	@Test
	public void test1() {
		HelloWorld hello=new HelloWorld();
		hello.say();
	}
}
