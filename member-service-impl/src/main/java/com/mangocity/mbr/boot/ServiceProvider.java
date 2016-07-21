package com.mangocity.mbr.boot;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author Administrator
 * @since 1.0.0
 */
public class ServiceProvider {

	private static final Logger LOGGER = LoggerFactory.getLogger(ServiceProvider.class);

	private static volatile boolean running = true;

	static ClassPathXmlApplicationContext context;

	public static void main(String[] args) {
		LOGGER.info("\nstart ------------ServiceProvider -----------\n");

		context = new ClassPathXmlApplicationContext("spring/applicationContext-service.xml");
		context.start();

		System.out.println("start up.");
		LOGGER.info("\n-----------------ServiceProvider has been started-------------\n");
		Runtime.getRuntime().addShutdownHook(new Thread() {
			public void run() {
				if (context != null) {
					context.stop();
					context.close();
					context = null;
				}
				LOGGER.info("service " + ServiceProvider.class.getSimpleName() + " stopped!");
				synchronized (ServiceProvider.class) {
					running = false;
					ServiceProvider.class.notify();
				}
			}
		});

		synchronized (ServiceProvider.class) {
			while (running) {
				try {
					ServiceProvider.class.wait();
				} catch (Throwable e) {
				}
			}
		}

	}
}
