package com.prashant.CovidTracker19.Controller;

import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import com.prashant.CovidTracker19.Models.CovidWorldWideData;
import com.prashant.CovidTracker19.Models.LocationStats;
import com.prashant.CovidTracker19.Services.CovidDataService;
import com.prashant.CovidTracker19.Services.CovidWorldWideDetailsService;

/**
 * 
 * @author prashant_kumar
 *
 */
@Controller
public class HomePageController {

	@Autowired
	CovidDataService covidDataService;

	@Autowired
	CovidWorldWideDetailsService covidWorldWideDetailsService;

	/**
	 * 
	 * @param model
	 * @return
	 */
	@GetMapping("/covidtracker/countrydatawithstate")
	public String homePage(Model model) {
		/*
		 * Model is used to pass the data between java class and ui Page
		 */
		List<LocationStats> allStat = covidDataService.getAllStats();
		int totalCasesReported = allStat.stream().mapToInt(LocationStats::getLatestTotalCase).sum();
		model.addAttribute("locationStats", allStat);
		model.addAttribute("totalCasesReported", totalCasesReported);

		DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd");
		Date date = new Date();

		model.addAttribute("timestamp", dateFormat.format(date));

		return "worldwidedata2";
	}

	/**
	 * 
	 * @param model
	 * @return
	 * @throws IOException
	 * @throws InterruptedException
	 */
	@GetMapping("/covidtracker/trackerworldwide")
	public String getCovidDetailsWorldWide(Model model) throws IOException, InterruptedException {

		CovidWorldWideData covidWorldWideDataObj = covidWorldWideDetailsService.getAllWorldWideData();
		System.out.println(covidWorldWideDataObj);
		model.addAttribute("covidWorldWideData", covidWorldWideDataObj);

		return "worldwidedata";

	}

}
