package Software_a1.Software_a1;

import java.util.LinkedList;
import org.joda.time.DateTime;

public class CourseProgramme {

	private String name;
	private LinkedList <Module> modList;
	DateTime startDate, endDate = new DateTime();
	
	public CourseProgramme(String name, LinkedList <Module> list, DateTime startDate, DateTime endDate) {
		this.name = name;
		this.startDate = startDate;
		this.endDate = endDate;
		this.modList = list;
	}
	
	public LinkedList<Module> getModules() {
		return modList;
	}
	
	public void addModule(Module module) {
		modList.add(module);
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public DateTime getStartDate() {
		return startDate;
	}

	public void setStartDate(DateTime startDate) {
		this.startDate = startDate;
	}

	public DateTime getEndDate() {
		return endDate;
	}

	public void setEndDate(DateTime endDate) {
		this.endDate = endDate;
	}
	
	
}
