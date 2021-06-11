package trikampis.trik;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

@SpringBootApplication
public class TrikApplication {

	public static void main(String[] args) {
		SpringApplication.run(TrikApplication.class, args);
		//triangleProgram program = new triangleProgram(); 
		ApplicationContext context = new ClassPathXmlApplicationContext( "file:src/beans.xml" );
		triangleProgram triangle_program = (triangleProgram) context.getBean( "mainspring" );
		triangle_program.runTriangleProgram();
	}

}
