package br.gov.mec.aghu.model;

// Generated 03/06/2011 16:09:49 by Hibernate Tools 3.4.0.CR1

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

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


import br.gov.mec.aghu.dominio.DominioOrigemAtendimento;
import br.gov.mec.aghu.dominio.DominioSimNao;
import br.gov.mec.aghu.dominio.DominioSituacao;
import br.gov.mec.aghu.core.persistence.BaseEntitySeq;

/**
 * AelLoteExamesUsuais generated by hbm2java
 */
@SuppressWarnings({"PMD.AghuUsoIndevidoDaEnumDominioSimNaoEntity"})
@Entity
@SequenceGenerator(name="aelLeuSq1", sequenceName="AGH.AEL_LEU_SQ1", allocationSize = 1)
@Table(name = "AEL_LOTE_EXAMES_USUAIS", schema = "AGH")
public class AelLoteExameUsual extends BaseEntitySeq<Short> implements java.io.Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 3177516518891946492L;
	private Short seq;
	private Integer version;
	private RapServidores servidor;
	private DominioSituacao indSituacao;
	private Date criadoEm;
	private DominioOrigemAtendimento origem;
	private DominioSimNao indLoteDefault;
	private AelGrupoExameUsual gruSeq;
	private AghUnidadesFuncionais unfSeq;
	private AghEspecialidades espSeq;
	private List<AelLoteExame> aelLoteExameses = new ArrayList<AelLoteExame>(0);

	public AelLoteExameUsual() {
	}

	public AelLoteExameUsual(Short seq, RapServidores servidor, Short serVinCodigo,
			Date criadoEm) {
		this.seq = seq;
		this.servidor = servidor;
		this.criadoEm = criadoEm;
	}

	public AelLoteExameUsual(Short seq, RapServidores servidor,
			DominioSituacao indSituacao, AelGrupoExameUsual gruSeq, AghUnidadesFuncionais unfSeq, Date criadoEm,
			AghEspecialidades espSeq, DominioOrigemAtendimento origem, DominioSimNao indLoteDefault,
			List<AelLoteExame> aelLoteExameses) {
		this.seq = seq;
		this.servidor = servidor;
		this.indSituacao = indSituacao;
		this.gruSeq = gruSeq;
		this.unfSeq = unfSeq;
		this.criadoEm = criadoEm;
		this.espSeq = espSeq;
		this.origem = origem;
		this.indLoteDefault = indLoteDefault;
		this.aelLoteExameses = aelLoteExameses;
	}

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO, generator = "aelLeuSq1")
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
	@JoinColumns( {
		@JoinColumn(name = "SER_MATRICULA", referencedColumnName = "MATRICULA", nullable = false),
		@JoinColumn(name = "SER_VIN_CODIGO", referencedColumnName = "VIN_CODIGO", nullable = false) })
		public RapServidores getServidor() {
		return servidor;
	}

	public void setServidor(RapServidores servidor) {
		this.servidor = servidor;
	}

	@Column(name = "IND_SITUACAO", length = 1)
	@Enumerated(EnumType.STRING)
	public DominioSituacao getIndSituacao() {
		return this.indSituacao;
	}

	public void setIndSituacao(DominioSituacao indSituacao) {
		this.indSituacao = indSituacao;
	}

	@ManyToOne
	@JoinColumn(name = "GRU_SEQ")
	public AelGrupoExameUsual getGruSeq() {
		return this.gruSeq;
	}

	public void setGruSeq(AelGrupoExameUsual gruSeq) {
		this.gruSeq = gruSeq;
	}

	@ManyToOne
	@JoinColumn(name = "UNF_SEQ")
	public AghUnidadesFuncionais getUnfSeq() {
		return this.unfSeq;
	}

	public void setUnfSeq(AghUnidadesFuncionais unfSeq) {
		this.unfSeq = unfSeq;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "CRIADO_EM", nullable = false, length = 29)
	public Date getCriadoEm() {
		return this.criadoEm;
	}

	public void setCriadoEm(Date criadoEm) {
		this.criadoEm = criadoEm;
	}

	@ManyToOne
	@JoinColumn(name = "ESP_SEQ")
	public AghEspecialidades getEspSeq() {
		return this.espSeq;
	}

	public void setEspSeq(AghEspecialidades espSeq) {
		this.espSeq = espSeq;
	}

	@Column(name = "ORIGEM", length = 1)
	@Enumerated(EnumType.STRING)
	public DominioOrigemAtendimento getOrigem() {
		return this.origem;
	}

	public void setOrigem(DominioOrigemAtendimento origem) {
		this.origem = origem;
	}

	@Column(name = "IND_LOTE_DEFAULT", length = 1)
	@Enumerated(EnumType.STRING)
	public DominioSimNao getIndLoteDefault() {
		return this.indLoteDefault;
	}

	public void setIndLoteDefault(DominioSimNao indLoteDefault) {
		this.indLoteDefault = indLoteDefault;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "aelLoteExamesUsuais")
	public List<AelLoteExame> getAelLoteExameses() {
		return this.aelLoteExameses;
	}

	public void setAelLoteExameses(List<AelLoteExame> aelLoteExameses) {
		this.aelLoteExameses = aelLoteExameses;
	}
	
	public enum Fields {
		UNFSEQ("unfSeq"), SITUACAO("indSituacao"), DEFAULT("indLoteDefault"),
		ORIGEM("origem"), ESPSEQ("espSeq"), GRUSEQ("gruSeq"), SERVIDOR("servidor"), SEQ("seq"),
		UNFSEQDESCRICAO("unfSeq.descricao"), GRUDESCRICAO("gruSeq.descricao"), ESPDESCRICAO("espSeq.nomeEspecialidade") ;
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
		if (!(obj instanceof AelLoteExameUsual)) {
			return false;
		}
		AelLoteExameUsual other = (AelLoteExameUsual) obj;
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