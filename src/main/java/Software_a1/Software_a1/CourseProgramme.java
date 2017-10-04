package Software_a1.Software_a1;

import java.util.List;
import org.joda.time.DateTime;

public class CourseProgramme {

	private String name;
	private List <Module> list;
	DateTime startDate, endDate = new DateTime();
	
	public CourseProgramme(String name, DateTime startDate) {
		this.name = name;
		this.startDate = startDate;
		this.endDate = endDate;
	}
	
	public List getModules() {
		return list;
	}
	
	public void addModule(Module module) {
		list.add(module);
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
