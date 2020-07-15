package dao;

import java.io.IOException;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import model.Skill;
import utility.ConnectionManager;

public class SkillDAO {
	
	public Skill getSkillBylD(Long id)  throws ClassNotFoundException, SQLException, IOException  {
		
         ConnectionManager con = new ConnectionManager();
		 
		 Statement stmt=  con.getConnection().createStatement();
			
			ResultSet rs = stmt.executeQuery("select * from skills ");
			Skill skill=new Skill();
			
			while(rs.next())
			{
				long id1=rs.getLong(1);
				
				String name=rs.getString(2);
				
				skill.setSkillId(id1);
				skill.setSkillName(name);
				
			}
		
		return skill;
	}
}
