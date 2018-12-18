package com.example.demo.macdo;

public class Macdo {
	
	private Double codeEtat;
	private Double number;
	private String nom;
	private String adresse;

	public Macdo() {
	}

	public Macdo(Double codeEtat, Double number, String nom, String adresse) {
		super();
		this.codeEtat = codeEtat;
		this.number = number;
		this.nom = nom;
		this.adresse = adresse;
	}

	public Double getCodeEtat() {
		return codeEtat;
	}

	public void setCodeEtat(Double codeEtat) {
		this.codeEtat = codeEtat;
	}

	public Double getNumber() {
		return number;
	}

	public void setNumber(Double number) {
		this.number = number;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getAdresse() {
		return adresse;
	}

	public void setAdresse(String adresse) {
		this.adresse = adresse;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((adresse == null) ? 0 : adresse.hashCode());
		result = prime * result + ((codeEtat == null) ? 0 : codeEtat.hashCode());
		result = prime * result + ((nom == null) ? 0 : nom.hashCode());
		result = prime * result + ((number == null) ? 0 : number.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Macdo other = (Macdo) obj;
		if (adresse == null) {
			if (other.adresse != null)
				return false;
		} else if (!adresse.equals(other.adresse))
			return false;
		if (codeEtat == null) {
			if (other.codeEtat != null)
				return false;
		} else if (!codeEtat.equals(other.codeEtat))
			return false;
		if (nom == null) {
			if (other.nom != null)
				return false;
		} else if (!nom.equals(other.nom))
			return false;
		if (number == null) {
			if (other.number != null)
				return false;
		} else if (!number.equals(other.number))
			return false;
		return true;
	}

}
