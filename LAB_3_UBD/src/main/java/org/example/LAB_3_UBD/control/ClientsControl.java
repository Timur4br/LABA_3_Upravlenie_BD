package org.example.LAB_3_UBD.control;

import org.example.LAB_3_UBD.entity.Clients;
import org.example.LAB_3_UBD.rep.ClientsRep;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
public class ClientsControl {

    @Autowired
    private ClientsRep clientsRep;

    @GetMapping(path="/getClients")
    public @ResponseBody Iterable<Clients> getAllClients() {
        return clientsRep.findAll();
    }
}
