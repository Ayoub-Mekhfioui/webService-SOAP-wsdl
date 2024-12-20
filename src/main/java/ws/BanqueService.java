package ws;

import jakarta.jws.WebMethod;
import jakarta.jws.WebParam;
import jakarta.jws.WebService;

import java.util.Date;
import java.util.List;
@WebService(serviceName = "BanqueWS")
public class BanqueService {
    @WebMethod(operationName = "conversionEuroToDh")
    public double Conversion( @WebParam(name = "montant") double mt){
        return mt*11;
    }
    @WebMethod
    public ws.Compte getCompte(@WebParam(name = "cd") int code){
        return new ws.Compte(code,1000+Math.random()*9000,new Date());
    }
    @WebMethod
    public List<ws.Compte> ListComptes(){
        return List.of(
                new ws.Compte(1,1000+Math.random()*9000,new Date()),
                new ws.Compte(2,1000+Math.random()*9000,new Date()),
                new ws.Compte(3,1000+Math.random()*9000,new Date())
        );
    }
}
