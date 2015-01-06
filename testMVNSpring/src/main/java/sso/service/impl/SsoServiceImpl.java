package sso.service.impl;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import sso.dao.ActorDao;
import sso.service.SsoService;

@Component("ssoService")
public class SsoServiceImpl implements SsoService {

	private Logger logger = LoggerFactory.getLogger(getClass());
	
	@Autowired
	@Qualifier("actorDao")
	private ActorDao actorDao;
	
	@Override
	public String tallMeActors() {
		int num=0;
		try {
			num = actorDao.countActors();
			
		} catch (Exception e) {
			e.printStackTrace();
		}

		String result = "不知道";
		
		logger.debug("==========tallMeActors============num = {}",num+"");
		
		if(num>10){
			result = "很多人吃便當";
		}else{
			result = "不多人吃便當";
		}
		return result;
	}

}
