package com.mangocity.mbr.action;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;

import com.mangocity.mbr.Mbr;
import com.mangocity.mbr.service.IMbrService;

/**
 * @ClassName: MbrAction.java
 * @Description: TODO
 * @author: jie.yang
 * @email: jie.yang@mangocity.com
 * @date: 2016年5月6日 下午1:52:03
 */
public class MbrAction {
	private static Logger LOGGER = Logger.getLogger(MbrAction.class);
	@Autowired
	private IMbrService iMbrService;

	public String addMbr() {
		LOGGER.info("addMbr begin{}");
		Mbr mbr = new Mbr();
		mbr.setId(1L);
		mbr.setName("Jerrik");
		mbr.setGender("男");
		iMbrService.addMbr(mbr);
		return "add_success";
	}
}
