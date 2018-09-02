package com.varun.ciocp.repo.util;

import org.apache.log4j.Logger;
import org.hibernate.Session;

import com.varun.ciocp.repo.hibernatefactory.HibernateUtilities_5;
import com.varun.ciocp.repo.model.SrSalesTbl;

public class TestUtil {
	
	final static Logger log = Logger.getLogger(TestUtil.class);
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("");
        Session session = HibernateUtilities_5.getSessionFactory().openSession();
        session.beginTransaction();
        
        SrSalesTbl sales = new SrSalesTbl();
        
        sales.setSrId("SR_444");
        sales.setProductName("W345");
        sales.setDepartment("ENGINEERING");
        sales.setUnitPrice(20.33);
        session.save(sales);
        session.getTransaction().commit();
        session.close();       
        HibernateUtilities_5.shutdown();

	}

}
