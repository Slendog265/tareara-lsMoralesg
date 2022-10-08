package dol;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public class Groups {
	
	private UUID ID;
	private String groupName;
	private List<Student> students;
	
	public Groups() {
		students = new ArrayList<Student>();
	}

	public Groups(UUID iD, String groupName, List<Student> students) {
		super();
		ID = iD;
		this.groupName = groupName;
		this.students = students;
	}

	public UUID getID() {
		return ID;
	}

	public void setID(UUID iD) {
		ID = iD;
	}

	public String getGroupName() {
		return groupName;
	}

	public void setGroupName(String groupName) {
		this.groupName = groupName;
	}

	public List<Student> getStudents() {
		return students;
	}

	public void setStudents(List<Student> students) {
		this.students = students;
	}
	
	
	

	
}
