package hbi.core.dto;

import com.hand.hap.system.dto.BaseDTO;

import javax.persistence.*;
import java.util.Date;

/**
 * Created by 邹昆宏 on 2017/1/11.
 */
@Table(name = "HAP_OM_ORDER_HEADERS")
public class HapOmOrderHeader extends BaseDTO {
    @Id
    @Column(name = "HEADER_ID")
    @GeneratedValue(generator = "IDENTITY")
    private Long headerId;
    @Column(name = "ORDER_NUMBER")
    private String orderNumber;
    @Column(name = "COMPANY_ID")
    private Long companyId;
    @Column(name = "CUSTOMER_ID")
    private Long customerId;
    @Column(name = "ORDER_DATE")
    private Date orderDate;
    @Column(name = "ORDER_STATUS")
    private String orderStatus;
    @Transient
    private Double totalPrice;
    @Transient
    private HapArCustomer customer;
    @Transient
    private HapOrgCompany company;
    @Transient
    private String message;

    public HapOmOrderHeader() {
    }

    public Long getHeaderId() {
        return headerId;
    }

    public void setHeaderId(Long headerId) {
        this.headerId = headerId;
    }

    public String getOrderNumber() {
        return orderNumber;
    }

    public void setOrderNumber(String orderNumber) {
        this.orderNumber = orderNumber;
    }

    public Long getCompanyId() {
        return this.companyId;
    }

    public void setCompanyId(Long companyId) {
        this.companyId = companyId;
    }

    public Date getOrderDate() {
        return orderDate;
    }

    public void setOrderDate(Date orderDate) {
        this.orderDate = orderDate;
    }

    public String getOrderStatus() {
        return orderStatus;
    }

    public void setOrderStatus(String orderStatus) {
        this.orderStatus = orderStatus;
    }

    public Long getCustomerId() {
        return this.customerId;
    }

    public void setCustomerId(Long customerId) {
        this.customerId = customerId;
    }

    public Double getTotalPrice() {
        return totalPrice;
    }

    public void setTotalPrice(Double totalPrice) {
        this.totalPrice = totalPrice;
    }

    public HapArCustomer getCustomer() {
        return customer;
    }

    public void setCustomer(HapArCustomer customer) {
        this.customer = customer;
    }

    public HapOrgCompany getCompany() {
        return company;
    }

    public void setCompany(HapOrgCompany company) {
        this.company = company;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    @Override
    public String toString() {
        return "HapOmOrderHeader{" +
                "headerId=" + headerId +
                ", orderNumber='" + orderNumber + '\'' +
                ", companyId=" + companyId +
                ", orderDate=" + orderDate +
                ", orderStatus='" + orderStatus + '\'' +
                ", customerId=" + customerId +
                '}';
    }

}
