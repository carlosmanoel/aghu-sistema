package br.gov.mec.aghu.model;

// Generated 26/02/2010 17:37:25 by Hibernate Tools 3.2.5.Beta

import java.util.Date;

import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import javax.validation.constraints.NotNull;

import org.hibernate.validator.constraints.Length;

import br.gov.mec.aghu.core.persistence.BaseEntityId;

/**
 * McoIddGestBallards generated by hbm2java
 */
@Entity
@Table(name = "MCO_IDD_GEST_BALLARDS", schema = "AGH")
public class McoIddGestBallards extends BaseEntityId<McoIddGestBallardsId> implements java.io.Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 5214084928103085721L;
	private McoIddGestBallardsId id;
	private Boolean postura;
	private Boolean flexaoPunho;
	private Boolean flexaoBraco;
	private Boolean anguloPopliteo;
	private Boolean sinalDoXale;
	private Boolean calcanharOrelha;
	private Boolean pele;
	private Boolean lanugo;
	private Boolean superficiePlantar;
	private Boolean seio;
	private Boolean olhoOrelha;
	private Boolean genitaisMasculinos;
	private Boolean genitaisFemininos;
	private Date criadoEm;
	private Byte escoreBallard;
	private Byte igSemanas;
	private String igTexto;

	public McoIddGestBallards() {
	}

	public McoIddGestBallards(McoIddGestBallardsId id, Boolean postura,
			Boolean flexaoPunho, Boolean flexaoBraco, Boolean anguloPopliteo,
			Boolean sinalDoXale, Boolean calcanharOrelha, Boolean pele,
			Boolean lanugo, Boolean superficiePlantar, Boolean seio,
			Boolean olhoOrelha, Date criadoEm, Byte escoreBallard) {
		this.id = id;
		this.postura = postura;
		this.flexaoPunho = flexaoPunho;
		this.flexaoBraco = flexaoBraco;
		this.anguloPopliteo = anguloPopliteo;
		this.sinalDoXale = sinalDoXale;
		this.calcanharOrelha = calcanharOrelha;
		this.pele = pele;
		this.lanugo = lanugo;
		this.superficiePlantar = superficiePlantar;
		this.seio = seio;
		this.olhoOrelha = olhoOrelha;
		this.criadoEm = criadoEm;
		this.escoreBallard = escoreBallard;
	}

	public McoIddGestBallards(McoIddGestBallardsId id, Boolean postura,
			Boolean flexaoPunho, Boolean flexaoBraco, Boolean anguloPopliteo,
			Boolean sinalDoXale, Boolean calcanharOrelha, Boolean pele,
			Boolean lanugo, Boolean superficiePlantar, Boolean seio,
			Boolean olhoOrelha, Boolean genitaisMasculinos,
			Boolean genitaisFemininos, Date criadoEm, Byte escoreBallard,
			Byte igSemanas, String igTexto) {
		this.id = id;
		this.postura = postura;
		this.flexaoPunho = flexaoPunho;
		this.flexaoBraco = flexaoBraco;
		this.anguloPopliteo = anguloPopliteo;
		this.sinalDoXale = sinalDoXale;
		this.calcanharOrelha = calcanharOrelha;
		this.pele = pele;
		this.lanugo = lanugo;
		this.superficiePlantar = superficiePlantar;
		this.seio = seio;
		this.olhoOrelha = olhoOrelha;
		this.genitaisMasculinos = genitaisMasculinos;
		this.genitaisFemininos = genitaisFemininos;
		this.criadoEm = criadoEm;
		this.escoreBallard = escoreBallard;
		this.igSemanas = igSemanas;
		this.igTexto = igTexto;
	}

	@EmbeddedId
	@AttributeOverrides( {
			@AttributeOverride(name = "pacCodigo", column = @Column(name = "PAC_CODIGO", nullable = false, precision = 8, scale = 0)),
			@AttributeOverride(name = "serMatricula", column = @Column(name = "SER_MATRICULA", nullable = false, precision = 7, scale = 0)),
			@AttributeOverride(name = "serVinCodigo", column = @Column(name = "SER_VIN_CODIGO", nullable = false, precision = 3, scale = 0)) })
	@NotNull
	public McoIddGestBallardsId getId() {
		return this.id;
	}

	public void setId(McoIddGestBallardsId id) {
		this.id = id;
	}

	@Column(name = "POSTURA", nullable = false, precision = 1, scale = 0)
	@NotNull
	public Boolean isPostura() {
		return this.postura;
	}

	public void setPostura(Boolean postura) {
		this.postura = postura;
	}

	@Column(name = "FLEXAO_PUNHO", nullable = false, precision = 1, scale = 0)
	@NotNull
	public Boolean isFlexaoPunho() {
		return this.flexaoPunho;
	}

	public void setFlexaoPunho(Boolean flexaoPunho) {
		this.flexaoPunho = flexaoPunho;
	}

	@Column(name = "FLEXAO_BRACO", nullable = false, precision = 1, scale = 0)
	@NotNull
	public Boolean isFlexaoBraco() {
		return this.flexaoBraco;
	}

	public void setFlexaoBraco(Boolean flexaoBraco) {
		this.flexaoBraco = flexaoBraco;
	}

	@Column(name = "ANGULO_POPLITEO", nullable = false, precision = 1, scale = 0)
	@NotNull
	public Boolean isAnguloPopliteo() {
		return this.anguloPopliteo;
	}

	public void setAnguloPopliteo(Boolean anguloPopliteo) {
		this.anguloPopliteo = anguloPopliteo;
	}

	@Column(name = "SINAL_DO_XALE", nullable = false, precision = 1, scale = 0)
	@NotNull
	public Boolean isSinalDoXale() {
		return this.sinalDoXale;
	}

	public void setSinalDoXale(Boolean sinalDoXale) {
		this.sinalDoXale = sinalDoXale;
	}

	@Column(name = "CALCANHAR_ORELHA", nullable = false, precision = 1, scale = 0)
	@NotNull
	public Boolean isCalcanharOrelha() {
		return this.calcanharOrelha;
	}

	public void setCalcanharOrelha(Boolean calcanharOrelha) {
		this.calcanharOrelha = calcanharOrelha;
	}

	@Column(name = "PELE", nullable = false, precision = 1, scale = 0)
	@NotNull
	public Boolean isPele() {
		return this.pele;
	}

	public void setPele(Boolean pele) {
		this.pele = pele;
	}

	@Column(name = "LANUGO", nullable = false, precision = 1, scale = 0)
	@NotNull
	public Boolean isLanugo() {
		return this.lanugo;
	}

	public void setLanugo(Boolean lanugo) {
		this.lanugo = lanugo;
	}

	@Column(name = "SUPERFICIE_PLANTAR", nullable = false, precision = 1, scale = 0)
	@NotNull
	public Boolean isSuperficiePlantar() {
		return this.superficiePlantar;
	}

	public void setSuperficiePlantar(Boolean superficiePlantar) {
		this.superficiePlantar = superficiePlantar;
	}

	@Column(name = "SEIO", nullable = false, precision = 1, scale = 0)
	@NotNull
	public Boolean isSeio() {
		return this.seio;
	}

	public void setSeio(Boolean seio) {
		this.seio = seio;
	}

	@Column(name = "OLHO_ORELHA", nullable = false, precision = 1, scale = 0)
	@NotNull
	public Boolean isOlhoOrelha() {
		return this.olhoOrelha;
	}

	public void setOlhoOrelha(Boolean olhoOrelha) {
		this.olhoOrelha = olhoOrelha;
	}

	@Column(name = "GENITAIS_MASCULINOS", precision = 1, scale = 0)
	public Boolean getGenitaisMasculinos() {
		return this.genitaisMasculinos;
	}

	public void setGenitaisMasculinos(Boolean genitaisMasculinos) {
		this.genitaisMasculinos = genitaisMasculinos;
	}

	@Column(name = "GENITAIS_FEMININOS", precision = 1, scale = 0)
	public Boolean getGenitaisFemininos() {
		return this.genitaisFemininos;
	}

	public void setGenitaisFemininos(Boolean genitaisFemininos) {
		this.genitaisFemininos = genitaisFemininos;
	}

	@Temporal(TemporalType.DATE)
	@Column(name = "CRIADO_EM", nullable = false, length = 7)
	@NotNull
	public Date getCriadoEm() {
		return this.criadoEm;
	}

	public void setCriadoEm(Date criadoEm) {
		this.criadoEm = criadoEm;
	}

	@Column(name = "ESCORE_BALLARD", nullable = false, precision = 2, scale = 0)
	@NotNull
	public Byte getEscoreBallard() {
		return this.escoreBallard;
	}

	public void setEscoreBallard(Byte escoreBallard) {
		this.escoreBallard = escoreBallard;
	}

	@Column(name = "IG_SEMANAS", precision = 2, scale = 0)
	public Byte getIgSemanas() {
		return this.igSemanas;
	}

	public void setIgSemanas(Byte igSemanas) {
		this.igSemanas = igSemanas;
	}

	@Column(name = "IG_TEXTO", length = 60)
	@Length(max = 60)
	public String getIgTexto() {
		return this.igTexto;
	}

	public void setIgTexto(String igTexto) {
		this.igTexto = igTexto;
	}
	
	public enum Fields {
		CODIGO_PACIENTE("id.pacCodigo"),
		IG_SEMANAS("igSemanas"),
		CRIADO_EM("criadoEm");
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
		if (!(obj instanceof McoIddGestBallards)) {
			return false;
		}
		McoIddGestBallards other = (McoIddGestBallards) obj;
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

}