package com.wordpress.pirent420.persist.impl;

import javax.ejb.Local;
import javax.ejb.Singleton;
import javax.ejb.TransactionAttribute;
import javax.ejb.TransactionAttributeType;
import javax.ejb.TransactionManagement;
import javax.ejb.TransactionManagementType;

import com.wordpress.pirent420.model.SpecialAbility;
import com.wordpress.pirent420.persist.api.JpaDao;
import com.wordpress.pirent420.persist.api.SpecialAbitilyDao;

@Singleton
@Local(SpecialAbitilyDao.class)
@TransactionManagement(TransactionManagementType.CONTAINER)
@TransactionAttribute(TransactionAttributeType.REQUIRED)
public class JpaSpecialAbilityDao extends JpaDao<SpecialAbility> implements
		SpecialAbitilyDao
{

	public JpaSpecialAbilityDao()
	{
		super(SpecialAbility.class);
	}

}
