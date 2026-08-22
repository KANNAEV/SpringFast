package part6_AOP.task1.aspects;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;

import java.util.logging.Logger;

@Aspect

public class CommentsAspect {

	private final Logger logger = Logger.getLogger(CommentsAspect.class.getName());

	@Around("execution(* part6_AOP.task1.services.*.*(..))") // все методы из пакета сервис
	public void my_logger_aspect(ProceedingJoinPoint joinPoint) throws Throwable {
		String methodName = joinPoint.getSignature().getName();
		logger.info(methodName + " HELLO IAM ASPEKT"); // СОВЕТ ДО МЕТОДА
		joinPoint.proceed(); // Это сам метод сервиса который вызывается
		logger.info(methodName + " GoodBye From ASPEKT"); // СОВЕТ ПОСЛЕ МЕТОДА
	}

}
