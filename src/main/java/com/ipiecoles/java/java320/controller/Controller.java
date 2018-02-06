package com.ipiecoles.java.java320.controller;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/page")
public class Controller {

    @RequestMapping(value = "", method = RequestMethod.GET, produces = "text/html")
    public String hello(){
        String response ="<html><head>";
        response += "<title>Bonjour</title>";
        response +="<h1>Bonjours Monde</h1>";
        response +="</body></html>";
        return response;
    }

    @RequestMapping(value = "", method = RequestMethod.GET, produces = "text/html", params = {"nom","prenom"})
    public String helloNom(@RequestParam("nom") String nom, @RequestParam("prenom")String prenom){
        String response ="<html><head>";
        response += "<title>Bonjour</title>";
        response +="<h1>Bonjour "+ nom+ " " + prenom+"</h1>";
        response +="</body></html>";
        return response;
    }

    @RequestMapping(value = "/{nom}",method = RequestMethod.GET,produces = "text/html")
    public String helloNomSlash(@PathVariable(value = "nom") String nom){
        String response ="<html><head>";
        response += "<title>Bonjour</title>";
        response +="<h1>Bonjour Path : "+nom+"</h1>";
        response +="</body></html>";
        return response;
    }


}
