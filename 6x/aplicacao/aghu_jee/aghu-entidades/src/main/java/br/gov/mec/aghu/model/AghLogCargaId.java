package br.gov.mec.aghu.model;

// Generated 09/04/2012 16:32:53 by Hibernate Tools 3.4.0.CR1

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Embeddable;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.hibernate.validator.constraints.Length;

import br.gov.mec.aghu.core.persistence.EntityCompositeId;

/**
 * AghLogCargaId generated by hbm2java
 */
@Embeddable
public class AghLogCargaId implements EntityCompositeId {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1254884699104915413L;
	private Date data;
	private String procedure;
	private String mensagem;
	private String linId;
	private String mensagem2;
	private Integer version;

	public AghLogCargaId() {
	}

	public AghLogCargaId(Integer version) {
		this.version = version;
	}

	public AghLogCargaId(Date data, String procedure, String mensagem, String linId, String mensagem2, Integer version) {
		this.data = data;
		this.procedure = procedure;
		this.mensagem = mensagem;
		this.linId = linId;
		this.mensagem2 = mensagem2;
		this.version = version;
	}

	@Column(name = "DATA", length = 29)
	public Date getData() {
		return this.data;
	}

	public void setData(Date data) {
		this.data = data;
	}

	@Column(name = "PROCEDURE", length = 40)
	@Length(max = 40)
	public String getProcedure() {
		return this.procedure;
	}

	public void setProcedure(String procedure) {
		this.procedure = procedure;
	}

	@Column(name = "MENSAGEM", length = 220)
	@Length(max = 220)
	public String getMensagem() {
		return this.mensagem;
	}

	public void setMensagem(String mensagem) {
		this.mensagem = mensagem;
	}

	@Column(name = "LIN_ID", length = 18)
	@Length(max = 18)
	public String getLinId() {
		return this.linId;
	}

	public void setLinId(String linId) {
		this.linId = linId;
	}

	@Column(name = "MENSAGEM2", length = 220)
	@Length(max = 220)
	public String getMensagem2() {
		return this.mensagem2;
	}

	public void setMensagem2(String mensagem2) {
		this.mensagem2 = mensagem2;
	}

	@Column(name = "VERSION", nullable = false)
	public Integer getVersion() {
		return this.version;
	}

	public void setVersion(Integer version) {
		this.version = version;
	}


	// ##### GeradorEqualsHashCodeMain #####
	@Override
	public int hashCode() {
		HashCodeBuilder umHashCodeBuilder = new HashCodeBuilder();
		umHashCodeBuilder.append(this.getData());
		umHashCodeBuilder.append(this.getVersion());
		umHashCodeBuilder.append(this.getMensagem());
		umHashCodeBuilder.append(this.getProcedure());
		umHashCodeBuilder.append(this.getLinId());
		umHashCodeBuilder.append(this.getMensagem2());
		return umHashCodeBuilder.toHashCode();
	}
	
	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (obj == null) {
			return false;
		}
		if (!(obj instanceof AghLogCargaId)) {
			return false;
		}
		AghLogCargaId other = (AghLogCargaId) obj;
		EqualsBuilder umEqualsBuilder = new EqualsBuilder();
		umEqualsBuilder.append(this.getData(), other.getData());
		umEqualsBuilder.append(this.getVersion(), other.getVersion());
		umEqualsBuilder.append(this.getMensagem(), other.getMensagem());
		umEqualsBuilder.append(this.getProcedure(), other.getProcedure());
		umEqualsBuilder.append(this.getLinId(), other.getLinId());
		umEqualsBuilder.append(this.getMensagem2(), other.getMensagem2());
		return umEqualsBuilder.isEquals();
	}
	// ##### GeradorEqualsHashCodeMain #####
	
}