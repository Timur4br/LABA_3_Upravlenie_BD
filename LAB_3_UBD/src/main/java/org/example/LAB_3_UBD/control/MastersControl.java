package org.example.LAB_3_UBD.control;

import org.example.LAB_3_UBD.entity.Masters;
import org.example.LAB_3_UBD.rep.MastersRep;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
public class MastersControl {

    @Autowired
    private MastersRep mastersRep;

    @GetMapping(path="/getMasters")
    public @ResponseBody Iterable<Masters> getAllMasters() {
        return mastersRep.findAll();
    }
}
