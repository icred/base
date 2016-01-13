/**
 * 
 */
package eu.icred.model;

import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import eu.icred.model.annotation.Attribute;
import eu.icred.model.annotation.ChildList;
import eu.icred.model.annotation.DataField;
import eu.icred.model.annotation.GroupNode;
import eu.icred.model.annotation.Node;
import eu.icred.model.annotation.ObjectIdentifier;
import eu.icred.model.node.AbstractNode;

/**
 * @author Pascal Houdek
 * 
 */
public class NodeInformation {

    private List<Field> fields = new ArrayList<Field>();
    private List<Field> attributeFields;
    private List<Field> dataFields;
    private List<Field> groupNodes;
    private List<Field> nodeLists;

    public NodeInformation(Class<? extends AbstractNode> clazz) {

        collectAllFieldsOfClass(clazz);

        List<Field> attributeFields = new ArrayList<Field>();
        List<Field> dataFields = new ArrayList<Field>();
        List<Field> groupNodes = new ArrayList<Field>();
        List<Field> nodeLists = new ArrayList<Field>();

        for (Field field : this.fields) {
            DataField datafield = field.getAnnotation(DataField.class);
            Attribute attribute = field.getAnnotation(Attribute.class);
            GroupNode groupnode = field.getAnnotation(GroupNode.class);
            ChildList childList = field.getAnnotation(ChildList.class);

            if (datafield != null) {
                    dataFields.add(field);
            }
            if (attribute != null) {
                attributeFields.add(field);
        }
            if (groupnode != null) {
                groupNodes.add(field);
            }
            if (childList != null) {
                nodeLists.add(field);
            }
        }

        this.attributeFields = Collections.unmodifiableList(attributeFields);
        this.dataFields = Collections.unmodifiableList(dataFields);
        this.groupNodes = Collections.unmodifiableList(groupNodes);
        this.nodeLists = Collections.unmodifiableList(nodeLists);
    }

    private void collectAllFieldsOfClass(Class<?> clazz) {
        while (!clazz.equals(Object.class)) {
            Collections.addAll(fields, clazz.getDeclaredFields());

            clazz = clazz.getSuperclass();
        }
    }

    /**
     * @author Pascal Houdek
     * @return the attributeFields
     */
    public List<Field> getAttributeFields() {
        return attributeFields;
    }

    public Field getIdentifierField() {
        for (Field field : attributeFields) {
            if(field.getAnnotation(ObjectIdentifier.class) != null) {
                return field;
            }
        }
        
        return null;
    }
    
    /**
     * @author Pascal Houdek
     * @return the dataFields
     */
    public List<Field> getDataFields() {
        return dataFields;
    }

    /**
     * @author Pascal Houdek
     * @return the groupNodes
     */
    public List<Field> getGroupNodes() {
        return groupNodes;
    }

    /**
     * @author Pascal Houdek
     * @return the nodeLists
     */
    public List<Field> getNodeLists() {
        return nodeLists;
    }

}
