package com.clientui.controller;

import com.clientui.beans.ProductBean;
import com.clientui.proxies.MicroserviceProduitsProxy;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
public class ClientController {

    final private
     MicroserviceProduitsProxy mProduitsProxy;

    @Autowired
    public ClientController(MicroserviceProduitsProxy mProduitsProxy) {
        this.mProduitsProxy = mProduitsProxy;
    }

    @RequestMapping("/")
    public String accueil(Model model){

        List<ProductBean> produits = mProduitsProxy.listeDesProduits();

        model.addAttribute("produits",produits);
        return "Accueil";

    }
}
