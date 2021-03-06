package br.gov.mec.aghu.model;

// Generated 09/04/2012 16:32:53 by Hibernate Tools 3.4.0.CR1

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinColumns;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.Version;


import org.hibernate.validator.constraints.Length;

import br.gov.mec.aghu.dominio.DominioSituacao;
import br.gov.mec.aghu.core.persistence.BaseEntitySeq;

/**
 * MbcAreaTricotomia generated by hbm2java
 */
@Entity
@SequenceGenerator(name = "mbcAtrSq1", sequenceName = "AGH.MBC_ATR_SQ1", allocationSize = 1)
@Table(name = "MBC_AREA_TRICOTOMIAS", schema = "AGH")
public class MbcAreaTricotomia extends BaseEntitySeq<Short> implements java.io.Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -1025453155389258991L;
	private Short seq;
	private Integer version;
	private RapServidores servidor;
	private String descricao;
	private DominioSituacao situacao;
	private Date criadoEm;
	private Set<MbcAreaTricProcCirg> areaTricProcCirges = new HashSet<MbcAreaTricProcCirg>(
			0);

	public MbcAreaTricotomia() {
	}

	public MbcAreaTricotomia(Short seq, RapServidores servidor,
			String descricao, DominioSituacao situacao, Date criadoEm) {
		this.seq = seq;
		this.servidor = servidor;
		this.descricao = descricao;
		this.situacao = situacao;
		this.criadoEm = criadoEm;
	}

	public MbcAreaTricotomia(Short seq, RapServidores servidor,
			String descricao, DominioSituacao situacao, Date criadoEm,
			Set<MbcAreaTricProcCirg> areaTricProcCirges) {
		this.seq = seq;
		this.servidor = servidor;
		this.descricao = descricao;
		this.situacao = situacao;
		this.criadoEm = criadoEm;
		this.areaTricProcCirges = areaTricProcCirges;
	}

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO, generator = "mbcAtrSq1")
	@Column(name = "SEQ", unique = true, nullable = false)
	public Short getSeq() {
		return this.seq;
	}

	public void setSeq(Short seq) {
		this.seq = seq;
	}

	@Version
	@Column(name = "VERSION", nullable = false)
	public Integer getVersion() {
		return this.version;
	}

	public void setVersion(Integer version) {
		this.version = version;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumns({
			@JoinColumn(name = "SER_MATRICULA", referencedColumnName = "MATRICULA", nullable = false),
			@JoinColumn(name = "SER_VIN_CODIGO", referencedColumnName = "VIN_CODIGO", nullable = false) })
	public RapServidores getServidor() {
		return this.servidor;
	}

	public void setServidor(RapServidores servidor) {
		this.servidor = servidor;
	}

	@Column(name = "DESCRICAO", nullable = false, length = 120)
	@Length(max = 120)
	public String getDescricao() {
		return this.descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	@Column(name = "SITUACAO", nullable = false, length = 1)
	@Enumerated(EnumType.STRING)
	public DominioSituacao getSituacao() {
		return this.situacao;
	}

	public void setSituacao(DominioSituacao situacao) {
		this.situacao = situacao;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "CRIADO_EM", nullable = false, length = 29)
	public Date getCriadoEm() {
		return this.criadoEm;
	}

	public void setCriadoEm(Date criadoEm) {
		this.criadoEm = criadoEm;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "mbcAreaTricotomia")
	public Set<MbcAreaTricProcCirg> getAreaTricProcCirges() {
		return this.areaTricProcCirges;
	}

	public void setAreaTricProcCirges(
			Set<MbcAreaTricProcCirg> areaTricProcCirges) {
		this.areaTricProcCirges = areaTricProcCirges;
	}

	public enum Fields {

		SEQ("seq"), 
		VERSION("version"), 
		SERVIDOR("servidor"), 
		DESCRICAO("descricao"), 
		SITUACAO("situacao"), 
		CRIADO_EM("criadoEm"), 
		AREA_TRIC_PROC_CIRGES("areaTricProcCirges");

		private String fields;

		private Fields(String fields) {
			this.fields = fields;
		}

		@Override
		public String toString() {
			return this.fields;
		}

	}

	// ##### GeradorEqualsHashCodeMain #####
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result
				+ ((getSeq() == null) ? 0 : getSeq().hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (obj == null) {
			return false;
		}
		if (!(obj instanceof MbcAreaTricotomia)) {
			return false;
		}
		MbcAreaTricotomia other = (MbcAreaTricotomia) obj;
		if (getSeq() == null) {
			if (other.getSeq() != null) {
				return false;
			}
		} else if (!getSeq().equals(other.getSeq())) {
			return false;
		}
		return true;
	}
	// ##### GeradorEqualsHashCodeMain #####

}
