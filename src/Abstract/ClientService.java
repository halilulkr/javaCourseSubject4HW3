package Abstract;

import Entities.Client;

public interface ClientService {

	void signUp(Client client);
	void delete(Client client);
	void update(Client client);
}
