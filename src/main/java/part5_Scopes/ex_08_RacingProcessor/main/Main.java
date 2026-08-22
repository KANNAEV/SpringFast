package part5_Scopes.ex_08_RacingProcessor.main;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import part5_Scopes.ex_08_RacingProcessor.config.ProjectConfig;
import part5_Scopes.ex_08_RacingProcessor.model.Comment;
import part5_Scopes.ex_08_RacingProcessor.services.CommentService;

public class Main {

	public static void main(String[] args) {
		var context = new AnnotationConfigApplicationContext(ProjectConfig.class);

		// Сервис у нас синглтон, поэтому каждый раз возвращается тот же самый сервис
		var commentService1 = context.getBean(CommentService.class);  // сервис 1
		var commentService2 = context.getBean(CommentService.class);  // сервис 2

		System.out.println(commentService1 == commentService2); // идентичны

		// Но при вызове CommentProcessor из CommentService создает ему новый экземпляр
		commentService1.sendComment(new Comment());
		commentService1.sendComment(new Comment());
		commentService2.sendComment(new Comment());

		// Мы всегда получаем 4 выполненных операций
		// Подтверждение тому, что поле numberOfMethodsCalls каждый раз накапливает 4 вызова методов
		// прототипного бина CommentProcess
		// При следующем вызове - он обнуляется потом что создается новый прототипный бин процессора в CommentService


	}
}
