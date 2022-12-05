package com.spring.aop.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;


@Aspect
@Component //IoC container'ın içinde bu classın nesnesının olusması için gerekli
public class ServiceAspect {

	
@Before("execution(* com.spring.aop.service.*.mesajVer(..))")
//com.spring.aop.service paketinin altında yer alan herhangi bir classların içinde yer alan mesajVer metodu çalışırsa  onu yakala
public void mesajVerMetodundanOnce(JoinPoint  jointPoint) {//joint o anki state yakalar.
	
	System.out.println("mesaj ver metodundan önce parametre yakalandı param: "+jointPoint.getArgs()[0]);//state'in içindeki ilk paremetreyi al ekrana yaz
}

@After("execution(* com.spring.aop.service.*.*(..))")
public void mesajVerMetodundanSonra(JoinPoint  jointPoint) {
	
	System.out.println("mesaj ver metodundan sonra parametre yakalandı param: "+jointPoint.getArgs()[0]);
}

}
