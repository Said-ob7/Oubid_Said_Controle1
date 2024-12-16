package architecture.oubid_said_controle1.Controller;

import architecture.oubid_said_controle1.Entity.Client;
import architecture.oubid_said_controle1.Service.ClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.graphql.data.method.annotation.QueryMapping;
import org.springframework.stereotype.Controller;

import java.util.List;

@Controller
public class ClientController {

    @Autowired
    ClientService clientService;

    @QueryMapping
    public List<Client> GetAllClients(){
        return clientService.GetAllClients();
    }
}
