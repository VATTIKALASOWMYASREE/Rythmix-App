package com.Rythmix.Project.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;



	import jakarta.persistence.*;
	import java.util.List;

	@Entity
	public class Users {
		@Id
		@GeneratedValue(strategy = GenerationType.IDENTITY)
		private Long id;

		@Column(name = "user_name", nullable = false)
		private String username;

		@Column(name = "user_email", nullable = false, unique = true)
		private String email;

		@Column(name = "user_password", nullable = false)
		private String password;

		@Column(name = "user_plan", nullable = false)
		private String plan;

		@Column(name = "user_country", nullable = false)
		private String country;

		@Column(name = "user_age", nullable = false)
		private int age;

		@OneToMany(mappedBy = "user", cascade = CascadeType.ALL)
		private List<Playlist> playlists;

		@OneToMany(mappedBy = "user", cascade = CascadeType.ALL)
		private List<ListenHistory> listenHistory;

		// Getters and setters

		public Long getId() {
		    return id;
		}

		public void setId(Long id) {
		    this.id = id;
		}

		public String getUsername() {
		    return username;
		}

		public void setUsername(String username) {
		    this.username = username;
		}

		public String getEmail() {
		    return email;
		}

		public void setEmail(String email) {
		    this.email = email;
		}

		public String getPassword() {
		    return password;
		}

		public void setPassword(String password) {
		    this.password = password;
		}

		public String getPlan() {
		    return plan;
		}

		public void setPlan(String plan) {
		    this.plan = plan;
		}

		public String getCountry() {
		    return country;
		}

		public void setCountry(String country) {
		    this.country = country;
		}

		public int getAge() {
		    return age;
		}

		public void setAge(int age) {
		    this.age = age;
		}

		public List<Playlist> getPlaylists() {
		    return playlists;
		}

		public void setPlaylists(List<Playlist> playlists) {
		    this.playlists = playlists;
		}

		public List<ListenHistory> getListenHistory() {
		    return listenHistory;
		}

		public void setListenHistory(List<ListenHistory> listenHistory) {
		    this.listenHistory = listenHistory;
		}

}


