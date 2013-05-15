package org.araqne.netflow.packet.version9.packetelements;

import java.util.ArrayList;

/**
 * @author tgnice@nchovy.com
 *
 */
public class DataFlowSet {

	short flowSetId;
	short length;
	ArrayList<Field> fields;
	short[] padding;
}
