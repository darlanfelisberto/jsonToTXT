package jsonToTXT;

import java.util.UUID;


public class Linha {
	@Override
	public String toString() {
		return  key +  value ;
	}
	String key;
	String value;
	UUID u = UUID.randomUUID();
	public Linha(String key, String value) {
		this.key = key;
		this.value = value;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((u == null) ? 0 : u.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		Linha other = (Linha) obj;
		if (u == null) {
			if (other.u != null)
				return false;
		} else if (!u.equals(other.u))
			return false;
		return true;
	}
	public String getKey() {
		return key;
	}
	public void setKey(String key) {
		this.key = key;
	}
	public String getValue() {
		return value;
	}
	public void setValue(String value) {
		this.value = value;
	}
	public UUID getU() {
		return u;
	}
	public void setU(UUID u) {
		this.u = u;
	}
	
	
	 
}