package jdbc_pack2;

public class Student //DTO(Data Transfer Object (or) bean class
{

		private String name;
		private int roll;
		private String section;
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public int getRoll() {
			return roll;
		}
		public void setRoll(int roll) {
			this.roll = roll;
		}
		public String getSection() {
			return section;
		}
		public void setSection(String section) {
			this.section = section;
		}
		

}
