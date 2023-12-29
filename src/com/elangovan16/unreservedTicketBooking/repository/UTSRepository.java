package com.elangovan16.unreservedTicketBooking.repository;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class UTSRepository {
	public static UTSRepository repository;
	private Map<String, Integer> destinations = new HashMap<>();

	private UTSRepository() {

	}

	public static UTSRepository getInstance() {
		if (repository == null) {
			repository = new UTSRepository();
		}
		return repository;
	}

	public void loadDestinations() {
		String path = "src/com/elangovan16/unreservedTicketBooking/repository/Destinations.csv";
		try {
			BufferedReader br = new BufferedReader(new FileReader(new File(path)));
			String data = br.readLine();
			while (data != null) {
				String[] res = data.split(",");
				destinations.put(res[0], Integer.parseInt(res[1]));
				data = br.readLine();
			}
		} catch (IOException e) {
		}
	}

	public Map<String, Integer> getDestinations() {
		return destinations;
	}
}
