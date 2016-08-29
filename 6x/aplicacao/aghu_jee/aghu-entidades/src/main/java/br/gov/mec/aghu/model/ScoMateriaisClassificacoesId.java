package br.gov.mec.aghu.model;

// Generated 21/06/2011 15:59:02 by Hibernate Tools 3.2.5.Beta

import javax.persistence.Column;
import javax.persistence.Embeddable;

import br.gov.mec.aghu.core.persistence.EntityCompositeId;

/**
 * ScoMateriaisClassificacoesId generated by hbm2java
 */
@Embeddable
public class ScoMateriaisClassificacoesId implements EntityCompositeId {

	/**
	 * 
	 */
	private static final long serialVersionUID = 3408458617458949398L;
	private Long cn5Numero;
	private Integer matCodigo;

	public ScoMateriaisClassificacoesId() {
	}

	public ScoMateriaisClassificacoesId(Long cn5Numero, Integer matCodigo) {
		this.cn5Numero = cn5Numero;
		this.matCodigo = matCodigo;
	}

	@Column(name = "CN5_NUMERO", nullable = false, precision = 12, scale = 0)
	public Long getCn5Numero() {
		return this.cn5Numero;
	}

	public void setCn5Numero(Long cn5Numero) {
		this.cn5Numero = cn5Numero;
	}

	@Column(name = "MAT_CODIGO", nullable = false, precision = 6, scale = 0)
	public Integer getMatCodigo() {
		return this.matCodigo;
	}

	public void setMatCodigo(Integer matCodigo) {
		this.matCodigo = matCodigo;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result
				+ ((cn5Numero == null) ? 0 : cn5Numero.hashCode());
		result = prime * result
				+ ((matCodigo == null) ? 0 : matCodigo.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj){
			return true;
		}
		if (obj == null){
			return false;
		}
		if (getClass() != obj.getClass()){
			return false;
		}
		ScoMateriaisClassificacoesId other = (ScoMateriaisClassificacoesId) obj;
		if (cn5Numero == null) {
			if (other.cn5Numero != null){
				return false;
			}
		} else if (!cn5Numero.equals(other.cn5Numero)){
			return false;
		}
		if (matCodigo == null) {
			if (other.matCodigo != null){
				return false;
			}
		} else if (!matCodigo.equals(other.matCodigo)){
			return false;
		}
		return true;
	}
}