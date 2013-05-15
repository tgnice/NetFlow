package org.araqne.netflow.packet.version9.packetelements;

import java.util.ArrayList;

public class TemplateFlowSet {

	private short flowSetId;
	private short length;
	private short templateId;
	private short fieldCount;
	private ArrayList<RecordField> fields;
}
