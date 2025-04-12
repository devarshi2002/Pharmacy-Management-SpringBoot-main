package com.pharmacy.Management.models;

import jakarta.persistence.*;
import java.time.LocalDateTime;

@Entity
@Table(name = "mail_responses")
public class MailResponse {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String supplierName;

    @Column(nullable = false)
    private String supplierEmail;

    @Column(nullable = false, columnDefinition = "TEXT")
    private String drugsRequested;

    @Column(nullable = false)
    private LocalDateTime sentAt;

    public MailResponse() {
        this.sentAt = LocalDateTime.now();
    }

    public MailResponse(String supplierName, String supplierEmail, String drugsRequested) {
        this.supplierName = supplierName;
        this.supplierEmail = supplierEmail;
        this.drugsRequested = drugsRequested;
        this.sentAt = LocalDateTime.now();
    }

    // Getters and Setters
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getSupplierName() {
        return supplierName;
    }

    public void setSupplierName(String supplierName) {
        this.supplierName = supplierName;
    }

    public String getSupplierEmail() {
        return supplierEmail;
    }

    public void setSupplierEmail(String supplierEmail) {
        this.supplierEmail = supplierEmail;
    }

    public String getDrugsRequested() {
        return drugsRequested;
    }

    public void setDrugsRequested(String drugsRequested) {
        this.drugsRequested = drugsRequested;
    }

    public LocalDateTime getSentAt() {
        return sentAt;
    }

    public void setSentAt(LocalDateTime sentAt) {
        this.sentAt = sentAt;
    }
}
