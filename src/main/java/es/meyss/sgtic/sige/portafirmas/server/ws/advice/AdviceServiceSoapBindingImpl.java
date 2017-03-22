/**
 * AdviceServiceSoapBindingImpl.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package es.meyss.sgtic.sige.portafirmas.server.ws.advice;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.web.context.ContextLoaderListener;

import es.meyss.sgtic.sige.portafirmas.type.Authentication;
import es.meyss.sgtic.sige.portafirmas.type.ExceptionInfo;
import es.meyss.sgtic.sige.portafirmas.type.Request;
import es.meyss.sgtic.sige.portafirmas.type.Signature;

public class AdviceServiceSoapBindingImpl implements es.meyss.sgtic.sige.portafirmas.server.ws.advice.AdviceService_PortType{
	
	private PortafirmasAdviceService portafirmasAdviceService;
	
    public java.lang.Boolean updateRequestStatus(Authentication authentication, Request request, Signature[] signature) throws java.rmi.RemoteException, ExceptionInfo {
    	ApplicationContext ctx = ContextLoaderListener.getCurrentWebApplicationContext();
    	BeanFactory beanFactory = ctx;
    	portafirmasAdviceService = (PortafirmasAdviceService) beanFactory.getBean("portafirmasAdviceService");
    	return portafirmasAdviceService.manageAdvice(request, signature);
    }
}
