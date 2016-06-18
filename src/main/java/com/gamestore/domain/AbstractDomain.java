package com.gamestore.domain;

import java.io.Serializable;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

public abstract class AbstractDomain<T extends AbstractDomain<T>> implements Serializable, Comparable<T>, Cloneable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	protected Long id;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	@Override
	public int hashCode() {
		return HashCodeBuilder.reflectionHashCode(this);
	}

	@Override
	public int compareTo(final T object) {
		if (object.getId() == this.id)
			return 0;
		else
			return 1;
	}

	@Override
	public boolean equals(final Object object) {
		return EqualsBuilder.reflectionEquals(object, this);
	}

	@Override
	public String toString() {
		return ToStringBuilder.reflectionToString(this, ToStringStyle.SHORT_PREFIX_STYLE);
	}

}
