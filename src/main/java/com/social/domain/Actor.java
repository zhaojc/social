package com.social.domain;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import org.apache.commons.lang3.builder.ToStringBuilder;

@Entity
@Table(name = "actor")
public class Actor extends People {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "idactor")
	private String id;
	
	@Column(name = "imdb")
	private String imdb;
	
    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "idcommentparent")
	private CommentParent commentParent;
    
    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "idratingparent")
    private RatingParent ratingParent;
	
	public String getImdb() {
		return imdb;
	}

	public void setImdb(String imdb) {
		this.imdb = imdb;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public CommentParent getCommentParent() {
		return commentParent;
	}

	public void setCommentParent(CommentParent commentParent) {
		this.commentParent = commentParent;
	}

	public RatingParent getRatingParent() {
		return ratingParent;
	}

	public void setRatingParent(RatingParent ratingParent) {
		this.ratingParent = ratingParent;
	}
	
	@Override
	public String toString() {
		return ToStringBuilder.reflectionToString(this);
	}
	
}
