package org.zgif.model.node;

import java.util.Locale;

import org.joda.time.LocalDateTime;
import org.zgif.model.annotation.DataField;
import org.zgif.model.annotation.Node;
import org.zgif.model.datatype.enumeration.Subset;

@Node
public final class Meta extends AbstractNode {
    @DataField
    private String        format;
    @DataField
    private String        version;
    @DataField
    private Subset        process;
    @DataField
    private Locale        language = Locale.GERMANY;
    @DataField
    private LocalDateTime created;
    @DataField
    private LocalDateTime validated;
    @DataField
    private String        publisher;
    @DataField
    private String        creator;
    @DataField
    private String        validator;
    @DataField
    private String        description;

    public Meta() {
        super();
    }

    public String getFormat() {
        return format;
    }

    public void setFormat(String format) {
        this.format = format;
    }

    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    public Subset getProcess() {
        return process;
    }

    public void setProcess(Subset process) {
        this.process = process;
    }

    public Locale getLanguage() {
        return language;
    }

    public void setLanguage(Locale language) {
        this.language = language;
    }

    public LocalDateTime getCreated() {
        return created;
    }

    public void setCreated(LocalDateTime created) {
        this.created = created;
    }

    public LocalDateTime getValidated() {
        return validated;
    }

    public void setValidated(LocalDateTime validated) {
        this.validated = validated;
    }

    public String getPublisher() {
        return publisher;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    public String getCreator() {
        return creator;
    }

    public void setCreator(String creator) {
        this.creator = creator;
    }

    public String getValidator() {
        return validator;
    }

    public void setValidator(String validator) {
        this.validator = validator;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
