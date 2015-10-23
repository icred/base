package org.zgif.model.node.entity;

import org.joda.time.LocalDate;
import org.zgif.model.annotation.Attribute;
import org.zgif.model.annotation.Node;
import org.zgif.model.annotation.ObjectIdentifier;
import org.zgif.model.node.AbstractNode;

@Node
public abstract class AbstractEntityNode extends AbstractNode {
    @Attribute
    @ObjectIdentifier
    protected String    objectIdSender;
    @Attribute
    protected String    objectIdReceiver;
    @Attribute
    protected LocalDate validFrom;
    @Attribute
    protected LocalDate validTo;
    @Attribute
    protected String    label;

    public String getObjectIdSender() {
        return objectIdSender;
    }

    public void setObjectIdSender(String objectIdSender) {
        this.objectIdSender = objectIdSender;
    }

    public String getObjectIdReceiver() {
        return objectIdReceiver;
    }

    public void setObjectIdReceiver(String objectIdReceiver) {
        this.objectIdReceiver = objectIdReceiver;
    }

    public LocalDate getValidFrom() {
        return validFrom;
    }

    public void setValidFrom(LocalDate validFrom) {
        this.validFrom = validFrom;
    }

    public LocalDate getValidTo() {
        return validTo;
    }

    public void setValidTo(LocalDate validTo) {
        this.validTo = validTo;
    }

    public String getLabel() {
        return label;
    }

    public void setLabel(String label) {
        this.label = label;
    }
}