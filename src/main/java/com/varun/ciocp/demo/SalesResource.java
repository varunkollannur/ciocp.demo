package com.varun.ciocp.demo;

import java.util.Date;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import org.apache.log4j.Logger;

import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.SerializationFeature;
import com.fasterxml.jackson.jaxrs.annotation.JacksonFeatures;
import com.varun.ciocp.repo.model.Sales;

@Path("salesresource")
public class SalesResource {
	
	final static Logger log = Logger.getLogger(SalesResource.class);

	@GET
	@Produces({ MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML })
	@JacksonFeatures(serializationEnable = SerializationFeature.WRAP_ROOT_VALUE,
    deserializationEnable = DeserializationFeature.UNWRAP_ROOT_VALUE)
	public Sales getSalesResource() {
		log.debug("getSalesResource methid is called");
		Sales sales= new Sales();
//		sales.setID(1);
//		sales.setSR_ID("SR_11");
//		sales.setDEPARTMENT("SALES");
//		sales.setIN_DATE(new Date().toString());
//		sales.setOUT_DATE(new Date().toString());
//		sales.setCOUNT(2);
//		sales.setUNIT_PRICE(20.20);
		return sales;
	}
}
