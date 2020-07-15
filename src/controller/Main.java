package controller;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.sql.SQLException;
import java.util.ArrayList;

import dao.PlayerDAO;
import dao.SkillDAO;
import model.Player;
import model.Skill;

public class Main {
	
	public static void main(String[] args) throws NumberFormatException, IOException, ClassNotFoundException, SQLException {
		
		PlayerDAO playerdao = new PlayerDAO();
		SkillDAO skilldao = new SkillDAO();
		
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		
		System.out.println("Enter skill id to get skill details");
		long id= Long.parseLong(br.readLine());
		
		Skill skill=skilldao.getSkillBylD(id);
		
		System.out.println(skill.getSkillName());
		
        ArrayList<Player> list=(ArrayList<Player>) playerdao.getAllPlayers();
		
		System.out.println("player Id"+"\t"+"playername"+"\t"+"\t"+"playercountry"+"\t"+"\t"+"skillname");
		System.out.println();
		
		for(Player p:list)
		{
			System.out.println(p.getPlayerId()+"\t"+"\t"+p.getName()+"\t"+"\t"+p.getCountry()+"\t"+"\t"+p.getSkill().getSkillName());
			
			
		}
		
		
		
	}
}
