package br.gov.mec.aghu.model;

// Generated 18/03/2011 10:47:15 by Hibernate Tools 3.2.5.Beta

import java.util.Date;
import java.util.Set;

import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.JoinColumns;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.Version;


import br.gov.mec.aghu.dominio.DominioSituacao;
import br.gov.mec.aghu.core.persistence.BaseEntityId;

/**
 * AelExamesNotificacao generated by hbm2java
 */
@Entity
@Table(name = "AEL_EXAMES_NOTIFICACAO", schema = "AGH")
public class AelExamesNotificacao extends BaseEntityId<AelExamesNotificacaoId> implements java.io.Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 6745526574352699989L;
	private AelExamesNotificacaoId id;
	private Integer version;
	private Date criadoEm;
	private DominioSituacao situacao;
	private RapServidores servidor;
	private AelExamesMaterialAnalise exameMaterialAnalise;
	private AelCampoLaudo campoLaudo;
	private Set<AelExameResuNotificacao> examesResuNotificacao;

	public AelExamesNotificacao() {
	}

	public AelExamesNotificacao(AelExamesNotificacaoId id, Date criadoEm,
			DominioSituacao situacao, RapServidores servidor) {
		this.id = id;
		this.criadoEm = criadoEm;
		this.situacao = situacao;
		this.servidor = servidor;
	}

	@EmbeddedId
	@AttributeOverrides( {
			@AttributeOverride(name = "emaExaSigla", column = @Column(name = "EMA_EXA_SIGLA", nullable = false, length = 5)),
			@AttributeOverride(name = "emaManSeq", column = @Column(name = "EMA_MAN_SEQ", nullable = false)),
			@AttributeOverride(name = "calSeq", column = @Column(name = "CAL_SEQ", nullable = false)) })
	public AelExamesNotificacaoId getId() {
		return this.id;
	}

	public void setId(AelExamesNotificacaoId id) {
		this.id = id;
	}

	@Version
	@Column(name = "VERSION", nullable = false)
	public Integer getVersion() {
		return this.version;
	}

	public void setVersion(Integer version) {
		this.version = version;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "CRIADO_EM", nullable = false, length = 29)
	public Date getCriadoEm() {
		return this.criadoEm;
	}

	public void setCriadoEm(Date criadoEm) {
		this.criadoEm = criadoEm;
	}

	@Column(name = "IND_SITUACAO", nullable = false)
	@Enumerated(EnumType.STRING)
	public DominioSituacao getSituacao() {
		return this.situacao;
	}

	public void setSituacao(DominioSituacao situacao) {
		this.situacao = situacao;
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
	
	public enum Fields {

		EMA_EXA_SIGLA("id.emaExaSigla"),
		EMA_MAN_SEQ("id.emaManSeq"),
		CAL_SEQ("id.calSeq"),
		IND_SITUACAO("situacao"),
		EXAME_MATERIAL_ANALISE("exameMaterialAnalise"),
		CAMPO_LAUDO("campoLaudo"),
		EXAME_RESULTADO_NOTIFICACAO("examesResuNotificacao");

		private String fields;

		private Fields(String fields) {
			this.fields = fields;
		}

		@Override
		public String toString() {
			return fields;
		}
	}


	// ##### GeradorEqualsHashCodeMain #####
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
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
		if (!(obj instanceof AelExamesNotificacao)) {
			return false;
		}
		AelExamesNotificacao other = (AelExamesNotificacao) obj;
		if (getId() == null) {
			if (other.getId() != null) {
				return false;
			}
		} else if (!getId().equals(other.getId())) {
			return false;
		}
		return true;
	}
	// ##### GeradorEqualsHashCodeMain #####
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumns( {
			@JoinColumn(name = "EMA_EXA_SIGLA", referencedColumnName = "EXA_SIGLA",  nullable = false, insertable = false, updatable = false),
			@JoinColumn(name = "EMA_MAN_SEQ", referencedColumnName = "MAN_SEQ",  nullable = false, insertable = false, updatable = false) })
	public AelExamesMaterialAnalise getExameMaterialAnalise() {
		return exameMaterialAnalise;
	}
	
	public void setExameMaterialAnalise(
			AelExamesMaterialAnalise exameMaterialAnalise) {
		this.exameMaterialAnalise = exameMaterialAnalise;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name="CAL_SEQ", nullable = false, insertable=false, updatable=false)
	public AelCampoLaudo getCampoLaudo() {
		return campoLaudo;
	}
	
	public void setCampoLaudo(AelCampoLaudo campoLaudo) {
		this.campoLaudo = campoLaudo;
	}


	@OneToMany(fetch=FetchType.LAZY, mappedBy="aelExamesNotificacao")
	public Set<AelExameResuNotificacao> getExamesResuNotificacao() {
		return examesResuNotificacao;
	}

	public void setExamesResuNotificacao(Set<AelExameResuNotificacao> exameResuNotificacao) {
		this.examesResuNotificacao = exameResuNotificacao;
	}
}
