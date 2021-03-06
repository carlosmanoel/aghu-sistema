package br.gov.mec.aghu.model;

// Generated 10/08/2010 18:17:45 by Hibernate Tools 3.3.0.GA

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
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


import org.hibernate.annotations.Parameter;

import br.gov.mec.aghu.dominio.DominioEscalaGlasgowAberturaOcular;
import br.gov.mec.aghu.dominio.DominioEscalaGlasgowCapacidadeMotora;
import br.gov.mec.aghu.dominio.DominioEscalaGlasgowComunicacaoVerbal;
import br.gov.mec.aghu.core.persistence.BaseEntitySeq;

/**
 * MpmEscalaGlasgows generated by hbm2java
 */

@Entity
@SequenceGenerator(name="mpmEgwSq1", sequenceName="AGH.MPM_EGW_SQ1", allocationSize = 1)
@Table(name = "MPM_ESCALA_GLASGOWS", schema = "AGH")
public class MpmEscalaGlasgow extends BaseEntitySeq<Integer> implements java.io.Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 2521099436791350536L;
	private Integer seq;
	private RapServidores servidor;
	private AghAtendimentos atendimento;
	private Date criadoEm;
	private DominioEscalaGlasgowAberturaOcular pontAberturaOcular;
	private DominioEscalaGlasgowCapacidadeMotora pontRespostaMotora;
	private DominioEscalaGlasgowComunicacaoVerbal pontComunicacaoVerbal;
	private Date dthrRealizacao;
	private Set<MpmFichaApache> fichasApache = new HashSet<MpmFichaApache>(0);
	private Set<MpmFichaPrism> fichasPrism = new HashSet<MpmFichaPrism>(0);

	public MpmEscalaGlasgow() {
	}

	public MpmEscalaGlasgow(Integer seq, RapServidores servidor,
			AghAtendimentos atendimento, Date criadoEm,
			DominioEscalaGlasgowAberturaOcular pontAberturaOcular,
			DominioEscalaGlasgowCapacidadeMotora pontRespostaMotora,
			DominioEscalaGlasgowComunicacaoVerbal pontComunicacaoVerbal,
			Date dthrRealizacao) {
		this.seq = seq;
		this.servidor = servidor;
		this.atendimento = atendimento;
		this.criadoEm = criadoEm;
		this.pontAberturaOcular = pontAberturaOcular;
		this.pontRespostaMotora = pontRespostaMotora;
		this.pontComunicacaoVerbal = pontComunicacaoVerbal;
		this.dthrRealizacao = dthrRealizacao;
	}

	public MpmEscalaGlasgow(Integer seq, RapServidores servidor,
			AghAtendimentos atendimento, Date criadoEm,
			DominioEscalaGlasgowAberturaOcular pontAberturaOcular,
			DominioEscalaGlasgowCapacidadeMotora pontRespostaMotora,
			DominioEscalaGlasgowComunicacaoVerbal pontComunicacaoVerbal,
			Date dthrRealizacao, Set<MpmFichaApache> fichasApache) {
		this.seq = seq;
		this.servidor = servidor;
		this.atendimento = atendimento;
		this.criadoEm = criadoEm;
		this.pontAberturaOcular = pontAberturaOcular;
		this.pontRespostaMotora = pontRespostaMotora;
		this.pontComunicacaoVerbal = pontComunicacaoVerbal;
		this.dthrRealizacao = dthrRealizacao;
		this.fichasApache = fichasApache;
	}

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO, generator = "mpmEgwSq1")
	@Column(name = "SEQ", unique = true, nullable = false, precision = 8, scale = 0)
	public Integer getSeq() {
		return this.seq;
	}

	public void setSeq(Integer seq) {
		this.seq = seq;
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

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "ATD_SEQ", nullable = false)
	public AghAtendimentos getAtendimento() {
		return this.atendimento;
	}

	public void setAtendimento(AghAtendimentos atendimento) {
		this.atendimento = atendimento;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "CRIADO_EM", nullable = false, length = 7)
	public Date getCriadoEm() {
		return this.criadoEm;
	}

	public void setCriadoEm(Date criadoEm) {
		this.criadoEm = criadoEm;
	}

	@Column(name = "PONT_ABERTURA_OCULAR", nullable = false, precision = 1, scale = 0)
	@org.hibernate.annotations.Type(parameters = { @Parameter(name = "enumClassName", value = "br.gov.mec.aghu.dominio.DominioEscalaGlasgowAberturaOcular") }, type = "br.gov.mec.aghu.core.model.jpa.DominioUserType")
	public DominioEscalaGlasgowAberturaOcular getPontAberturaOcular() {
		return this.pontAberturaOcular;
	}

	public void setPontAberturaOcular(DominioEscalaGlasgowAberturaOcular pontAberturaOcular) {
		this.pontAberturaOcular = pontAberturaOcular;
	}

	@Column(name = "PONT_RESPOSTA_MOTORA", nullable = false, precision = 1, scale = 0)
	@org.hibernate.annotations.Type(parameters = { @Parameter(name = "enumClassName", value = "br.gov.mec.aghu.dominio.DominioEscalaGlasgowCapacidadeMotora") }, type = "br.gov.mec.aghu.core.model.jpa.DominioUserType")
	public DominioEscalaGlasgowCapacidadeMotora getPontRespostaMotora() {
		return this.pontRespostaMotora;
	}

	public void setPontRespostaMotora(DominioEscalaGlasgowCapacidadeMotora pontRespostaMotora) {
		this.pontRespostaMotora = pontRespostaMotora;
	}

	@Column(name = "PONT_COMUNICACAO_VERBAL", nullable = false, precision = 1, scale = 0)
	@org.hibernate.annotations.Type(parameters = { @Parameter(name = "enumClassName", value = "br.gov.mec.aghu.dominio.DominioEscalaGlasgowComunicacaoVerbal") }, type = "br.gov.mec.aghu.core.model.jpa.DominioUserType")
	public DominioEscalaGlasgowComunicacaoVerbal getPontComunicacaoVerbal() {
		return this.pontComunicacaoVerbal;
	}

	public void setPontComunicacaoVerbal(DominioEscalaGlasgowComunicacaoVerbal pontComunicacaoVerbal) {
		this.pontComunicacaoVerbal = pontComunicacaoVerbal;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "DTHR_REALIZACAO", nullable = false, length = 7)
	public Date getDthrRealizacao() {
		return this.dthrRealizacao;
	}

	public void setDthrRealizacao(Date dthrRealizacao) {
		this.dthrRealizacao = dthrRealizacao;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "escalaGlasgow")
	public Set<MpmFichaApache> getFichasApache() {
		return this.fichasApache;
	}

	public void setFichasApache(Set<MpmFichaApache> fichasApache) {
		this.fichasApache = fichasApache;
	}
	
	@OneToMany(fetch = FetchType.LAZY, mappedBy = "escalaGlasgow")
	public Set<MpmFichaPrism> getFichasPrism() {
		return this.fichasPrism;
	}

	public void setFichasPrism(Set<MpmFichaPrism> fichasPrism) {
		this.fichasPrism = fichasPrism;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((seq == null) ? 0 : seq.hashCode());
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
		if (getClass() != obj.getClass()) {
			return false;
		}
		MpmEscalaGlasgow other = (MpmEscalaGlasgow) obj;
		if (seq == null) {
			if (other.seq != null) {
				return false;
			}
		} else if (!seq.equals(other.seq)) {
			return false;
		}
		return true;
	}
	
	public enum Fields {
		SEQ("seq"),
		SERVIDOR("servidor"),
		ATENDIMENTO("atendimento"),
		CRIADO_EM("criadoEm"),
		PONTA_BERTURA_OCULAR("pontAberturaOcular"),
		PONT_RESPOSTA_MOTORA("pontRespostaMotora"),
		PONT_COMUNICACAO_VERBAL("pontComunicacaoVerbal"),
		DTHR_REALIZACAO("dthrRealizacao"),
		FICHAS_APACHE("fichasApache"),
		FICHAS_PRISM("fichasPrism");
		
		private String fields;

		private Fields(String fields) {
			this.fields = fields;
		}

		@Override
		public String toString() {
			return this.fields;
		}
	}
	
}
