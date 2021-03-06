
package com.xubao.test.simpleTest.webService.remote;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.Action;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.9-b130926.1035
 * Generated source version: 2.2
 * 
 */
@WebService(name = "RpcTest", targetNamespace = "http://webService.simpleTest.test.xubao.com/")
@XmlSeeAlso({
    ObjectFactory.class
})
public interface RpcTest {


    /**
     * 
     * @param arg0
     * @return
     *     returns java.lang.String
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "nihao", targetNamespace = "http://webService.simpleTest.test.xubao.com/", className = "com.xubao.test.simpleTest.webService.remote.Nihao")
    @ResponseWrapper(localName = "nihaoResponse", targetNamespace = "http://webService.simpleTest.test.xubao.com/", className = "com.xubao.test.simpleTest.webService.remote.NihaoResponse")
    @Action(input = "http://webService.simpleTest.test.xubao.com/RpcTest/nihaoRequest", output = "http://webService.simpleTest.test.xubao.com/RpcTest/nihaoResponse")
    public String nihao(
		    @WebParam(name = "arg0", targetNamespace = "")
				    String arg0);

    /**
     * 
     * @param arg0
     */
    @WebMethod
    @RequestWrapper(localName = "hello", targetNamespace = "http://webService.simpleTest.test.xubao.com/", className = "com.xubao.test.simpleTest.webService.remote.Hello")
    @ResponseWrapper(localName = "helloResponse", targetNamespace = "http://webService.simpleTest.test.xubao.com/", className = "com.xubao.test.simpleTest.webService.remote.HelloResponse")
    @Action(input = "http://webService.simpleTest.test.xubao.com/RpcTest/helloRequest", output = "http://webService.simpleTest.test.xubao.com/RpcTest/helloResponse")
    public void hello(
		    @WebParam(name = "arg0", targetNamespace = "")
				    String arg0);

    /**
     * 
     * @param arg0
     * @return
     *     returns com.xubao.test.simpleTest.webService.remote.Info
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "getInfo", targetNamespace = "http://webService.simpleTest.test.xubao.com/", className = "com.xubao.test.simpleTest.webService.remote.GetInfo")
    @ResponseWrapper(localName = "getInfoResponse", targetNamespace = "http://webService.simpleTest.test.xubao.com/", className = "com.xubao.test.simpleTest.webService.remote.GetInfoResponse")
    @Action(input = "http://webService.simpleTest.test.xubao.com/RpcTest/getInfoRequest", output = "http://webService.simpleTest.test.xubao.com/RpcTest/getInfoResponse")
    public Info getInfo(
		    @WebParam(name = "arg0", targetNamespace = "")
				    String arg0);

    /**
     * 
     * @param arg0
     */
    @WebMethod
    @RequestWrapper(localName = "setInfo", targetNamespace = "http://webService.simpleTest.test.xubao.com/", className = "com.xubao.test.simpleTest.webService.remote.SetInfo")
    @ResponseWrapper(localName = "setInfoResponse", targetNamespace = "http://webService.simpleTest.test.xubao.com/", className = "com.xubao.test.simpleTest.webService.remote.SetInfoResponse")
    @Action(input = "http://webService.simpleTest.test.xubao.com/RpcTest/setInfoRequest", output = "http://webService.simpleTest.test.xubao.com/RpcTest/setInfoResponse")
    public void setInfo(
		    @WebParam(name = "arg0", targetNamespace = "")
				    Info arg0);

}
