package Abstract;

import Entities.Client;

public abstract class BaseClientManager implements ClientService{
	
	@Override
	public void signUp(Client client) {
		System.out.println("Hesabýnýz oluþturuldu. \n Kullanýcý adýnýz : " + client.getId() + " þifrenizle birlikte sisteme giriþ yapabilirsiniz.");
		
	}
	
	@Override
	public void update(Client client) {
		System.out.println("Hesabýnýz silindi. \n En yakýn zamanda tekrar görüþmek dileðiyle <3");
		
	}
	
	@Override
	public void delete(Client client) {
		System.out.println("Hesap bilgileriniz güncellendi.");
		
	}
}
