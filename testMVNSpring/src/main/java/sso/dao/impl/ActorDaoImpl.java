package sso.dao.impl;

import org.apache.commons.collections.CollectionUtils;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.hibernate.Criteria;
import org.hibernate.SessionFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import sso.dao.ActorDao;
import sso.dao.entity.Actor;

@Component("actorDao")
public class ActorDaoImpl implements ActorDao  {
	
	private Logger logger = LoggerFactory.getLogger(getClass());
	
	@Autowired
	@Qualifier("sessionFactory")
	private SessionFactory sessionFactory;
	
	public int countActors() throws Exception {
		logger.debug("==============================sessionFactory{}",ToStringBuilder.reflectionToString(sessionFactory));
		logger.debug("==============================sessionFactory{}",sessionFactory);
		Criteria criteria = sessionFactory.openSession().createCriteria(Actor.class);
		
		if(criteria!=null && CollectionUtils.isNotEmpty(criteria.list())){
			return criteria.list().size();
		}else{
			return 0;
		}
		
	}

}
