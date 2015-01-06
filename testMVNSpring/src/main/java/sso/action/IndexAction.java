package sso.action;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

import sso.service.SsoService;

import com.opensymphony.xwork2.ActionSupport;

public class IndexAction extends ActionSupport {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private Logger logger = LoggerFactory.getLogger(getClass());
	
	private String actorsMsg;
	
	@Autowired
	@Qualifier("ssoService")
	private SsoService ssoService;
	
	public String index(){
		logger.debug("================================actorsMsg1====================="+actorsMsg);
		actorsMsg = ssoService.tallMeActors();
		logger.debug("================================actorsMsg====================="+actorsMsg);
		
		
		
		return "index";
	}

	public String getActorsMsg() {
		return actorsMsg;
	}

	public void setActorsMsg(String actorsMsg) {
		this.actorsMsg = actorsMsg;
	}

	
	
}
