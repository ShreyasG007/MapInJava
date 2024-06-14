package com.tka.map.sortedMap;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ComplexHashMap {

	public static void main(String[] args) {

		Map<String, Map<String, Map<String, Map<String, List<String>>>>> countryMap = new HashMap<>();

		Map<String, Map<String, Map<String, List<String>>>> indiaMap = new HashMap<>();

		Map<String, Map<String, List<String>>> mahaMap = new HashMap<>();

		Map<String, List<String>> dist1Map = new HashMap<>();

		dist1Map.put("Mulshi", Arrays.asList("Andgaon", "Bhugaon", "Lavasa"));
		dist1Map.put("Haveli", Arrays.asList("Ambegaon", "Donje", "Khadakwasla"));

		mahaMap.put("Pune", dist1Map);

		Map<String, List<String>> dist2Map = new HashMap<>();

		dist2Map.put("Saoner", Arrays.asList("Chincholi", "Ajani"));
		dist2Map.put("Narkhed", Arrays.asList("Ambada", "Aarambhi"));

		mahaMap.put("Nagpur", dist2Map);

		indiaMap.put("Maharashtra", mahaMap);

		Map<String, Map<String, List<String>>> upMap = new HashMap<>();

		Map<String, List<String>> dist3Map = new HashMap<>();

		dist3Map.put("Bikapur", Arrays.asList("Balapur", "Bankat"));
		dist3Map.put("Sadar", Arrays.asList("Ayodhya city", "Deokali"));

		upMap.put("Ayodhya", dist3Map);

		Map<String, List<String>> dist4Map = new HashMap<>();

		dist4Map.put("Pindra", Arrays.asList("Kashi Vidyapeeth", "Sewapuri"));
		dist4Map.put("Rajatlab", Arrays.asList("Chiraigaon", "Cholapur"));

		upMap.put("Varanasi", dist4Map);

		indiaMap.put("Uttar Pradesh", upMap);

		countryMap.put("India", indiaMap);

		printCountryData(countryMap);

	}

	 private static void printCountryData(Map<String, Map<String, Map<String, Map<String, List<String>>>>> countryMap) {
	        for (String country : countryMap.keySet()) {
	            System.out.println("Country: " + country);
	            Map<String, Map<String, Map<String, List<String>>>> stateMap = countryMap.get(country);
	            for (String state : stateMap.keySet()) {
	                System.out.println("\tState: " + state);
	                Map<String, Map<String, List<String>>> districtMap = stateMap.get(state);
	                for (String district : districtMap.keySet()) {
	                    System.out.println("\t\tDistrict: " + district);
	                    Map<String, List<String>> talukaMap = districtMap.get(district);
	                    for (String taluka : talukaMap.keySet()) {
	                        System.out.println("\t\t\tTaluka: " + taluka);
	                        List<String> villages = talukaMap.get(taluka);
	                        for (String village : villages) {
	                            System.out.println("\t\t\t\tVillage: " + village);
	                        }
	                    }
	                }
	            }
	        }
	    }
}
