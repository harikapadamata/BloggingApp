package com.cg.blogging.entities;

import java.time.LocalDate;
import java.util.List;

import javax.persistence.CollectionTable;
import javax.persistence.Column;
import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.JoinColumn;

@Entity
@Table(name="Community")
public class Community {
	
	@Id
	@Column(name="community_id")
	private int communityId;
	
	@Column(name="community_description")
	private String communityDescription;
	
	@Column(name="total_members")
	private int totalMembers;
	
	@Column(name="online_members")
	private int onlineMembers;
	
	@Column(name="created_on")
	private LocalDate createdOn;
	
	@ElementCollection
	@CollectionTable(name="Post_Rules_Allowed",joinColumns=@JoinColumn(name="community_id"))
	@Column(name="post_rules_allowed")
	private List<String> postRulesAllowed;
	
	@ElementCollection
	@CollectionTable(name="Post_Rules_Disallowed",joinColumns=@JoinColumn(name="community_id"))
	@Column(name="post_rules_disallowed")
	private List<String> postRulesDisallowed;
	
	@ElementCollection
	@CollectionTable(name="Banning_Policy",joinColumns=@JoinColumn(name="community_id"))
	@Column(name="banning_policy")
	private List<String> banningPolicy;
	
	
	@ElementCollection
	@CollectionTable(name="Flairs",joinColumns=@JoinColumn(name="community_id"))
	@Column(name="flairs")
	private List<String> flairs;
	
//	Constructors
	
	public Community(int communityId, String communityDescription, int totalMembers, int onlineMembers,
			LocalDate createdOn, List<String> postRulesAllowed, List<String> postRulesDisallowed,
			List<String> banningPolicy, List<String> flairs) {
		
		super();
		this.communityId = communityId;
		this.communityDescription = communityDescription;
		this.totalMembers = totalMembers;
		this.onlineMembers = onlineMembers;
		this.createdOn = createdOn;
		this.postRulesAllowed = postRulesAllowed;
		this.postRulesDisallowed = postRulesDisallowed;
		this.banningPolicy = banningPolicy;
		this.flairs = flairs;
	}


//	Getters and Setters methods
	
	public int getCommunityId() {
		return communityId;
	}


	public void setCommunityId(int communityId) {
		this.communityId = communityId;
	}


	public String getCommunityDescription() {
		return communityDescription;
	}


	public void setCommunityDescription(String communityDescription) {
		this.communityDescription = communityDescription;
	}


	public int getTotalMembers() {
		return totalMembers;
	}


	public void setTotalMembers(int totalMembers) {
		this.totalMembers = totalMembers;
	}


	public int getOnlineMembers() {
		return onlineMembers;
	}


	public void setOnlineMembers(int onlineMembers) {
		this.onlineMembers = onlineMembers;
	}


	public LocalDate getCreatedOn() {
		return createdOn;
	}


	public void setCreatedOn(LocalDate createdOn) {
		this.createdOn = createdOn;
	}


	public List<String> getPostRulesAllowed() {
		return postRulesAllowed;
	}


	public void setPostRulesAllowed(List<String> postRulesAllowed) {
		this.postRulesAllowed = postRulesAllowed;
	}


	public List<String> getPostRulesDisallowed() {
		return postRulesDisallowed;
	}


	public void setPostRulesDisallowed(List<String> postRulesDisallowed) {
		this.postRulesDisallowed = postRulesDisallowed;
	}


	public List<String> getBanningPolicy() {
		return banningPolicy;
	}


	public void setBanningPolicy(List<String> banningPolicy) {
		this.banningPolicy = banningPolicy;
	}


	public List<String> getFlairs() {
		return flairs;
	}


	public void setFlairs(List<String> flairs) {
		this.flairs = flairs;
	}

	

// to String method
	@Override
	public String toString() {
		return "Community [communityId=" + communityId + ", communityDescription=" + communityDescription
				+ ", totalMembers=" + totalMembers + ", onlineMembers=" + onlineMembers + ", createdOn=" + createdOn
				+ ", postRulesAllowed=" + postRulesAllowed + ", postRulesDisallowed=" + postRulesDisallowed
				+ ", banningPolicy=" + banningPolicy + ", flairs=" + flairs + "]";
	}

//	HashCode method
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + communityId;
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
		Community other = (Community) obj;
		if (communityId != other.communityId)
			return false;
		return true;
	}
	
	
	
	
	
	

}
