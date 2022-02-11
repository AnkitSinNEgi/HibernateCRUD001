// For setting prefixes and suffixes in name;
package gradleCRUD;

public class StudentName {
	 	
		private String fanme;
		private String mname;
		private String lname;
		
		//getter setters
		public String getFanme() {
			return fanme;
		}
		public void setFanme(String fanme) {
			this.fanme = fanme;
		}
		public String getMname() {
			return mname;
		}
		public void setMname(String mname) {
			this.mname = mname;
		}
		public String getLname() {
			return lname;
		}
		public void setLname(String lname) {
			this.lname = lname;
		}
		@Override
		public String toString() {
			return "StudentName [fanme=" + fanme + ", mname=" + mname + ", lname=" + lname + "]";
		}
	
	//to string methods 
		
}
