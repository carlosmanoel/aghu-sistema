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
import javax.validation.constraints.NotNull;

import org.hibernate.validator.constraints.Length;

import br.gov.mec.aghu.dominio.DominioSituacao;
import br.gov.mec.aghu.core.persistence.BaseEntitySeq;

/**
 * McoIntercorrencia generated by hbm2java
 */
@Entity
@SequenceGenerator(name="mcoIcrSq1", sequenceName="AGH.MCO_ICR_SQ1", allocationSize = 1)
@Table(name = "MCO_INTERCORRENCIAS", schema = "AGH")
public class McoIntercorrencia extends BaseEntitySeq<Short> implements java.io.Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -1160182661583553795L;
	private Short seq;
	private Integer version;
	private AghCid aghCid;
	private RapServidores rapServidores;
	private String descricao;
	private DominioSituacao indSituacao;
	private String tipo;
	private Date criadoEm;
	private Set<McoPuerperioIntercorrencia> mcoPuerperioIntercorrenciaes = new HashSet<McoPuerperioIntercorrencia>(0);
	
	// FIXME Implementar este relacionamento
//	private Set<McoIntercorrenciaNascs> mcoIntercorrenciaNascses = new HashSet<McoIntercorrenciaNascs>(0);

	public McoIntercorrencia() {
	}

	public McoIntercorrencia(Short seq, RapServidores rapServidores, String descricao, DominioSituacao indSituacao, String tipo, Date criadoEm) {
		this.seq = seq;
		this.rapServidores = rapServidores;
		this.descricao = descricao;
		this.indSituacao = indSituacao;
		this.tipo = tipo;
		this.criadoEm = criadoEm;
	}

	public McoIntercorrencia(Short seq, AghCid aghCid, RapServidores rapServidores, String descricao, DominioSituacao indSituacao,
			String tipo, Date criadoEm, 
			Set<McoPuerperioIntercorrencia> mcoPuerperioIntercorrenciaes) {
		this.seq = seq;
		this.aghCid = aghCid;
		this.rapServidores = rapServidores;
		this.descricao = descricao;
		this.indSituacao = indSituacao;
		this.tipo = tipo;
		this.criadoEm = criadoEm;
		this.mcoPuerperioIntercorrenciaes = mcoPuerperioIntercorrenciaes;
	}

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO, generator = "mcoIcrSq1")
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
	@JoinColumn(name = "CID_SEQ")
	public AghCid getAghCid() {
		return this.aghCid;
	}

	public void setAghCid(AghCid aghCid) {
		this.aghCid = aghCid;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumns({ @JoinColumn(name = "SER_MATRICULA", referencedColumnName = "MATRICULA", nullable = false),
			@JoinColumn(name = "SER_VIN_CODIGO", referencedColumnName = "VIN_CODIGO", nullable = false) })
	public RapServidores getRapServidores() {
		return this.rapServidores;
	}

	public void setRapServidores(RapServidores rapServidores) {
		this.rapServidores = rapServidores;
	}

	@Column(name = "DESCRICAO", nullable = false, length = 120)
	@NotNull
	@Length(max = 120)
	public String getDescricao() {
		return this.descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	@Enumerated(EnumType.STRING)
	@Column(name = "IND_SITUACAO", nullable = false, length = 1)
	@NotNull
	public DominioSituacao getIndSituacao() {
		return this.indSituacao;
	}

	public void setIndSituacao(DominioSituacao indSituacao) {
		this.indSituacao = indSituacao;
	}

	@Column(name = "TIPO", nullable = false, length = 1)
	@NotNull
	@Length(max = 1)
	public String getTipo() {
		return this.tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "CRIADO_EM", nullable = false, length = 29)
	@NotNull
	public Date getCriadoEm() {
		return this.criadoEm;
	}

	public void setCriadoEm(Date criadoEm) {
		this.criadoEm = criadoEm;
	}

//	@OneToMany(fetch = FetchType.LAZY, mappedBy = "mcoIntercorrencia")
//	public Set<McoIntercorrenciaNascs> getMcoIntercorrenciaNascses() {
//		return this.mcoIntercorrenciaNascses;
//	}
//
//	public void setMcoIntercorrenciaNascses(Set<McoIntercorrenciaNascs> mcoIntercorrenciaNascses) {
//		this.mcoIntercorrenciaNascses = mcoIntercorrenciaNascses;
//	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "mcoIntercorrencia")
	public Set<McoPuerperioIntercorrencia> getMcoPuerperioIntercorrenciaes() {
		return this.mcoPuerperioIntercorrenciaes;
	}


	public void setMcoPuerperioIntercorrenciaes(Set<McoPuerperioIntercorrencia> mcoPuerperioIntercorrenciaes) {
		this.mcoPuerperioIntercorrenciaes = mcoPuerperioIntercorrenciaes;
	}

	public enum Fields {

		SEQ("seq"),
		VERSION("version"),
		AGH_CID("aghCid"),
		RAP_SERVIDORES("rapServidores"),
		DESCRICAO("descricao"),
		IND_SITUACAO("indSituacao"),
		TIPO("tipo"),
		CRIADO_EM("criadoEm"),
//		MCO_INTERCORRENCIA_NASCSES("mcoIntercorrenciaNascses"),
		MCO_PUERPERIO_INTERCORRENCIAES("mcoPuerperioIntercorrenciaes");

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
		result = prime * result + ((getSeq() == null) ? 0 : getSeq().hashCode());
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
		if (!(obj instanceof McoIntercorrencia)) {
			return false;
		}
		McoIntercorrencia other = (McoIntercorrencia) obj;
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
