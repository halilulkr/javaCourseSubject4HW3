package Adapters;

import Abstract.ClientCheckService;
import Entities.Client;
import tr.gov.nvi.tckimlik.WS.KPSPublicSoapProxy;

public class MernisServiceAdapter implements ClientCheckService{

	@Override
	public boolean CheckIfRealPerson(Client client) {
		KPSPublicSoapProxy kpsPublicSoapProxy = new KPSPublicSoapProxy();
		return kpsPublicSoapProxy.TCKimlikNoDogrula(client.getNationalityId(), client.getFirstName(), client.getLastName(), client.getAge());
	}

}
