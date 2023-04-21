package io.abhinandan.employeeAPIDB.Logger;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;


@Aspect
@Controller
public class LoggingAspect
{
	private static final Logger LOGGER = LoggerFactory.getLogger(LoggingAspect.class);
	
	@Before("execution(public * io.abhinandan.employeeAPIDB.Controller.EmployeeController.getAllEmployee())")
	public void logBeforeGetAllEmployee()
	{
		LOGGER.info("getAllEmployee() invoked - aspect.");
	}
	
	@After("execution(public * io.abhinandan.employeeAPIDB.Controller.EmployeeController.getAllEmployee())")
	public void logAfter()
	{
		LOGGER.info("getAllEmployee() method executed - aspect");
	}
}
