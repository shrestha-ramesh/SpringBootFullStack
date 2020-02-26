package com.example.demo.client;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ClientService {
	
	@Autowired
	private ClientRepository clientRepository;

	public void saveClient(Client client) {
		clientRepository.save(client);
	}
//	public void updateClient(Client client) {
//		clientRepository.save(client);
//	}
}
