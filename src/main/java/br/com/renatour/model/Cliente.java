package br.com.renatour.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "cliente")
public class Cliente {

	@Id
	@Column(name = "id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@Column(nullable = false)
	private String nome;

	@Column(nullable = false)
	private String email;

	@Column
	private String telefone;

	@Column
	private String cidade;

	@Column
	private String estado;

	@Column
	private String pais;

	@Column
	private String cep;

	@Column
	private String num_cc;

	@Column
	private int num_cvv;

	@Column
	private String nom_cc;

	@Column
	private String val_cc;

	@Column
	private String data_ida;

	@Column
	private String data_ret;

	@Column
	private String destino;

	public Cliente() {
	}

	public Cliente(Long id, String nome, String email, String telefone, String cidade, String estado, String pais,
			String cep, String num_cc, int num_cvv, String nom_cc, String val_cc, String data_ida, String data_ret,
			String destino) {
		this.id = id;
		this.nome = nome;
		this.email = email;
		this.telefone = telefone;
		this.cidade = cidade;
		this.estado = estado;
		this.pais = pais;
		this.cep = cep;
		this.num_cc = num_cc;
		this.num_cvv = num_cvv;
		this.nom_cc = nom_cc;
		this.val_cc = val_cc;
		this.data_ida = data_ida;
		this.data_ret = data_ret;
		this.destino = destino;

	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	public String getCidade() {
		return cidade;
	}

	public void setCidade(String cidade) {
		this.cidade = cidade;
	}

	public String getEstado() {
		return estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}

	public String getPais() {
		return pais;
	}

	public void setPais(String pais) {
		this.pais = pais;
	}

	public String getCep() {
		return cep;
	}

	public void setCep(String cep) {
		this.cep = cep;
	}

	public String getNum_cc() {
		return num_cc;
	}

	public void setNum_cc(String num_cc) {
		this.num_cc = num_cc;
	}

	public int getNum_cvv() {
		return num_cvv;
	}

	public void setNum_cvv(int num_cvv) {
		this.num_cvv = num_cvv;
	}

	public String getNom_cc() {
		return nom_cc;
	}

	public void setNom_cc(String nom_cc) {
		this.nom_cc = nom_cc;
	}

	public String getVal_cc() {
		return val_cc;
	}

	public void setVal_cc(String val_cc) {
		this.val_cc = val_cc;
	}

	public String getData_ida() {
		return data_ida;
	}

	public void setData_ida(String data_ida) {
		this.data_ida = data_ida;
	}

	public String getData_ret() {
		return data_ret;
	}

	public void setData_ret(String data_ret) {
		this.data_ret = data_ret;
	}

	public String getDestino() {
		return destino;
	}

	public void setDestino(String destino) {
		this.destino = destino;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Cliente other = (Cliente) obj;
		if (nome == null) {
			if (other.nome != null)
				return false;
		} else if (!nome.equals(other.nome))
			return false;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		if (email == null) {
			if (other.email != null)
				return false;
		} else if (!email.equals(other.email))
			return false;

		return true;
	}

	@Override
	public String toString() {
		return "Cliente [id=" + id + ", nome=" + nome + ", email=" + email + ", telefone=" + telefone + ", cidade="
				+ cidade + ", estado=" + estado + ", pais=" + pais + ", cep=" + cep + ", num_cc=" + num_cc
				+ ", num_cvv=" + num_cvv + ", nom_cc=" + nom_cc + ", val_cc=" + val_cc + ", data_ida=" + data_ida
				+ ", data_ret=" + data_ret + ", total=" + destino + "]";
	}

}
