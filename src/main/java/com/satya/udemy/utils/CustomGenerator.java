package com.satya.udemy.utils;

import java.io.Serializable;
import java.util.Random;

import org.hibernate.HibernateException;
import org.hibernate.engine.spi.SharedSessionContractImplementor;
import org.hibernate.id.IdentifierGenerator;

/**
 * This class generates custom identifier for any table
 * @author perso
 *
 */
public class CustomGenerator implements IdentifierGenerator {

	@Override
	public Serializable generate(SharedSessionContractImplementor session, Object object) throws HibernateException {
		
		Random randomId = new Random();
		int id = 0;
		id = randomId.nextInt(1000);
		
		return new Long(id);
	}

}
