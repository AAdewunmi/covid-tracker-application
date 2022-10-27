package com.application.covidtrackerapplication.controllers;

import com.application.covidtrackerapplication.services.CoronaVirusDataService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller
public class HomeController {

    @Autowired
    CoronaVirusDataService coronaVirusDataService;

}
