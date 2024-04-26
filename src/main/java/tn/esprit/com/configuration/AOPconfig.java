package tn.esprit.com.configuration;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

import java.util.logging.LogManager;
import java.util.logging.Logger;

@Aspect
@Component
public class AOPconfig {


    private static final org.slf4j.Logger log = LoggerFactory.getLogger(AOPconfig.class);

    //private static final Logger logger = LogManager.getLogger();
    @Before("execution(* tn.esprit.com.services.*.*(..))")
    public void logMethodEntry(JoinPoint joinPoint){
        String serviceName = joinPoint.getThis().toString();
        String name = joinPoint.getSignature().getName();
        log.info("service name = "+serviceName + "---- method name = "+name);
    }
    @Around("execution(* tn.esprit.com.services.*.*(..))")
    public Object profile(ProceedingJoinPoint pjp) throws Throwable{
        long start = System.currentTimeMillis();
        Object obj = pjp.proceed();
        long elapsedTime = System.currentTimeMillis() - start;
        log.info("method excecution time: " + elapsedTime + " ms");
        return obj;
    }
    @AfterReturning("execution(* tn.esprit.com.services.*.*(..))")
    public void logMethodExit1(JoinPoint jp){
        String serviceName = jp.getThis().toString();
        String name = jp.getSignature().getName();
        log.info(" After Returning "+"service name = "+serviceName + "---- method name = "+name);

    }

    @After("execution(* tn.esprit.com.services.*.*(..))")
    public void logMethodExitAfterThrowing(JoinPoint jp){
        String serviceName = jp.getThis().toString();
        String name = jp.getSignature().getName();
        log.info(" after  "+"service name = "+serviceName + "---- method name = "+name);

    }
    @AfterThrowing("execution(* tn.esprit.com.services.*.*(..))")
    public void logMethodExitAfterReturning(JoinPoint jp){
        String serviceName = jp.getThis().toString();
        String name = jp.getSignature().getName();
        log.info(" after throwing "+"service name = "+serviceName + "---- method name = "+name);

    }



}
