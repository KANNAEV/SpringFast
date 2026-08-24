package part6_AOP.task2.aspects;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;

import java.util.Arrays;
import java.util.logging.Logger;

@Aspect

public class CommentsAspect {

	private final Logger logger = Logger.getLogger(CommentsAspect.class.getName());

	@Around("execution(* part6_AOP.task2.services.*.*(..))") // Срез
	public Object my_logger_aspect(ProceedingJoinPoint joinPoint) throws Throwable {

		String methodName = joinPoint.getSignature().getName(); // Имя перехватываемого метода
		Object[] arguments = joinPoint.getArgs();               // Аргументы перехватываемого метода

		// Вывод имени и параметров перехватываемого метода перед выполнением
		logger.info("Method: " + methodName + " with parameters: " + Arrays.asList(arguments));

		// Вызов перехватываемого метода
		Object returnedByMethod = joinPoint.proceed();

		// Вывод после вызова метода
		logger.info("Method executed and returned " + returnedByMethod);

		// Возвращение значения, которое возвращает перехватываемый метод
		return returnedByMethod;
	}

}
