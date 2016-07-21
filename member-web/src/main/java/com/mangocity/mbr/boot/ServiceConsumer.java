package com.mangocity.mbr.boot;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.mangocity.mbr.Mbr;
import com.mangocity.mbr.service.IMbrService;

/**
 * @author Administrator
 * @since 1.0.0
 */
public class ServiceConsumer {

	private static final Logger LOGGER = LoggerFactory.getLogger(ServiceConsumer.class);

	private static volatile boolean running = true;

	static ClassPathXmlApplicationContext context;

	public static void main(String[] args) {
		LOGGER.info("\nstart ------------ConsumerMain -----------\n");

		context = new ClassPathXmlApplicationContext("spring/applicationContext.xml");
		context.start();

		IMbrService iMbrService = context.getBean("mbrService", IMbrService.class);
		Mbr mbr = new Mbr();
		mbr.setId(2L);
		mbr.setName("admin");
		mbr.setGender("女");
		iMbrService.addMbr(mbr);
	}
}
