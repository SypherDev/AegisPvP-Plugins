package com.sxn.util;

import org.bukkit.metadata.MetadataValue;
import org.bukkit.plugin.Plugin;

public class Util {
	
	public static MetadataValue objectAsValue(Plugin plugin, Object object) {
		return new MetadataValue() {

			@Override
			public boolean asBoolean() {
				return false;
			}

			@Override
			public byte asByte() {
				return 0;
			}

			@Override
			public double asDouble() {
				return 0;
			}

			@Override
			public float asFloat() {
				return 0;
			}

			@Override
			public int asInt() {
				return 0;
			}

			@Override
			public long asLong() {
				return 0;
			}

			@Override
			public short asShort() {
				return 0;
			}

			@Override
			public String asString() {
				return null;
			}

			@Override
			public Plugin getOwningPlugin() {
				return plugin;
			}

			@Override
			public void invalidate() {				
			}

			@Override
			public Object value() {
				return object;
			}
			
		};
	}

}
