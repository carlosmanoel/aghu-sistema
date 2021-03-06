package br.gov.mec.aghu.core.dao.test;

// Generated 24/02/2010 16:49:33 by Hibernate Tools 3.2.5.Beta

import java.math.BigDecimal;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.Transient;

import br.gov.mec.aghu.core.persistence.BaseEntitySeq;

/**
 * AghParametros generated by hbm2java
 */
@SuppressWarnings({"PMD.AghuUsoIndevidoDaEnumDominioSimNaoEntity"})
@Entity
@SequenceGenerator(name="aghPsiSq1", sequenceName="AGH.AGH_PSI_SQ1", allocationSize = 1)
@Table(name = "AGH_PARAMETROS", schema = "AGH")
@org.hibernate.annotations.Cache(region="ParametrosRegion", usage = org.hibernate.annotations.CacheConcurrencyStrategy.READ_ONLY)
public class AghParametros extends BaseEntitySeq<Integer> implements java.io.Serializable {

	private static final long serialVersionUID = 6559703111951269084L;
	
	private Integer seq;
	private String sisSigla;
	private AghSistemas sistema;
	private String nome;
	private Date criadoEm;
	private String criadoPor;
	private Date alteradoEm;
	private String alteradoPor;
	private Date vlrData;
	private BigDecimal vlrNumerico;
	private String vlrTexto;
	private String descricao;
	private String rotinaConsistencia;
	private String exemploUso;
	private Date vlrDataPadrao;
	private BigDecimal vlrNumericoPadrao;
	private String vlrTextoPadrao;
	
	public AghParametros() {
		
	}

		
	public AghParametros(Date vlrData) {
		this.vlrData = vlrData;
	}
	
	public AghParametros(String vlrTexto) {
		super();
		this.vlrTexto = vlrTexto;
	}

	public AghParametros(BigDecimal vlrNumerico) {
		this.vlrNumerico = vlrNumerico;
	}

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO, generator = "aghPsiSq1")
	@Column(name = "SEQ",  nullable = false, precision = 6, scale = 0)
	public Integer getSeq() {
		return this.seq;
	}

	public void setSeq(Integer seq) {
		this.seq = seq;
	}

	@Column(name="SIS_SIGLA", nullable=true, length=3, insertable=false, updatable=false)
	public String getSisSigla() {
		return this.sisSigla;
	}

	public void setSisSigla(String sisSigla) {
		this.sisSigla = sisSigla;
	}
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "SIS_SIGLA")
	public AghSistemas getSistema() {
		return sistema;
	}
	
	public void setSistema(AghSistemas sistema) {
		this.sistema = sistema;
	}

	@Column(name = "NOME", unique = true, nullable = false, length = 60)
	public String getNome() {
		return this.nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}


	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "CRIADO_EM", nullable = false, length = 7)
	public Date getCriadoEm() {
		return this.criadoEm;
	}

	public void setCriadoEm(Date criadoEm) {
		this.criadoEm = criadoEm;
	}

	@Column(name = "CRIADO_POR", nullable = false, length = 30)
	public String getCriadoPor() {
		return this.criadoPor;
	}

	public void setCriadoPor(String umNomeUsuario) {
		this.criadoPor = (umNomeUsuario != null && umNomeUsuario.length()>30) ? umNomeUsuario.substring(0, 30) : umNomeUsuario;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "ALTERADO_EM", length = 7)
	public Date getAlteradoEm() {
		return this.alteradoEm;
	}

	public void setAlteradoEm(Date alteradoEm) {
		this.alteradoEm = alteradoEm;
	}

	@Column(name = "ALTERADO_POR", length = 30)
	public String getAlteradoPor() {
		return this.alteradoPor;
	}

	public void setAlteradoPor(String umNomeUsuario) {
		this.alteradoPor = (umNomeUsuario != null && umNomeUsuario.length()>30) ? umNomeUsuario.substring(0, 30) : umNomeUsuario;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "VLR_DATA", length = 7)
	public Date getVlrData() {
		return this.vlrData;
	}

	public void setVlrData(Date vlrData) {
		this.vlrData = vlrData;
	}

	@Column(name = "VLR_NUMERICO", precision = 20, scale = 0)
	public BigDecimal getVlrNumerico() {
		return this.vlrNumerico;
	}

	public void setVlrNumerico(BigDecimal vlrNumerico) {
		this.vlrNumerico = vlrNumerico;
	}

	@Column(name = "VLR_TEXTO", length = 2000)
	public String getVlrTexto() {
		return this.vlrTexto;
	}

	public void setVlrTexto(String vlrTexto) {
		this.vlrTexto = vlrTexto;
	}

	@Column(name = "DESCRICAO", length = 2000)
	public String getDescricao() {
		return this.descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	@Column(name = "ROTINA_CONSISTENCIA", length = 30)
	public String getRotinaConsistencia() {
		return this.rotinaConsistencia;
	}

	public void setRotinaConsistencia(String rotinaConsistencia) {
		this.rotinaConsistencia = rotinaConsistencia;
	}

	@Column(name = "EXEMPLO_USO")
	public String getExemploUso() {
		return exemploUso;
	}

	public void setExemploUso(String exemploUso) {
		this.exemploUso = exemploUso;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "VLR_DATA_PADRAO", length = 7)
	public Date getVlrDataPadrao() {
		return vlrDataPadrao;
	}

	public void setVlrDataPadrao(Date vlrDataPadrao) {
		this.vlrDataPadrao = vlrDataPadrao;
	}

	@Column(name = "VLR_NUMERICO_PADRAO", precision = 20, scale = 0)
	public BigDecimal getVlrNumericoPadrao() {
		return vlrNumericoPadrao;
	}

	public void setVlrNumericoPadrao(BigDecimal vlrNumericoPadrao) {
		this.vlrNumericoPadrao = vlrNumericoPadrao;
	}

	@Column(name = "VLR_TEXTO_PADRAO", length = 2000)
	public String getVlrTextoPadrao() {
		return vlrTextoPadrao;
	}

	public void setVlrTextoPadrao(String vlrTextoPadrao) {
		this.vlrTextoPadrao = vlrTextoPadrao;
	}
	
	public enum Fields {
		CODIGO("seq"),
		NOME("nome"),
		DESCRICAO("descricao"),
		EXEMPLO_USO("exemploUso"),
		VLR_NUMERICO("vlrNumerico"),
		VLR_DATA("vlrData"),
		VLR_TEXTO("vlrTexto");

		private String fields;

		private Fields(String fields) {
			this.fields = fields;
		}

		@Override
		public String toString() {
			return fields;
		}
	}

	
	
	@Transient
	public Object getValorPadrao() {
		return null;
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
		if (!(obj instanceof AghParametros)) {
			return false;
		}
		AghParametros other = (AghParametros) obj;
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
