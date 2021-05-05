package Abstract;

import Entities.Client;

public abstract class BaseClientManager implements ClientService{
	
	@Override
	public void signUp(Client client) {
		System.out.println("Hesab�n�z olu�turuldu. \n Kullan�c� ad�n�z : " + client.getId() + " �ifrenizle birlikte sisteme giri� yapabilirsiniz.");
		
	}
	
	@Override
	public void update(Client client) {
		System.out.println("Hesab�n�z silindi. \n En yak�n zamanda tekrar g�r��mek dile�iyle <3");
		
	}
	
	@Override
	public void delete(Client client) {
		System.out.println("Hesap bilgileriniz g�ncellendi.");
		
	}
}
