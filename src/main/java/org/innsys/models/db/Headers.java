package org.innsys.models.db;

import javax.persistence.*;

@Entity
@Table(name = "headers")
public class Headers {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Column(name = "user_id")
    private String userId;
    @Column(name = "service_name")
    private String serviceName;
    @Column(name = "channel_id")
    private String channelId;
    @Column(name = "function_id")
    private String functionId;
    @Column(name = "organization_id")
    private String organizationId;
    @Column(name = "cis_number")
    private String cisNumber;
    @Column(name = "language")
    private String language;

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public void setServiceName(String serviceName) {
        this.serviceName = serviceName;
    }

    public void setChannelId(String channelId) {
        this.channelId = channelId;
    }

    public void setFunctionId(String functionId) {
        this.functionId = functionId;
    }

    public void setOrganizationId(String organizationId) {
        this.organizationId = organizationId;
    }

    public void setCisNumber(String cisNumber) {
        this.cisNumber = cisNumber;
    }

    public void setLanguage(String language) {
        this.language = language;
    }


    public String getServiceName() {
        return serviceName;
    }

    public String getChannelId() {
        return channelId;
    }

    public String getFunctionId() {
        return functionId;
    }

    public String getOrganizationId() {
        return organizationId;
    }

    public String getCisNumber() {
        return cisNumber;
    }

    public String getLanguage() {
        return language;
    }
}
