/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package moviezoom;

import java.util.*;
import javax.swing.*;

/**
 *
 * @author Ragul S
 */
public class MovieInfo {

	private String title;
        private String actor;
	private String director;
	private String year;
	private String comment;
	private String source;
	private String format;
	private String genre;
	private String rating;
	private String tape;
        
        public static ArrayList<ArrayList<MovieInfo>> Movies = new ArrayList<>();
        public static HashMap<String,ArrayList<MovieInfo>> hm = new HashMap<>();
        
        public MovieInfo(){
            comment = "";
            for(int i=0;i<5;i++)
                Movies.add(new ArrayList<>());
        }
        
        public static void Add(MovieInfo m){
           // Movies.add(new ArrayList<>());
        Movies.get(Integer.parseInt(m.getTape())-1).add(m);
        
        ArrayList<MovieInfo> mo = hm.get(m.genre);
        
        if(mo == null){
            mo = new ArrayList<MovieInfo>();
            mo.add(m);
            hm.put(m.genre.toLowerCase(), mo);
        }
        else{
            if(!mo.contains(m)) mo.add(m);
        }
        }
        
        public ArrayList<MovieInfo> Edit(String name)
        {
       
            ArrayList<MovieInfo> m = new ArrayList<>();
            for(int i=0;i<Movies.size();i++)
            {
                for(int j=0;j<Movies.get(i).size();j++)
                {
                    
                    //JPanel jp = new JPanel();
                   // JLabel jl = new JLabel("Hii");
                    //jf.add(jl);
                    
                    //jf.setVisible(true);
                    if(name.equals(Movies.get(i).get(j).getTitle()))
                    {
                        m.add(Movies.get(i).get(j));  
                    }
                }
            }
            return m;   
        }
        public void setActor(String a){
            actor = a;
        }
	
	public String getTitle()
	{
		return title;
	}
	
	public String getDirector()
	{
		return director;
	}
        
        public String getActor(){
            return actor;
        }
	
	public String getYear()
	{
		return year;
	}
	
	public String getComment()
	{
		return comment;
	}
	
	public void setTitle(String t)
	{
		title = t;
	}
	
	public void setDirector(String d)
	{
		director = d;
	}
	
	public void setYear(String y)
	{
		year = y;
	}
	
	public void setComment(String c)
	{
		comment+= c+"\n";
	}
	
	public String getSource()
	{
		return source;
	}
	
	public String getFormat()
	{
		return format;
	}
	
	public String getGenre()
	{
		return genre;
	}
	
	public String getRating()
	{
		return rating;
	}
	
	public String getTape()
	{
		return tape;
	}
	
	public void setSource(String s)
	{
		source = s;
	}
	
	public void setFormat(String f)
	{
		format = f;
	}
	
	public void setGenre(String g)
	{
		genre = g;
	}
	
	public void setRating(String r)
	{
		rating = r;
	}
	
	public void setTape(String t)
	{
		tape = t;
	}
	
	@Override
	public String toString()
	{
		return "\nTitle : " + title + "\n\nDirector : " + director + "\n\nActor : " + actor +"\n\nYear : " + year + "\n\nSource : " + source + "\n\nFormat : " + format + "\n\nGenre : " + genre + "\n\nRating : " + rating + "\n\nTape : " + tape + "\n\nComment : " + comment;
	}
}
