package br.gov.mec.aghu.model;

import java.util.Date;

import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.hibernate.annotations.Parameter;

import br.gov.mec.aghu.dominio.DominioApgar5;
import br.gov.mec.aghu.dominio.DominioConvulsoesMultiplas;
import br.gov.mec.aghu.dominio.DominioPHSangue;
import br.gov.mec.aghu.dominio.DominioPesoNascer;
import br.gov.mec.aghu.dominio.DominioPig;
import br.gov.mec.aghu.dominio.DominioPressaoArterialMedia;
import br.gov.mec.aghu.dominio.DominioRazaoPO2PORFIO2;
import br.gov.mec.aghu.dominio.DominioTemperatura;
import br.gov.mec.aghu.dominio.DominioVolumeUnitario;
import br.gov.mec.aghu.core.persistence.BaseEntityId;

/**
 * McoSnappes generated by hbm2java
 */
@Entity
@Table(name = "MCO_SNAPPES", schema = "AGH")
public class McoSnappes extends BaseEntityId<McoSnappesId> implements java.io.Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -7481091329040719712L;
	private McoSnappesId id;
	private DominioPressaoArterialMedia pressaoArtMedia;
	private Integer pressaoArtMediaCodigo;
	private DominioApgar5 apgar5;
	private Integer apgar5Codigo;
	private DominioConvulsoesMultiplas convulsoesMultiplas;
	private Integer convulsoesMultiplasCodigo;
	private DominioPesoNascer pesoAoNascer;
	private Integer pesoAoNascerCodigo;
	private DominioPHSangue phDoSangue;
	private Integer phDoSangueCodigo;
	private DominioPig pig;
	private Integer pigCodigo;
	private DominioRazaoPO2PORFIO2 razaoPo2PorFio2;
	private Integer razaoPo2PorFio2Codigo;
	private DominioTemperatura temperatura;
	private Integer temperaturaCodigo;
	private DominioVolumeUnitario volUrinario;
	private Integer volUrinarioCodigo;
	private Short escoreSnappeii;
	private Date criadoEm;
	private Short serVinCodigo;
	private Integer serMatricula;
	private Date dthrSumarioAlta;
	private AipPacientes aipPacientes;  

	public McoSnappes() {
	}

	public McoSnappes(McoSnappesId id, DominioPressaoArterialMedia pressaoArtMedia, DominioApgar5 apgar5,
			DominioConvulsoesMultiplas convulsoesMultiplas, DominioPesoNascer pesoAoNascer, DominioPHSangue phDoSangue,
			DominioPig pig, DominioRazaoPO2PORFIO2 razaoPo2PorFio2, DominioTemperatura temperatura, DominioVolumeUnitario volUrinario,
			Short escoreSnappeii, Date criadoEm, Short serVinCodigo,
			Integer serMatricula) {
		this.id = id;
		this.pressaoArtMedia = pressaoArtMedia;
		this.apgar5 = apgar5;
		this.convulsoesMultiplas = convulsoesMultiplas;
		this.pesoAoNascer = pesoAoNascer;
		this.phDoSangue = phDoSangue;
		this.pig = pig;
		this.razaoPo2PorFio2 = razaoPo2PorFio2;
		this.temperatura = temperatura;
		this.volUrinario = volUrinario;
		this.escoreSnappeii = escoreSnappeii;
		this.criadoEm = criadoEm;
		this.serVinCodigo = serVinCodigo;
		this.serMatricula = serMatricula;
	}

	public McoSnappes(McoSnappesId id, DominioPressaoArterialMedia pressaoArtMedia, DominioApgar5 apgar5,
			DominioConvulsoesMultiplas convulsoesMultiplas, DominioPesoNascer pesoAoNascer, DominioPHSangue phDoSangue,
			DominioPig pig, DominioRazaoPO2PORFIO2 razaoPo2PorFio2, DominioTemperatura temperatura, DominioVolumeUnitario volUrinario,
			Short escoreSnappeii, Date criadoEm, Short serVinCodigo,
			Integer serMatricula, Date dthrSumarioAlta) {
		this.id = id;
		this.pressaoArtMedia = pressaoArtMedia;
		this.apgar5 = apgar5;
		this.convulsoesMultiplas = convulsoesMultiplas;
		this.pesoAoNascer = pesoAoNascer;
		this.phDoSangue = phDoSangue;
		this.pig = pig;
		this.razaoPo2PorFio2 = razaoPo2PorFio2;
		this.temperatura = temperatura;
		this.volUrinario = volUrinario;
		this.escoreSnappeii = escoreSnappeii;
		this.criadoEm = criadoEm;
		this.serVinCodigo = serVinCodigo;
		this.serMatricula = serMatricula;
		this.dthrSumarioAlta = dthrSumarioAlta;
	}

	@EmbeddedId
	@AttributeOverrides( {
			@AttributeOverride(name = "pacCodigo", column = @Column(name = "PAC_CODIGO", nullable = false, precision = 8, scale = 0)),
			@AttributeOverride(name = "seqp", column = @Column(name = "SEQP", nullable = false, precision = 3, scale = 0)) })
	public McoSnappesId getId() {
		return this.id;
	}

	public void setId(McoSnappesId id) {
		this.id = id;
	}

	@Column(name = "PRESSAO_ART_MEDIA", nullable = false, length = 1)
	@org.hibernate.annotations.Type(parameters = {
			@Parameter(name = "enumClassName", value = "br.gov.mec.aghu.dominio.DominioPressaoArterialMedia") }, 
			type = "br.gov.mec.aghu.core.model.jpa.DominioUserType")
	public DominioPressaoArterialMedia getPressaoArtMedia() {
		return this.pressaoArtMedia;
	}

	public void setPressaoArtMedia(DominioPressaoArterialMedia pressaoArtMedia) {
		this.pressaoArtMedia = pressaoArtMedia;
	}
	
	@Column(name = "PRESSAO_ART_MEDIA", insertable = false, updatable = false)
	public Integer getPressaoArtMediaCodigo() {
		return pressaoArtMediaCodigo;
	}

	public void setPressaoArtMediaCodigo(Integer pressaoArtMediaCodigo) {
		this.pressaoArtMediaCodigo = pressaoArtMediaCodigo;
	}

	@Column(name = "APGAR5", nullable = false, length = 1)
	@org.hibernate.annotations.Type(parameters = {
			@Parameter(name = "enumClassName", value = "br.gov.mec.aghu.dominio.DominioApgar5") }, 
			type = "br.gov.mec.aghu.core.model.jpa.DominioUserType")
	public DominioApgar5 getApgar5() {
		return this.apgar5;
	}

	public void setApgar5Codigo(Integer apgar5Codigo) {
		this.apgar5Codigo = apgar5Codigo;
	}
	
	@Column(name = "APGAR5", insertable = false, updatable = false)
	public Integer getApgar5Codigo() {
		return this.apgar5Codigo;
	}

	public void setApgar5(DominioApgar5 apgar5) {
		this.apgar5 = apgar5;
	}

	@Column(name = "CONVULSOES_MULTIPLAS", nullable = false, length = 0)
	@org.hibernate.annotations.Type(parameters = {
			@Parameter(name = "enumClassName", value = "br.gov.mec.aghu.dominio.DominioConvulsoesMultiplas") }, 
			type = "br.gov.mec.aghu.core.model.jpa.DominioUserType")
	public DominioConvulsoesMultiplas getConvulsoesMultiplas() {
		return this.convulsoesMultiplas;
	}

	public void setConvulsoesMultiplas(DominioConvulsoesMultiplas convulsoesMultiplas) {
		this.convulsoesMultiplas = convulsoesMultiplas;
	}
	
	@Column(name = "CONVULSOES_MULTIPLAS", insertable = false, updatable = false)
	public Integer getConvulsoesMultiplasCodigo() {
		return this.convulsoesMultiplasCodigo;
	}

	public void setConvulsoesMultiplasCodigo(Integer convulsoesMultiplasCodigo) {
		this.convulsoesMultiplasCodigo = convulsoesMultiplasCodigo;
	}

	@Column(name = "PESO_AO_NASCER", nullable = false, length = 1)
	@org.hibernate.annotations.Type(parameters = {
			@Parameter(name = "enumClassName", value = "br.gov.mec.aghu.dominio.DominioPesoNascer") }, 
			type = "br.gov.mec.aghu.core.model.jpa.DominioUserType")
	public DominioPesoNascer getPesoAoNascer() {
		return this.pesoAoNascer;
	}

	public void setPesoAoNascer(DominioPesoNascer pesoAoNascer) {
		this.pesoAoNascer = pesoAoNascer;
	}
	
	@Column(name = "PESO_AO_NASCER", insertable = false, updatable = false)
	public Integer getPesoAoNascerCodigo() {
		return this.pesoAoNascerCodigo;
	}

	public void setPesoAoNascerCodigo(Integer pesoAoNascerCodigo) {
		this.pesoAoNascerCodigo = pesoAoNascerCodigo;
	}	

	@Column(name = "PH_DO_SANGUE", nullable = false, length = 1)
	@org.hibernate.annotations.Type(parameters = {
			@Parameter(name = "enumClassName", value = "br.gov.mec.aghu.dominio.DominioPHSangue") }, 
			type = "br.gov.mec.aghu.core.model.jpa.DominioUserType")
	public DominioPHSangue getPhDoSangue() {
		return this.phDoSangue;
	}
	
	public void setPhDoSangue(DominioPHSangue phDoSangue) {
		this.phDoSangue = phDoSangue;
	}
	
	@Column(name = "PH_DO_SANGUE", insertable = false, updatable = false)
	public Integer getPhDoSangueCodigo() {
		return this.phDoSangueCodigo;
	}
	
	public void setPhDoSangueCodigo(Integer phDoSangueCodigo) {
		this.phDoSangueCodigo = phDoSangueCodigo;
	}

	@Column(name = "PIG", nullable = false, length = 1)
	@org.hibernate.annotations.Type(parameters = {
			@Parameter(name = "enumClassName", value = "br.gov.mec.aghu.dominio.DominioPig") }, 
			type = "br.gov.mec.aghu.core.model.jpa.DominioUserType")
	public DominioPig getPig() {
		return this.pig;
	}

	public void setPig(DominioPig pig) {
		this.pig = pig;
	}
	
	@Column(name = "PIG", insertable = false, updatable = false)
	public Integer getPigCodigo() {
		return this.pigCodigo;
	}

	public void setPigCodigo(Integer pigCodigo) {
		this.pigCodigo = pigCodigo;
	}

	@Column(name = "RAZAO_PO2_POR_FIO2", nullable = false, length = 1)
	@org.hibernate.annotations.Type(parameters = {
			@Parameter(name = "enumClassName", value = "br.gov.mec.aghu.dominio.DominioRazaoPO2PORFIO2") }, 
			type = "br.gov.mec.aghu.core.model.jpa.DominioUserType")
	public DominioRazaoPO2PORFIO2 getRazaoPo2PorFio2() {
		return this.razaoPo2PorFio2;
	}

	public void setRazaoPo2PorFio2(DominioRazaoPO2PORFIO2 razaoPo2PorFio2) {
		this.razaoPo2PorFio2 = razaoPo2PorFio2;
	}
	
	@Column(name = "RAZAO_PO2_POR_FIO2", insertable = false, updatable = false)
	public Integer getRazaoPo2PorFio2Codigo() {
		return this.razaoPo2PorFio2Codigo;
	}

	public void setRazaoPo2PorFio2Codigo(Integer razaoPo2PorFio2Codigo) {
		this.razaoPo2PorFio2Codigo = razaoPo2PorFio2Codigo;
	}

	@Column(name = "TEMPERATURA", nullable = false, precision = 2, scale = 0)
	@org.hibernate.annotations.Type(parameters = {
			@Parameter(name = "enumClassName", value = "br.gov.mec.aghu.dominio.DominioTemperatura") }, 
			type = "br.gov.mec.aghu.core.model.jpa.DominioUserType")
	public DominioTemperatura getTemperatura() {
		return this.temperatura;
	}

	public void setTemperatura(DominioTemperatura temperatura) {
		this.temperatura = temperatura;
	}
	
	@Column(name = "TEMPERATURA", insertable = false, updatable = false)
	public Integer getTemperaturaCodigo() {
		return this.temperaturaCodigo;
	}

	public void setTemperaturaCodigo(Integer temperaturaCodigo) {
		this.temperaturaCodigo = temperaturaCodigo;
	}

	@Column(name = "VOL_URINARIO", nullable = false, length = 1)
	@org.hibernate.annotations.Type(parameters = {
			@Parameter(name = "enumClassName", value = "br.gov.mec.aghu.dominio.DominioVolumeUnitario") }, 
			type = "br.gov.mec.aghu.core.model.jpa.DominioUserType")
	public DominioVolumeUnitario getVolUrinario() {
		return this.volUrinario;
	}

	public void setVolUrinario(DominioVolumeUnitario volUrinario) {
		this.volUrinario = volUrinario;
	}
	
	@Column(name = "VOL_URINARIO", insertable = false, updatable = false)
	public Integer getVolUrinarioCodigo() {
		return this.volUrinarioCodigo;
	}

	public void setVolUrinarioCodigo(Integer volUrinarioCodigo) {
		this.volUrinarioCodigo = volUrinarioCodigo;
	}

	@Column(name = "ESCORE_SNAPPEII", nullable = false, precision = 4, scale = 0)
	public Short getEscoreSnappeii() {
		return this.escoreSnappeii;
	}

	public void setEscoreSnappeii(Short escoreSnappeii) {
		this.escoreSnappeii = escoreSnappeii;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "CRIADO_EM", nullable = false, length = 7)
	public Date getCriadoEm() {
		return this.criadoEm;
	}

	public void setCriadoEm(Date criadoEm) {
		this.criadoEm = criadoEm;
	}

	@Column(name = "SER_VIN_CODIGO", nullable = false, precision = 3, scale = 0)
	public Short getSerVinCodigo() {
		return this.serVinCodigo;
	}

	public void setSerVinCodigo(Short serVinCodigo) {
		this.serVinCodigo = serVinCodigo;
	}

	@Column(name = "SER_MATRICULA", nullable = false, precision = 7, scale = 0)
	public Integer getSerMatricula() {
		return this.serMatricula;
	}

	public void setSerMatricula(Integer serMatricula) {
		this.serMatricula = serMatricula;
	}

	@Temporal(TemporalType.DATE)
	@Column(name = "DTHR_SUMARIO_ALTA", length = 7)
	public Date getDthrSumarioAlta() {
		return this.dthrSumarioAlta;
	}

	public void setDthrSumarioAlta(Date dthrSumarioAlta) {
		this.dthrSumarioAlta = dthrSumarioAlta;
	}
	
	@ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "PAC_CODIGO", insertable = false, updatable = false)
	public AipPacientes getAipPacientes() {
		return aipPacientes;
	}
	
	public void setAipPacientes(AipPacientes aipPacientes) {
		this.aipPacientes = aipPacientes;
	}
	
	public enum Fields {
		CODIGO_PACIENTE("id.pacCodigo"),
		SEQUENCE("id.seqp"),
		CRIADO_EM("criadoEm"),
        DTHR_SUMARIO_ALTA("dthrSumarioAlta"),
        PRESSAO_ART_MEDIA("pressaoArtMedia"),
        PRESSAO_ART_MEDIA_CODIGO("pressaoArtMediaCodigo"),
        APGAR5("apgar5"),
        APGAR5_CODIGO("apgar5Codigo"),
        CONVULSOES_MULTIPLAS("convulsoesMultiplas"),
        CONVULSOES_MULTIPLAS_CODIGO("convulsoesMultiplasCodigo"),
        PESO_AO_NASCER("pesoAoNascer"),
        PESO_AO_NASCER_CODIGO("pesoAoNascerCodigo"),
        PH_DO_SANGUE("phDoSangue"),
        PH_DO_SANGUE_CODIGO("phDoSangueCodigo"),
        PIG("pig"),
        PIG_CODIGO("pigCodigo"),
        TEMPERATURA("temperatura"),
        TEMPERATURA_CODIGO("temperaturaCodigo"),
        RAZAO_PO2_POR_FIO2("razaoPo2PorFio2"),
        RAZAO_PO2_POR_FIO2_CODIGO("razaoPo2PorFio2Codigo"),
        VOL_URINARIO("volUrinario"),
        VOL_URINARIO_CODIGO("volUrinarioCodigo"),
        ESCORE_SNAPPE_II("escoreSnappeii"),
        PACIENTE("aipPacientes");

		
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
		if (!(obj instanceof McoSnappes)) {
			return false;
		}
		McoSnappes other = (McoSnappes) obj;
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