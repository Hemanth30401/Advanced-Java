package app1;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class MainService 
{
	public static void main(String[] args) throws ClassNotFoundException, SQLException 
	{
		String name=null;
		String branch=null;
		int ESal=0,Id=0,row=0;
		System.out.println("Welcome to Candidate Applying form");
		Scanner sc = new Scanner(System.in);
		Dto dto = new Dto();
		Service ser = ServiceFactory.getSData();
//		Dao dao = new DaoImpl();
//		Dao dao=DaoFactory.getData();
		String choice="Yes";
		do {
			System.out.println("1.INSERT CANDIDATE DETAILS\n"
					+"2.UPDATE CANDIDATE DETAILS\n"
					+"3.DELETE CANDIDATE DETAILS\n"
					+"4.DISPLAY CANDIDATE DETAILS\n"
					+"5.EXIT");
			System.out.println();
			System.out.println("Select your choice");
			int option=sc.nextInt();
			switch(option)
			{
			case 1:
				System.out.println("Enter name");
				name=sc.next();
				System.out.println("Enter branch");
				branch=sc.next();
				System.out.println("Enter Expected Salary");
				ESal = sc.nextInt();
				System.out.println("Enter Id");
				Id = sc.nextInt();
				dto.setCandname(name);
				dto.setCandbranch(branch);
				dto.setCandESal(ESal);
				dto.setCId(Id);
				
				row=ser.insertC(dto);
				if(row>0)
					System.out.println(name + " " + branch + " " + ESal + " " + Id + " INSERTED CANDIDATE DETAILS SUCCESSFULLY" );
				else
					System.out.println("Try Again");
				break;
			case 2:
				System.out.println("Enter name");
				name=sc.next();
				System.out.println("Enter branch");
				branch=sc.next();
				System.out.println("Enter Expected Salary");
				ESal = sc.nextInt();
				System.out.println("Enter Id");
				Id = sc.nextInt();
				dto.setCandname(name);
				dto.setCandbranch(branch);
				dto.setCandESal(ESal);
				dto.setCId(Id);
				row=ser.updateC(dto);
				if(row>0)
					System.out.println(name + " " + branch + " " + ESal + " " + Id + " UPDATED CANDIDATE DETAILS SUCCESSFULLY" );
				else
					System.out.println("Try Again");
				break;
			case 3:
				System.out.println("Enter Id");
				Id = sc.nextInt();
				dto.setCId(Id);
				row=ser.deleteC(dto);
				if(row>0)
					System.out.println(Id + " DELETED CANDIDATE DETAILS SUCCESSFULLY" );
				else
					System.out.println("ID DOESN'T EXISTS");
				break;
			case 4:
				ResultSet rs = ser.displayC();
				while(rs.next())
				{
					System.out.print(rs.getString(1)+"\t");
					System.out.print(rs.getString(2)+"\t");
					System.out.print(rs.getInt(3)+"\t");
					System.out.print(rs.getInt(4)+"\t");
					System.out.println();
				}
				break;
			case 5:
				break;
			default:
				System.out.println("Please enter a valid option");
			}
			System.out.println("PRESS YES TO CONTINUE");
			choice=sc.next();
		}while(choice.equalsIgnoreCase("yes"));
		System.out.println("Thank you,You have submitted your details.");
	}

}
