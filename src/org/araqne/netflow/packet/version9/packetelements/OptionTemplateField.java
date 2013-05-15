/**
 * 
 */
package org.araqne.netflow.packet.version9.packetelements;

import java.util.ArrayList;

/**
 * @author tgnice@nchovy.com
 *
 */
public class OptionTemplateField {

	short flowSetId;
	short length;
	short templateId;
	short optionScopeLength;
	short optionLength;
	ArrayList<Field> fields;
}
