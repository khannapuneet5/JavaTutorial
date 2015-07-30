import java.util.ArrayList;
import java.util.List;

public class WorkshopFactory {
	private static List<Workshop> workshopList = new ArrayList<Workshop>();
	public static void advertise(Workshop wshop){
		workshopList.add(wshop);
	}
	
	public static Workshop getWorkshop(String name) {
		Workshop result = null;
		for (int i=0; i<workshopList.size(); i++){
			if(workshopList.get(i).getName().equals(name)){
				result = workshopList.get(i);
				break;
			}
		}
		return result;
	}

}
