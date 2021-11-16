/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calcircleclient;

/**
 *
 * @author ub
 */
public class CalCircleClient {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("calCircleArea 5 => " + calCircleArea(5.0));
        System.out.println("calCircumference 5 => " + calCircumference(5.0));
    }

    private static double calCircleArea(double r) {
        services.CalCircleWebService_Service service = new services.CalCircleWebService_Service();
        services.CalCircleWebService port = service.getCalCircleWebServicePort();
        return port.calCircleArea(r);
    }

    private static double calCircumference(double r) {
        services.CalCircleWebService_Service service = new services.CalCircleWebService_Service();
        services.CalCircleWebService port = service.getCalCircleWebServicePort();
        return port.calCircumference(r);
    }
    
    
    
}
