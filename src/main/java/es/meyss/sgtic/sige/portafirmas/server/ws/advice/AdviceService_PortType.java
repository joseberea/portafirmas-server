/**
 * AdviceService_PortType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package es.meyss.sgtic.sige.portafirmas.server.ws.advice;

public interface AdviceService_PortType extends java.rmi.Remote {
    public java.lang.Boolean updateRequestStatus(es.meyss.sgtic.sige.portafirmas.type.Authentication authentication, es.meyss.sgtic.sige.portafirmas.type.Request request, es.meyss.sgtic.sige.portafirmas.type.Signature[] signature) throws java.rmi.RemoteException, es.meyss.sgtic.sige.portafirmas.type.ExceptionInfo;
}
