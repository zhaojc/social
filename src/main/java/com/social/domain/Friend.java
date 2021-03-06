package com.social.domain;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import org.apache.commons.lang3.builder.ToStringBuilder;

import com.social.util.FriendStatus;

@Entity
@Table(name = "friend")
public class Friend {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "idfriendship")
	private long id;
	
	@OneToOne(cascade = CascadeType.ALL, fetch=FetchType.LAZY, optional=false)
	@JoinColumn(name="idprofile", insertable=false, updatable=false)
	private Profile profile;
	
	@OneToOne(cascade = CascadeType.ALL, fetch=FetchType.LAZY, optional=false)
	@JoinColumn(name="idprofile", insertable=false, updatable=false)
	private Profile friend;
	
	@Enumerated(EnumType.STRING)
	private FriendStatus status;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public Profile getProfile() {
		return profile;
	}

	public void setProfile(Profile profile) {
		this.profile = profile;
	}

	public Profile getFriend() {
		return friend;
	}

	public void setFriend(Profile friend) {
		this.friend = friend;
	}

	public FriendStatus getStatus() {
		return status;
	}

	public void setStatus(FriendStatus status) {
		this.status = status;
	}
	
	@Override
	public String toString() {
		return ToStringBuilder.reflectionToString(this);
	}
	
}
