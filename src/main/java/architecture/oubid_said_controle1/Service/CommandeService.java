package architecture.oubid_said_controle1.Service;

import architecture.oubid_said_controle1.Entity.Commande;
import architecture.oubid_said_controle1.Repository.CommandeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CommandeService {

    @Autowired
    CommandeRepository commandeRepository;

    public List<Commande> GetAllCommandes(){
        return commandeRepository.findAll();
    }

    public Commande GetCommandeByid(Long id){
        return commandeRepository.findById(id).orElse(null);
    }

    public Commande CreateCommande(String dateCommande,double montantTotal,Long clientId){
         Commande commande1 = new Commande(dateCommande,montantTotal,clientId);
         commandeRepository.save(commande1);
         return commande1;
    }

    public Commande ModifyCommande(Long id,String dateCommande,double montantTotal,Long clientId){
        Commande commande = commandeRepository.findById(id).orElse(null);
        commande.setDateCommande(dateCommande);
        commande.setMontantTotal(montantTotal);
        commande.setClientId(clientId);
        return commandeRepository.save(commande);
    }

    public void DeleteCommande(Long id){
        commandeRepository.deleteById(id);
    }

}
