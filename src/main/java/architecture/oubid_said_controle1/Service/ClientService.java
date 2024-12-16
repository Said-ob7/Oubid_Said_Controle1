package architecture.oubid_said_controle1.Service;

import architecture.oubid_said_controle1.Entity.Client;
import architecture.oubid_said_controle1.Repository.ClientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ClientService {
    @Autowired
    ClientRepository clientRepository;

    public List<Client> GetAllClients(){
        return clientRepository.findAll();
    }


}
