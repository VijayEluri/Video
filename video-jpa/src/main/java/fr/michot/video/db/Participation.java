package fr.michot.video.db;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

import fr.michot.video.constantes.Role;

@Entity
@Table(name = "PARTICIPATION")
public class Participation implements Serializable {

	private static final long serialVersionUID = -6974214058976597266L;

	@ManyToOne
	private Film film;

	@Id
    @GeneratedValue(generator = "participation_seq")
    @SequenceGenerator(sequenceName="participation_sequence", name="participation_seq")
	private int id;

	@ManyToOne
	private Personne personne;

	@Column(name = "PRECISION", length = 200)
	private String precision;

	@Enumerated(EnumType.STRING)
	private Role role;

	public Film getFilm() {
		return film;
	}

	public int getId() {
		return id;
	}

	public Personne getPersonne() {
		return personne;
	}

	public String getPrecision() {
		return precision;
	}

	public Role getRole() {
		return role;
	}

	public void setFilm(Film film) {
		this.film = film;
	}

	public void setId(int id) {
		this.id = id;
	}

	public void setPersonne(Personne personne) {
		this.personne = personne;
	}

	public void setPrecision(String precision) {
		this.precision = precision;
	}

	public void setRole(Role role) {
		this.role = role;
	}

}
