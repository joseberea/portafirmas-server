package es.meyss.sgtic.sige.portafirmas.server.ws.advice;

import org.springframework.stereotype.Component;

import es.meyss.sgtic.sige.portafirmas.type.ExceptionInfo;
import es.meyss.sgtic.sige.portafirmas.type.Request;
import es.meyss.sgtic.sige.portafirmas.type.Signature;

@Component("portafirmasAdviceService")
public interface PortafirmasAdviceService {
	public boolean manageAdvice(Request request, Signature[] signature) throws java.rmi.RemoteException, ExceptionInfo ;
}
