package com.application.covidtrackerapplication.services;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class CoronaVirusDataService {
    private static String VIRUS_DATA_URL =
            "https://raw.githubusercontent.com/CSSEGISandData/COVID-19/master/csse_covid_19_data/csse_covid_19_time_series/time_series_covid19_confirmed_global.csv";
    private List<LocationStats> allStats = new ArrayList<>();

    public List<LocationStats> getAllStats(){
        return allStats;
    }


}
