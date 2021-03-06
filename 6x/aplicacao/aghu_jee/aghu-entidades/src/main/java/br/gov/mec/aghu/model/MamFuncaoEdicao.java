package br.gov.mec.aghu.model;

// Generated 09/04/2012 16:32:53 by Hibernate Tools 3.4.0.CR1

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.Version;


import org.hibernate.validator.constraints.Length;

import br.gov.mec.aghu.core.persistence.BaseEntitySeq;

/**
 * MamFuncaoEdicao generated by hbm2java
 */
@Entity
@SequenceGenerator(name="mamFueSq1", sequenceName="AGH.MAM_FUE_SQ1", allocationSize = 1)
@Table(name = "MAM_FUNCAO_EDICOES", schema = "AGH")
public class MamFuncaoEdicao extends BaseEntitySeq<Short> implements java.io.Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -813331862661425534L;
	private Short seq;
	private Integer version;
	private String descricao;
	private String comando;
	private String indSituacao;
	private Date criadoEm;
	private Integer serMatricula;
	private Short serVinCodigo;
	private Set<MamQuestao> mamQuestaoes = new HashSet<MamQuestao>(0);

	public MamFuncaoEdicao() {
	}

	public MamFuncaoEdicao(Short seq, String descricao, String comando, String indSituacao, Date criadoEm, Integer serMatricula,
			Short serVinCodigo) {
		this.seq = seq;
		this.descricao = descricao;
		this.comando = comando;
		this.indSituacao = indSituacao;
		this.criadoEm = criadoEm;
		this.serMatricula = serMatricula;
		this.serVinCodigo = serVinCodigo;
	}

	public MamFuncaoEdicao(Short seq, String descricao, String comando, String indSituacao, Date criadoEm, Integer serMatricula,
			Short serVinCodigo, Set<MamQuestao> mamQuestaoes) {
		this.seq = seq;
		this.descricao = descricao;
		this.comando = comando;
		this.indSituacao = indSituacao;
		this.criadoEm = criadoEm;
		this.serMatricula = serMatricula;
		this.serVinCodigo = serVinCodigo;
		this.mamQuestaoes = mamQuestaoes;
	}

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO, generator = "mamFueSq1")
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

	@Column(name = "DESCRICAO", nullable = false, length = 60)
	@Length(max = 60)
	public String getDescricao() {
		return this.descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	@Column(name = "COMANDO", nullable = false, length = 60)
	@Length(max = 60)
	public String getComando() {
		return this.comando;
	}

	public void setComando(String comando) {
		this.comando = comando;
	}

	@Column(name = "IND_SITUACAO", nullable = false, length = 1)
	@Length(max = 1)
	public String getIndSituacao() {
		return this.indSituacao;
	}

	public void setIndSituacao(String indSituacao) {
		this.indSituacao = indSituacao;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "CRIADO_EM", nullable = false, length = 29)
	public Date getCriadoEm() {
		return this.criadoEm;
	}

	public void setCriadoEm(Date criadoEm) {
		this.criadoEm = criadoEm;
	}

	@Column(name = "SER_MATRICULA", nullable = false)
	public Integer getSerMatricula() {
		return this.serMatricula;
	}

	public void setSerMatricula(Integer serMatricula) {
		this.serMatricula = serMatricula;
	}

	@Column(name = "SER_VIN_CODIGO", nullable = false)
	public Short getSerVinCodigo() {
		return this.serVinCodigo;
	}

	public void setSerVinCodigo(Short serVinCodigo) {
		this.serVinCodigo = serVinCodigo;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "mamFuncaoEdicao")
	public Set<MamQuestao> getMamQuestaoes() {
		return this.mamQuestaoes;
	}

	public void setMamQuestaoes(Set<MamQuestao> mamQuestaoes) {
		this.mamQuestaoes = mamQuestaoes;
	}

	public enum Fields {

		SEQ("seq"),
		VERSION("version"),
		DESCRICAO("descricao"),
		COMANDO("comando"),
		IND_SITUACAO("indSituacao"),
		CRIADO_EM("criadoEm"),
		SER_MATRICULA("serMatricula"),
		SER_VIN_CODIGO("serVinCodigo"),
		MAM_QUESTAOES("mamQuestaoes");

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
		if (!(obj instanceof MamFuncaoEdicao)) {
			return false;
		}
		MamFuncaoEdicao other = (MamFuncaoEdicao) obj;
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
