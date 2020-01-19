import java.rmi.*;
import java.rmi.server.*;

public class SearchQuery extends UnicastRemoteObject implements Search
{
		SearchQuery() throws RemoteException
		{
			super();
		}
		
		public String query(String search) throws RemoteException
		{
				String[] nums = search.split("\\+",2);
				int ans = 0;
				for(String a: nums)
					ans = ans + Integer.parseInt(a);
				String result = Integer.toString(ans);
				return result;
		}
	
	
	
}