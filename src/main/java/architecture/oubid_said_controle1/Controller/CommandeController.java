package architecture.oubid_said_controle1.Controller;

import architecture.oubid_said_controle1.Entity.Client;
import architecture.oubid_said_controle1.Entity.Commande;
import architecture.oubid_said_controle1.Service.CommandeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.graphql.data.method.annotation.Argument;
import org.springframework.graphql.data.method.annotation.MutationMapping;
import org.springframework.graphql.data.method.annotation.QueryMapping;
import org.springframework.stereotype.Controller;

import java.util.List;

@Controller
public class CommandeController {

    @Autowired
    CommandeService commandeService;


    @QueryMapping
    public List<Commande> GetAllCommandes(){
        return commandeService.GetAllCommandes();
    }

    @QueryMapping
    public Commande GetCommandeById(@Argument Long id){
        return commandeService.GetCommandeByid(id);
    }

    @MutationMapping
    public Commande CreateCommande(@Argument String dateCommande,@Argument double montantTotal,@Argument Long clientId){
        return commandeService.CreateCommande(dateCommande,montantTotal,clientId);
    }

    @MutationMapping
    public Commande ModifyCommande(@Argument Long id,@Argument String dateCommande,@Argument double montantTotal,@Argument Long clientId){
        return commandeService.ModifyCommande(id,dateCommande,montantTotal,clientId);
    }

    @MutationMapping
    public void DeleteCommande(@Argument Long id){
        commandeService.DeleteCommande(id);
    }
}
