package com.cg.blogging.entities;

import java.util.ArrayList;
import java.util.List;
 
import javax.persistence.CascadeType;
import javax.persistence.CollectionTable;
import javax.persistence.Column;
import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.Transient;
 
@Entity
@Table(name = "Blogger_Temp")
 
public class Blogger extends User {
	@Column(name = "blogger_name")
    private String bloggerName;
 
    @OneToMany(cascade = CascadeType.ALL)
    @JoinColumn(name = "blogger_id")
    private List<Post> posts = new ArrayList<>();
 
    @OneToMany(cascade = CascadeType.ALL)
    @JoinColumn(name = "blogger_idd")
    private List<Comment> comment = new ArrayList<>();
 
    @ElementCollection
    @CollectionTable(name = "UPVOTES", joinColumns = @JoinColumn(name = "user_id"))
    @Column(name = "UPVOTES")
    private List<Post> upvoted = new ArrayList<>();
 
    @ElementCollection
    @CollectionTable(name = "DOWNVOTES", joinColumns = @JoinColumn(name = "user_id"))
    @Column(name = "DOWNVOTES")
    private List<Post> downvoted = new ArrayList<>();
 
    @OneToMany(cascade = CascadeType.ALL, orphanRemoval = true)
    @JoinColumn(name = "community_id")
    private List<Community> communities = new ArrayList<>();
    
// Constructor

	public Blogger(String bloggerName, List<Post> posts, List<Comment> comment, List<Post> upvoted,
			List<Post> downvoted, List<Community> communities) {
		super();
		this.bloggerName = bloggerName;
		this.posts = posts;
		this.comment = comment;
		this.upvoted = upvoted;
		this.downvoted = downvoted;
		this.communities = communities;
	}

//	To String method
	@Override
	public String toString() {
		return "Blogger [bloggerName=" + bloggerName + ", posts=" + posts + ", comment=" + comment + ", upvoted="
				+ upvoted + ", downvoted=" + downvoted + ", communities=" + communities + "]";
	}

//	HashCode method
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((bloggerName == null) ? 0 : bloggerName.hashCode());
		return result;
	}
	
//	Equals method
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Blogger other = (Blogger) obj;
		if (bloggerName == null) {
			if (other.bloggerName != null)
				return false;
		} else if (!bloggerName.equals(other.bloggerName))
			return false;
		return true;
	}
   

	
    
}
