package ds;

public class Mainclass 
{
	public static void printTeams(String[] teams)
	{
		for(int i=0;i<teams.length;i++)
		{
			if(teams[i]!=null)
	     	System.out.println(teams[i]);
		}
	}
	
	public static void printTeamName(int index)
	{
		
	}
	public static void main(String[] args) 
	{
		 String[] teams1 = new String[10];
	        teams1[0] = "RCB";
	        teams1[1] = "CSK";
	        teams1[2] = "MI";
	        
        String[] teams2 = new String[10];
        teams2[0] = "RCB";
        teams2[1] = "CSK";
        teams2[2] = "MI";
        teams2[3] = "KKR";
        teams2[4] = "SRH";
        teams2[5] = "DC";
        teams2[6] = "RR";
        teams2[7] = "KXI";
        
        printTeams(teams2);
        printTeams(teams1);
        
        	}
}
