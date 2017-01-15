package hbi.core.dto;

import com.hand.hap.mybatis.annotation.Condition;
import com.hand.hap.system.dto.BaseDTO;

import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * Created by 邹昆宏 on 2017/1/11.
 */
@Table(name = "HAP_AR_CUSTOMERS")
public class HapArCustomer extends BaseDTO {
    @Id
    @Column(name = "CUSTOMER_ID")
    private Long customerId;
    @Column(name = "CUSTOMER_NUMBER")
    private String customerNumber;
    @Column(name = "CUSTOMER_NAME")
    @Condition(operator = LIKE)
    private String customerName;
    @Column(name = "COMPANY_ID")
    private Long companyId;

    public HapArCustomer() {
    }

    public Long getCustomerId() {
        return customerId;
    }

    public void setCustomerId(Long customerId) {
        this.customerId = customerId;
    }

    public String getCustomerNumber() {
        return customerNumber;
    }

    public void setCustomerNumber(String customerNumber) {
        this.customerNumber = customerNumber;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public Long getCompanyId() {
        return companyId;
    }

    public void setCompanyId(Long companyId) {
        this.companyId = companyId;
    }

    @Override
    public String toString() {
        return "HapArCustomer{" +
                "customerId=" + customerId +
                ", customerNumber='" + customerNumber + '\'' +
                ", customerName='" + customerName + '\'' +
                ", companyId=" + companyId +
                '}';
    }
}
