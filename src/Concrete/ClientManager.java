package Concrete;

import Abstract.BaseClientManager;
import Abstract.ClientCheckService;
import Entities.Client;

public class ClientManager extends BaseClientManager{

	private ClientCheckService clientCheckService;

	public ClientManager(ClientCheckService clientCheckService) {
		super();
		this.clientCheckService = clientCheckService;
	}
	
	
		@Override
		public void signUp(Client client) {
			if(clientCheckService.CheckIfRealPerson(client)) {
				super.signUp(client);
			}else {
				System.out.println("Kayýt için kimlik doðrulamasý gereklidir.");
			}
			
		}
	
}
