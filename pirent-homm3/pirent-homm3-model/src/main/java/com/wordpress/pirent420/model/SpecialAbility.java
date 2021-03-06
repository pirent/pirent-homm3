package com.wordpress.pirent420.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

@Entity
@Table(name="special_ability")
public class SpecialAbility implements Serializable
{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer id;

	private String name;

	@ManyToMany(mappedBy="specialAbilities")
	// "Creature" is the owning side of this relationship
	private Collection<Creature> creatures;

	public SpecialAbility()
	{
		super();
	}

	public SpecialAbility(String name, Collection<Creature> creatures)
	{
		super();
		this.name = name;
		this.creatures = creatures;
	}

	public Integer getId()
	{
		return id;
	}

	public void setId(Integer id)
	{
		this.id = id;
	}

	public String getName()
	{
		return name;
	}

	public void setName(String name)
	{
		this.name = name;
	}

	public Collection<Creature> getCreatures()
	{
		return creatures;
	}

	public void setCreatures(Collection<Creature> creatures)
	{
		this.creatures = creatures;
	}

	@Override
	public int hashCode()
	{
		final int prime = 31;
		int result = 1;
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj)
	{
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		SpecialAbility other = (SpecialAbility) obj;
		if (id == null)
		{
			if (other.id != null)
				return false;
		}
		else if (!id.equals(other.id))
			return false;
		return true;
	}

	@Override
	public String toString()
	{
		List<String> creaturesNames = new ArrayList<String>();
		for (Creature c : getCreatures())
		{
			creaturesNames.add(c.getName());
		}

		StringBuilder builder = new StringBuilder();
		builder.append("SpecialAbility [id=").append(id).append(", name=")
				.append(name).append(", creatures=").append(", creatures=")
				.append(creaturesNames).append("]");
		return builder.toString();
	}
}
