/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package services;

import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;

/**
 *
 * @author ub
 */
@WebService(serviceName = "calCircleWebService")
public class calCircleWebService {

    /**
     * Web service operation
     */
    @WebMethod(operationName = "calCircleArea")
    public double calCircleArea(@WebParam(name = "r") double r) {
        //TODO write your implementation code here:
        return Math.PI * r *r ;
    }

    /**
     * Web service operation
     */
    @WebMethod(operationName = "calCircumference")
    public double calCircumference(@WebParam(name = "r") double r) {
        //TODO write your implementation code here:
        return 2 * Math.PI * r;
    }

    
    /**
     * This is a sample web service operation
     */

}
