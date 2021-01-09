package Oops;

public class Teacher extends Person {
	
	private int numCourses;
	private String[] courses;
	
	public Teacher(String name, String address) {
		super(name,address);
		
	}
	@Override
	   public String toString() {
	      return "Teacher: " + super.toString();
	   }
	public boolean addCourse(String course) {
		for(int i=0;i<numCourses;i++) {
			if(courses[i].equals(course))
				return false;
		}
		courses[numCourses]=course;
		numCourses++;
		return true;
	}
	public boolean removeCourse(String course) {
		boolean found=false;
		int cindex=-1;
		for(int i=0;i<numCourses;i++) {
			if(courses[i].equals(course)) {
				cindex=i;
				found=true;
				break;
			}
		}
		if(found) {
			for(int i=cindex;i<numCourses-1;i++) {
				courses[i]=courses[i+1];
			}
			numCourses--;
			return true;
		}
		else {
			return false;
		}
		
	}

}
