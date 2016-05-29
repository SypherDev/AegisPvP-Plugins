package com.sxn.potionce;

import org.bukkit.metadata.MetadataValue;
import org.bukkit.plugin.Plugin;

public class NumericMetadata implements MetadataValue {

	private double value;
	
	public NumericMetadata(double value) {
		this.value = value;
	}
	
	@Override
	public boolean asBoolean() {
		return false;
	}

	@Override
	public byte asByte() {
		return (byte) value;
	}

	@Override
	public double asDouble() {
		return value;
	}

	@Override
	public float asFloat() {
		return (float) value;
	}

	@Override
	public int asInt() {
		return (int) value;
	}

	@Override
	public long asLong() {
		return (long) value;
	}

	@Override
	public short asShort() {
		return (short) value;
	}

	@Override
	public String asString() {
		return Double.toString(value);
	}

	@Override
	public Plugin getOwningPlugin() {
		return null;
	}

	@Override
	public void invalidate() {
		
	}

	@Override
	public Object value() {
		return value;
	}
	
	

}
