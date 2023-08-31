package com.example.demo.entity;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import java.util.Date;

@Entity
@Table(name = "complaint")
public class Complaint {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "complaintid")
    private Long complaintid;

    @NotNull(message = "Complaint type is mandatory")
    private String complaintType;

    @NotNull(message = "Customer ID is mandatory")
    private Long customerid;

    @NotNull(message = "Date is mandatory")
    private Date date;

    @NotNull(message = "Status is mandatory")
    private String status;

    private String description; // New field for complaint description
    
    private Double rating; // New field for complaDouble rating
    
    private Long adminid;
    
    private String customerName;
    
    private String AdminComments;
    
    public String getAdminComments() {
		return AdminComments;
	}

	public void setAdminComments(String adminComments) {
		AdminComments = adminComments;
	}

	public String getCustomerName() {
		return customerName;
	}

	public Complaint(Long complaintid, @NotNull(message = "Complaint type is mandatory") String complaintType,
			@NotNull(message = "Customer ID is mandatory") Long customerid,
			@NotNull(message = "Date is mandatory") Date date, @NotNull(message = "Status is mandatory") String status,
			String description, Double rating, Long adminid, String customerName, String adminComments,
			Customer customer, Admin admin) {
		super();
		this.complaintid = complaintid;
		this.complaintType = complaintType;
		this.customerid = customerid;
		this.date = date;
		this.status = status;
		this.description = description;
		this.rating = rating;
		this.adminid = adminid;
		this.customerName = customerName;
		AdminComments = adminComments;
		this.customer = customer;
		this.admin = admin;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	public Complaint(Long complaintid, @NotNull(message = "Complaint type is mandatory") String complaintType,
			@NotNull(message = "Customer ID is mandatory") Long customerid,
			@NotNull(message = "Date is mandatory") Date date, @NotNull(message = "Status is mandatory") String status,
			String description, Double rating, Long adminid, String customerName, Customer customer, Admin admin) {
		super();
		this.complaintid = complaintid;
		this.complaintType = complaintType;
		this.customerid = customerid;
		this.date = date;
		this.status = status;
		this.description = description;
		this.rating = rating;
		this.adminid = adminid;
		this.customerName = customerName;
		this.customer = customer;
		this.admin = admin;
	}

	public Long getAdminid() {
		return adminid;
	}

	public void setAdminid(Long adminid) {
		this.adminid = adminid;
	}

	public Complaint() {
    }

    public Complaint(Long complaintid, @NotNull(message = "Complaint type is mandatory") String complaintType,
			@NotNull(message = "Customer ID is mandatory") Long customerid,
			@NotNull(message = "Date is mandatory") Date date, @NotNull(message = "Status is mandatory") String status,
			String description, Double rating, Long adminid, Customer customer, Admin admin) {
		super();
		this.complaintid = complaintid;
		this.complaintType = complaintType;
		this.customerid = customerid;
		this.date = date;
		this.status = status;
		this.description = description;
		this.rating = rating;
		this.adminid = adminid;
		this.customer = customer;
		this.admin = admin;
	}

	public Complaint(Long complaintid, String complaintType, Long customerid, Date date, String status, String description, Double rating) {
        this.complaintid = complaintid;
        this.complaintType = complaintType;
        this.customerid = customerid;
        this.date = date;
        this.status = status;
        this.description = description;
        this.rating = rating;
    }

    public Long getComplaintid() {
        return complaintid;
    }

    public void setComplaintid(Long complaintid) {
        this.complaintid = complaintid;
    }

    public String getComplaintType() {
        return complaintType;
    }

    public void setComplaintType(String complaintType) {
        this.complaintType = complaintType;
    }

    public Long getCustomerid() {
        return customerid;
    }

    public void setCustomerid(Long customerid) {
        this.customerid = customerid;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Double getRating() {
        return rating;
    }

    public void setRating(Double rating) {
        this.rating = rating;
    }


    @ManyToOne
    @JoinColumn(name = "customerid", insertable = false, updatable = false)
    private Customer customer;
    
    @ManyToOne
    @JoinColumn(name = "adminid", insertable = false, updatable = false)
    private Admin admin;
    
    public void setAdmin(Admin admin) {
        this.admin = admin;
        this.adminid = admin != null ? admin.getAdminid() : null;
    }



}