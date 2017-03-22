/**
 * AdviceServiceSoapBindingSkeleton.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package es.meyss.sgtic.sige.portafirmas.server.ws.advice;

public class AdviceServiceSoapBindingSkeleton implements es.meyss.sgtic.sige.portafirmas.server.ws.advice.AdviceService_PortType, org.apache.axis.wsdl.Skeleton {
    private es.meyss.sgtic.sige.portafirmas.server.ws.advice.AdviceService_PortType impl;
    private static java.util.Map _myOperations = new java.util.Hashtable();
    private static java.util.Collection _myOperationsList = new java.util.ArrayList();

    /**
    * Returns List of OperationDesc objects with this name
    */
    public static java.util.List getOperationDescByName(java.lang.String methodName) {
        return (java.util.List)_myOperations.get(methodName);
    }

    /**
    * Returns Collection of OperationDescs
    */
    public static java.util.Collection getOperationDescs() {
        return _myOperationsList;
    }

    static {
        org.apache.axis.description.OperationDesc _oper;
        org.apache.axis.description.FaultDesc _fault;
        org.apache.axis.description.ParameterDesc [] _params;
        _params = new org.apache.axis.description.ParameterDesc [] {
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "authentication"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:juntadeandalucia:cice:pfirma:type:v2.0", "authentication"), es.meyss.sgtic.sige.portafirmas.type.Authentication.class, false, false), 
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "request"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:juntadeandalucia:cice:pfirma:type:v2.0", "request"), es.meyss.sgtic.sige.portafirmas.type.Request.class, false, false), 
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "signature"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:juntadeandalucia:cice:pfirma:type:v2.0", "signature"), es.meyss.sgtic.sige.portafirmas.type.Signature[].class, false, false), 
        };
        _oper = new org.apache.axis.description.OperationDesc("updateRequestStatus", _params, new javax.xml.namespace.QName("", "result"));
        _oper.setReturnType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        _oper.setElementQName(new javax.xml.namespace.QName("urn:juntadeandalucia:cice:pfirma:advice:request:v2.0", "updateRequestStatus"));
        _oper.setSoapAction("");
        _myOperationsList.add(_oper);
        if (_myOperations.get("updateRequestStatus") == null) {
            _myOperations.put("updateRequestStatus", new java.util.ArrayList());
        }
        ((java.util.List)_myOperations.get("updateRequestStatus")).add(_oper);
        _fault = new org.apache.axis.description.FaultDesc();
        _fault.setName("pfirmaException");
        _fault.setQName(new javax.xml.namespace.QName("urn:juntadeandalucia:cice:pfirma:type:v2.0", "exceptionInfo"));
        _fault.setClassName("_0.v2.type.pfirma.cice.juntadeandalucia.ExceptionInfo");
        _fault.setXmlType(new javax.xml.namespace.QName("urn:juntadeandalucia:cice:pfirma:type:v2.0", ">exceptionInfo"));
        _oper.addFault(_fault);
    }

    public AdviceServiceSoapBindingSkeleton() {
        this.impl = new es.meyss.sgtic.sige.portafirmas.server.ws.advice.AdviceServiceSoapBindingImpl();
    }

    public AdviceServiceSoapBindingSkeleton(es.meyss.sgtic.sige.portafirmas.server.ws.advice.AdviceService_PortType impl) {
        this.impl = impl;
    }
    public java.lang.Boolean updateRequestStatus(es.meyss.sgtic.sige.portafirmas.type.Authentication authentication, es.meyss.sgtic.sige.portafirmas.type.Request request, es.meyss.sgtic.sige.portafirmas.type.Signature[] signature) throws java.rmi.RemoteException, es.meyss.sgtic.sige.portafirmas.type.ExceptionInfo
    {
        java.lang.Boolean ret = impl.updateRequestStatus(authentication, request, signature);
        return ret;
    }

}
