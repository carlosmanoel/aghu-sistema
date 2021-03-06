package br.gov.mec.aghu.model;

// Generated 10/05/2011 17:37:54 by Hibernate Tools 3.2.5.Beta

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
 * AelEquipamentos generated by hbm2java
 */
@Entity
@SequenceGenerator(name="aelEquipamentoSq1", sequenceName="AGH.AEL_EQU_SQ1", allocationSize = 1)
@Table(name = "AEL_EQUIPAMENTOS", schema = "AGH")
public class AelEquipamentos extends BaseEntitySeq<Short> implements java.io.Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -6332761874711247929L;
	private Short seq;
	private String descricao;
	private AghUnidadesFuncionais unidadeFuncional;
	private DominioSituacao situacao;
	private Boolean possuiInterface;
	private Date criadoEm;
	private RapServidores servidor;
	private String driverId;
	private Boolean cargaAutomatica;
	private Integer version;
	private Set<AelExecExamesMatAnalise> aelExecExamesMatAnalises = new HashSet<AelExecExamesMatAnalise>(0);

	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO, generator = "aelEquipamentoSq1")
	@Column(name = "SEQ", unique = true, nullable = false, precision = 4, scale = 0)
	public Short getSeq() {
		return this.seq;
	}

	public void setSeq(Short seq) {
		this.seq = seq;
	}

	@Column(name = "DESCRICAO", nullable = false, length = 45)
	@Length(max = 45)
	public String getDescricao() {
		return this.descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name="UNF_SEQ",nullable = false)
	public AghUnidadesFuncionais getUnidadeFuncional() {
		return unidadeFuncional;
	}

	public void setUnidadeFuncional(AghUnidadesFuncionais unidadeFuncional) {
		this.unidadeFuncional = unidadeFuncional;
	}
	
		@Column(name = "IND_SITUACAO", nullable = false, length = 1)
	@Enumerated(EnumType.STRING)
	public DominioSituacao getSituacao() {
		return this.situacao;
	}

	public void setSituacao(DominioSituacao situacao) {
		this.situacao = situacao;
	}

	@Column(name = "IND_POSSUI_INTERFACE", nullable = false, length = 1)
	@org.hibernate.annotations.Type(type = "br.gov.mec.aghu.core.persistence.type.BooleanUserType")
	public Boolean getPossuiInterface() {
		return this.possuiInterface;
	}

	public void setPossuiInterface(Boolean possuiInterface) {
		this.possuiInterface = possuiInterface;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "CRIADO_EM", nullable = false, length = 7)
	public Date getCriadoEm() {
		return this.criadoEm;
	}

	public void setCriadoEm(Date criadoEm) {
		this.criadoEm = criadoEm;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumns( {
			@JoinColumn(name = "SER_MATRICULA", referencedColumnName = "MATRICULA", nullable = false),
			@JoinColumn(name = "SER_VIN_CODIGO", referencedColumnName = "VIN_CODIGO", nullable = false) })
	public RapServidores getServidor() {
		return this.servidor;
	}

	public void setServidor(RapServidores servidor) {
		this.servidor = servidor;
	}

	@Column(name = "DRIVER_ID", length = 5)
	@Length(max = 5)
	public String getDriverId() {
		return this.driverId;
	}

	public void setDriverId(String driverId) {
		this.driverId = driverId;
	}

	@Column(name = "IND_CARGA_AUTOMATICA", nullable = false, length = 1)
	@org.hibernate.annotations.Type(type = "br.gov.mec.aghu.core.persistence.type.BooleanUserType")
	public Boolean getCargaAutomatica() {
		return this.cargaAutomatica;
	}

	public void setCargaAutomatica(Boolean cargaAutomatica) {
		this.cargaAutomatica = cargaAutomatica;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "aelEquipamentos")
	public Set<AelExecExamesMatAnalise> getAelExecExamesMatAnalises() {
		return this.aelExecExamesMatAnalises;
	}

	public void setAelExecExamesMatAnalises(
			Set<AelExecExamesMatAnalise> aelExecExamesMatAnalises) {
		this.aelExecExamesMatAnalises = aelExecExamesMatAnalises;
	}
	
	@Version
	@Column(name = "VERSION", nullable = false)
	public Integer getVersion() {
		return this.version;
	}

	public void setVersion(Integer version) {
		this.version = version;
	}
	
	public enum Fields {
		SITUACAO("situacao"),
		DRIVER_ID("driverId"),
		UNF_SEQ("unidadeFuncional.seq"),
		DESCRICAO("descricao"),
		UNIDADE_FUNCIONAL("unidadeFuncional"),
		SEQ("seq"),
		POSSUI_INTERFACE("possuiInterface"),
		CRIADO_EM("criadoEm"),
		SERVIDOR("servidor"),
		CARGA_AUTOMATICA("cargaAutomatica"),
		EXEC_EXAMES_MAT_ANALISE("aelExecExamesMatAnalises");

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
		if (!(obj instanceof AelEquipamentos)) {
			return false;
		}
		AelEquipamentos other = (AelEquipamentos) obj;
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
