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
        
        ArrayList<ArrayList<MovieInfo>> Movies = new ArrayList<>();
        
        public MovieInfo(){
            for(int i=0;i<5;i++)
                Movies.add(new ArrayList<>());
        }
        
        public void Add(MovieInfo m){
            Movies.get(Integer.parseInt(m.getTape())-1).add(m);
        }
        
        public ArrayList<MovieInfo> Edit(String name)
        {
       
            ArrayList<MovieInfo> m;
            m = new ArrayList<>();
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
		comment = c;
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
		return "\nTitle : " + title + "\nDirector : " + director + "\nYear : " + year + "\nSource : " + source + "\nFormat : " + format + "\nGenre : " + genre + "\nRating : " + rating + "\nTape : " + tape + "\nComment : " + comment;
	}
}
