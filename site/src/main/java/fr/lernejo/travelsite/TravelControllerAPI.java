package fr.lernejo.travelsite;


import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
public class TravelControllerAPI{

    public final  ArrayList<TravelUser> login;
    private final ArrayList<Travel> goal;

    public TravelControllerAPI(ArrayList<TravelUser> login, ArrayList<Travel> travels) {
        this.login = login;
        this.goal = travels;
    }

    @PostMapping("/api/inscription")
    public void postInscription(@RequestBody TravelUser inscription) {
        login.add(inscription);
    }

    @GetMapping("/api/inscription")
    public List<TravelUser> getlogin() {
        return login;
    }

    @GetMapping("/api/travels")
    public Iterable<Travel> getTravels(@RequestParam String userName) {
        goal.add(new Travel("Germany", 19.3));
        goal.add(new Travel("China", 25.9));
        goal.add(new Travel("France", 15.1));
        return goal;
    }
}