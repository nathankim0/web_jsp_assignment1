package kpu.club.persistence;

import java.util.HashMap;
import java.util.Map;
import kpu.club.domain.StudentVO;

public class MemberDAO {
	private static Map<String,StudentVO> storage=new HashMap<String,StudentVO>();
	
	public boolean join(StudentVO student) {
		try {
			storage.put(student.getID(),student);
		}catch(Exception e) {
			return false;
		}
		return true;
	}
}
