package com.shopping.aop;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;
import org.springframework.util.StringUtils;

@Aspect
@Component
public class LogTimeAspect {
    Logger logger = LoggerFactory.getLogger(LogTimeAspect.class);

    @Around(value = "execution(* com.shopping.usermangement.controller..*(..))")
    public Object LogTime(ProceedingJoinPoint joinPoint) throws Throwable {
        Long currentTime = System.currentTimeMillis();
        StringBuilder builder = new StringBuilder("KPI :");
        builder.append("[").append(joinPoint.getKind()).append("]\tfor: ").append(joinPoint.getSignature())
                .append("\twith args : ").append("(").append(StringUtils.arrayToDelimitedString(joinPoint.getArgs(), ",")).append(")");
        builder.append("\ttook");
        Object returnValue = joinPoint.proceed();
        logger.info(builder.append(" ").append(System.currentTimeMillis() - currentTime).append(" ms.").toString());
        return returnValue;
    }
}
