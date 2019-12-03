package io.migenjutsu.project.dependencyinjection.services;


public class NameFactory {
    public NameService createNameService(String language) {
        NameService service = null;

        switch(language) {
            case "ac":
                service = new NameServiceAcuraImpl();
                break;
            case "su":
                service = new NameServiceSubaruImpl();
                break;
            case "te":
                service = new NameServiceTeslaImpl();
                break;
            default:
                service = new NameServiceSubaruImpl();
                break;
        }
        return service;
    }    
}

    //     NameService service = null;

    //     switch(language) {
    //         case "ac":
    //             service = new NameServiceAcuraImpl();
    //             break;
    //         case "su":
    //             service = new NameServiceSubaruImpl();
    //             break;
    //         case "te":
    //             service = new NameServiceTeslaImpl();
    //             break;
    //         default:
    //             service = new NameServiceSubaruImpl();
    //             break;
    //     }
    //     return service;
    // }