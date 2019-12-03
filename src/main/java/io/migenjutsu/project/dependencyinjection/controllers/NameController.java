package io.migenjutsu.project.dependencyinjection.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

import io.migenjutsu.project.dependencyinjection.services.NameService;

@Controller
public class NameController {
    private NameService nameService;
    private NameService nameServiceSubaru;
    private NameService nameServiceAcura;
    private NameService nameServiceTesla;


    @Autowired
    public void setNameService(NameService nameService) {
        this.nameService = nameService;
    }

    @Autowired
    @Qualifier("subaru")
    public void setNameServiceSubaru(NameService nameServiceSubaru) {
        this.nameServiceSubaru = nameServiceSubaru;
    }

    @Autowired
    @Qualifier("acura")
    public void setNameServiceAcura(NameService nameServiceAcura) {
        this.nameServiceAcura = nameServiceAcura;
    }

    @Autowired
    @Qualifier("tesla")
    public void setNameServiceTesla(NameService nameServiceTesla) {
        this.nameServiceTesla = nameServiceTesla;
    }

    public String sayName() {
        String name = nameService.getName();

        // System.out.println(name);
        System.out.println(nameServiceSubaru.getName());
        System.out.println(nameServiceAcura.getName());
        System.out.println(nameServiceTesla.getName());

        return name;
    }
}

    // private NameService nameService;
    // private NameService nameServiceSubaru;
    // private NameService nameServiceAcura;
    // private NameService nameServiceTesla;

    // @Autowired
    // public void setNameService(NameService nameService) {
    //     this.nameService = nameService;
    // }

    // @Autowired
    // @Qualifier("subaru")
    // public void setNameServiceSubaru(NameService nameServiceSubaru) {
    //     this.nameServiceSubaru = nameServiceSubaru;
    // }

    // @Autowired
    // @Qualifier("acura")
    // public void setNameServiceAcura(NameService nameServiceAcura) {
    //     this.nameServiceAcura = nameServiceAcura;
    // }

    // @Autowired
    // @Qualifier("tesla")
    // public void setNameServiceTesla(NameService nameServiceTesla) {
    //     this.nameServiceTesla = nameServiceTesla;
    // }

    // public String sayName() {
    //     String name = nameService.getName();

    //     // System.out.println(name);
    //     System.out.println(nameServiceSubaru.getName());
    //     System.out.println(nameServiceAcura.getName());
    //     System.out.println(nameServiceTesla.getName());

    //     return name;
    // }