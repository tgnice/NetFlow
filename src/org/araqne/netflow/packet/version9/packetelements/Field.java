package org.araqne.netflow.packet.version9.packetelements;

import java.nio.ByteBuffer;

public interface Field {
	public void parse(ByteBuffer b);
}
