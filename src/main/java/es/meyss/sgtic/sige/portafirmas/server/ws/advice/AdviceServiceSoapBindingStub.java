/**
 * AdviceServiceSoapBindingStub.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package es.meyss.sgtic.sige.portafirmas.server.ws.advice;

public class AdviceServiceSoapBindingStub extends org.apache.axis.client.Stub implements es.meyss.sgtic.sige.portafirmas.server.ws.advice.AdviceService_PortType {
    private java.util.Vector cachedSerClasses = new java.util.Vector();
    private java.util.Vector cachedSerQNames = new java.util.Vector();
    private java.util.Vector cachedSerFactories = new java.util.Vector();
    private java.util.Vector cachedDeserFactories = new java.util.Vector();

    static org.apache.axis.description.OperationDesc [] _operations;

    static {
        _operations = new org.apache.axis.description.OperationDesc[1];
        _initOperationDesc1();
    }

    private static void _initOperationDesc1(){
        org.apache.axis.description.OperationDesc oper;
        org.apache.axis.description.ParameterDesc param;
        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("updateRequestStatus");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "authentication"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:juntadeandalucia:cice:pfirma:type:v2.0", "authentication"), es.meyss.sgtic.sige.portafirmas.type.Authentication.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "request"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:juntadeandalucia:cice:pfirma:type:v2.0", "request"), es.meyss.sgtic.sige.portafirmas.type.Request.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "signature"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:juntadeandalucia:cice:pfirma:type:v2.0", "signature"), es.meyss.sgtic.sige.portafirmas.type.Signature[].class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        oper.setReturnClass(java.lang.Boolean.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "result"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("urn:juntadeandalucia:cice:pfirma:type:v2.0", "exceptionInfo"),
                      "_0.v2.type.pfirma.cice.juntadeandalucia.ExceptionInfo",
                      new javax.xml.namespace.QName("urn:juntadeandalucia:cice:pfirma:type:v2.0", ">exceptionInfo"), 
                      true
                     ));
        _operations[0] = oper;

    }

    public AdviceServiceSoapBindingStub() throws org.apache.axis.AxisFault {
         this(null);
    }

    public AdviceServiceSoapBindingStub(java.net.URL endpointURL, javax.xml.rpc.Service service) throws org.apache.axis.AxisFault {
         this(service);
         super.cachedEndpoint = endpointURL;
    }

    public AdviceServiceSoapBindingStub(javax.xml.rpc.Service service) throws org.apache.axis.AxisFault {
        if (service == null) {
            super.service = new org.apache.axis.client.Service();
        } else {
            super.service = service;
        }
        ((org.apache.axis.client.Service)super.service).setTypeMappingVersion("1.2");
            java.lang.Class cls;
            javax.xml.namespace.QName qName;
            javax.xml.namespace.QName qName2;
            java.lang.Class beansf = org.apache.axis.encoding.ser.BeanSerializerFactory.class;
            java.lang.Class beandf = org.apache.axis.encoding.ser.BeanDeserializerFactory.class;
            java.lang.Class enumsf = org.apache.axis.encoding.ser.EnumSerializerFactory.class;
            java.lang.Class enumdf = org.apache.axis.encoding.ser.EnumDeserializerFactory.class;
            java.lang.Class arraysf = org.apache.axis.encoding.ser.ArraySerializerFactory.class;
            java.lang.Class arraydf = org.apache.axis.encoding.ser.ArrayDeserializerFactory.class;
            java.lang.Class simplesf = org.apache.axis.encoding.ser.SimpleSerializerFactory.class;
            java.lang.Class simpledf = org.apache.axis.encoding.ser.SimpleDeserializerFactory.class;
            java.lang.Class simplelistsf = org.apache.axis.encoding.ser.SimpleListSerializerFactory.class;
            java.lang.Class simplelistdf = org.apache.axis.encoding.ser.SimpleListDeserializerFactory.class;
            qName = new javax.xml.namespace.QName("urn:juntadeandalucia:cice:pfirma:type:v2.0", ">exceptionInfo");
            cachedSerQNames.add(qName);
            cls = es.meyss.sgtic.sige.portafirmas.type.ExceptionInfo.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:juntadeandalucia:cice:pfirma:type:v2.0", "action");
            cachedSerQNames.add(qName);
            cls = es.meyss.sgtic.sige.portafirmas.type.Action.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:juntadeandalucia:cice:pfirma:type:v2.0", "actionList");
            cachedSerQNames.add(qName);
            cls = es.meyss.sgtic.sige.portafirmas.type.Action[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("urn:juntadeandalucia:cice:pfirma:type:v2.0", "action");
            qName2 = new javax.xml.namespace.QName("", "action");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("urn:juntadeandalucia:cice:pfirma:type:v2.0", "authentication");
            cachedSerQNames.add(qName);
            cls = es.meyss.sgtic.sige.portafirmas.type.Authentication.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:juntadeandalucia:cice:pfirma:type:v2.0", "comment");
            cachedSerQNames.add(qName);
            cls = es.meyss.sgtic.sige.portafirmas.type.Comment.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:juntadeandalucia:cice:pfirma:type:v2.0", "commentList");
            cachedSerQNames.add(qName);
            cls = es.meyss.sgtic.sige.portafirmas.type.Comment[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("urn:juntadeandalucia:cice:pfirma:type:v2.0", "comment");
            qName2 = new javax.xml.namespace.QName("", "comment");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("urn:juntadeandalucia:cice:pfirma:type:v2.0", "document");
            cachedSerQNames.add(qName);
            cls = es.meyss.sgtic.sige.portafirmas.type.Document.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:juntadeandalucia:cice:pfirma:type:v2.0", "documentList");
            cachedSerQNames.add(qName);
            cls = es.meyss.sgtic.sige.portafirmas.type.Document[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("urn:juntadeandalucia:cice:pfirma:type:v2.0", "document");
            qName2 = new javax.xml.namespace.QName("", "document");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("urn:juntadeandalucia:cice:pfirma:type:v2.0", "documentType");
            cachedSerQNames.add(qName);
            cls = es.meyss.sgtic.sige.portafirmas.type.DocumentType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:juntadeandalucia:cice:pfirma:type:v2.0", "importanceLevel");
            cachedSerQNames.add(qName);
            cls = es.meyss.sgtic.sige.portafirmas.type.ImportanceLevel.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:juntadeandalucia:cice:pfirma:type:v2.0", "job");
            cachedSerQNames.add(qName);
            cls = es.meyss.sgtic.sige.portafirmas.type.Job.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:juntadeandalucia:cice:pfirma:type:v2.0", "noticeList");
            cachedSerQNames.add(qName);
            cls = es.meyss.sgtic.sige.portafirmas.type.State[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("urn:juntadeandalucia:cice:pfirma:type:v2.0", "state");
            qName2 = new javax.xml.namespace.QName("", "state");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("urn:juntadeandalucia:cice:pfirma:type:v2.0", "parameter");
            cachedSerQNames.add(qName);
            cls = es.meyss.sgtic.sige.portafirmas.type.Parameter.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:juntadeandalucia:cice:pfirma:type:v2.0", "parameterList");
            cachedSerQNames.add(qName);
            cls = es.meyss.sgtic.sige.portafirmas.type.Parameter[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("urn:juntadeandalucia:cice:pfirma:type:v2.0", "parameter");
            qName2 = new javax.xml.namespace.QName("", "parameter");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("urn:juntadeandalucia:cice:pfirma:type:v2.0", "remitterList");
            cachedSerQNames.add(qName);
            cls = es.meyss.sgtic.sige.portafirmas.type.User[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("urn:juntadeandalucia:cice:pfirma:type:v2.0", "user");
            qName2 = new javax.xml.namespace.QName("", "user");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("urn:juntadeandalucia:cice:pfirma:type:v2.0", "request");
            cachedSerQNames.add(qName);
            cls = es.meyss.sgtic.sige.portafirmas.type.Request.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:juntadeandalucia:cice:pfirma:type:v2.0", "requestStatus");
            cachedSerQNames.add(qName);
            cls = es.meyss.sgtic.sige.portafirmas.type.RequestStatus.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("urn:juntadeandalucia:cice:pfirma:type:v2.0", "signature");
            cachedSerQNames.add(qName);
            cls = es.meyss.sgtic.sige.portafirmas.type.Signature.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:juntadeandalucia:cice:pfirma:type:v2.0", "signer");
            cachedSerQNames.add(qName);
            cls = es.meyss.sgtic.sige.portafirmas.type.Signer.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:juntadeandalucia:cice:pfirma:type:v2.0", "signerList");
            cachedSerQNames.add(qName);
            cls = es.meyss.sgtic.sige.portafirmas.type.Signer[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("urn:juntadeandalucia:cice:pfirma:type:v2.0", "signer");
            qName2 = new javax.xml.namespace.QName("", "signer");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("urn:juntadeandalucia:cice:pfirma:type:v2.0", "signFormat");
            cachedSerQNames.add(qName);
            cls = es.meyss.sgtic.sige.portafirmas.type.SignFormat.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("urn:juntadeandalucia:cice:pfirma:type:v2.0", "signLine");
            cachedSerQNames.add(qName);
            cls = es.meyss.sgtic.sige.portafirmas.type.SignLine.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:juntadeandalucia:cice:pfirma:type:v2.0", "signLineList");
            cachedSerQNames.add(qName);
            cls = es.meyss.sgtic.sige.portafirmas.type.SignLine[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("urn:juntadeandalucia:cice:pfirma:type:v2.0", "signLine");
            qName2 = new javax.xml.namespace.QName("", "signLine");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("urn:juntadeandalucia:cice:pfirma:type:v2.0", "signLineType");
            cachedSerQNames.add(qName);
            cls = es.meyss.sgtic.sige.portafirmas.type.SignLineType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("urn:juntadeandalucia:cice:pfirma:type:v2.0", "signType");
            cachedSerQNames.add(qName);
            cls = es.meyss.sgtic.sige.portafirmas.type.SignType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("urn:juntadeandalucia:cice:pfirma:type:v2.0", "state");
            cachedSerQNames.add(qName);
            cls = es.meyss.sgtic.sige.portafirmas.type.State.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:juntadeandalucia:cice:pfirma:type:v2.0", "user");
            cachedSerQNames.add(qName);
            cls = es.meyss.sgtic.sige.portafirmas.type.User.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:juntadeandalucia:cice:pfirma:type:v2.0", "userJob");
            cachedSerQNames.add(qName);
            cls = es.meyss.sgtic.sige.portafirmas.type.UserJob.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

    }

    protected org.apache.axis.client.Call createCall() throws java.rmi.RemoteException {
        try {
            org.apache.axis.client.Call _call = super._createCall();
            if (super.maintainSessionSet) {
                _call.setMaintainSession(super.maintainSession);
            }
            if (super.cachedUsername != null) {
                _call.setUsername(super.cachedUsername);
            }
            if (super.cachedPassword != null) {
                _call.setPassword(super.cachedPassword);
            }
            if (super.cachedEndpoint != null) {
                _call.setTargetEndpointAddress(super.cachedEndpoint);
            }
            if (super.cachedTimeout != null) {
                _call.setTimeout(super.cachedTimeout);
            }
            if (super.cachedPortName != null) {
                _call.setPortName(super.cachedPortName);
            }
            java.util.Enumeration keys = super.cachedProperties.keys();
            while (keys.hasMoreElements()) {
                java.lang.String key = (java.lang.String) keys.nextElement();
                _call.setProperty(key, super.cachedProperties.get(key));
            }
            // All the type mapping information is registered
            // when the first call is made.
            // The type mapping information is actually registered in
            // the TypeMappingRegistry of the service, which
            // is the reason why registration is only needed for the first call.
            synchronized (this) {
                if (firstCall()) {
                    // must set encoding style before registering serializers
                    _call.setEncodingStyle(null);
                    for (int i = 0; i < cachedSerFactories.size(); ++i) {
                        java.lang.Class cls = (java.lang.Class) cachedSerClasses.get(i);
                        javax.xml.namespace.QName qName =
                                (javax.xml.namespace.QName) cachedSerQNames.get(i);
                        java.lang.Object x = cachedSerFactories.get(i);
                        if (x instanceof Class) {
                            java.lang.Class sf = (java.lang.Class)
                                 cachedSerFactories.get(i);
                            java.lang.Class df = (java.lang.Class)
                                 cachedDeserFactories.get(i);
                            _call.registerTypeMapping(cls, qName, sf, df, false);
                        }
                        else if (x instanceof javax.xml.rpc.encoding.SerializerFactory) {
                            org.apache.axis.encoding.SerializerFactory sf = (org.apache.axis.encoding.SerializerFactory)
                                 cachedSerFactories.get(i);
                            org.apache.axis.encoding.DeserializerFactory df = (org.apache.axis.encoding.DeserializerFactory)
                                 cachedDeserFactories.get(i);
                            _call.registerTypeMapping(cls, qName, sf, df, false);
                        }
                    }
                }
            }
            return _call;
        }
        catch (java.lang.Throwable _t) {
            throw new org.apache.axis.AxisFault("Failure trying to get the Call object", _t);
        }
    }

    public java.lang.Boolean updateRequestStatus(es.meyss.sgtic.sige.portafirmas.type.Authentication authentication, es.meyss.sgtic.sige.portafirmas.type.Request request, es.meyss.sgtic.sige.portafirmas.type.Signature[] signature) throws java.rmi.RemoteException, es.meyss.sgtic.sige.portafirmas.type.ExceptionInfo {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[0]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("urn:juntadeandalucia:cice:pfirma:advice:request:v2.0", "updateRequestStatus"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {authentication, request, signature});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (java.lang.Boolean) _resp;
            } catch (java.lang.Exception _exception) {
                return (java.lang.Boolean) org.apache.axis.utils.JavaUtils.convert(_resp, java.lang.Boolean.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof es.meyss.sgtic.sige.portafirmas.type.ExceptionInfo) {
              throw (es.meyss.sgtic.sige.portafirmas.type.ExceptionInfo) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

}
