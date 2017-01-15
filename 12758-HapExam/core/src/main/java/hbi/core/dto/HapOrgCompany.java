package hbi.core.dto;

import com.hand.hap.mybatis.annotation.Condition;
import com.hand.hap.system.dto.BaseDTO;

import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * Cby 邹昆宏 on 2017/1/11.
 */
@Table(name = "HAP_ORG_COMPANYS")
public class HapOrgCompany extends BaseDTO{
    @Id
    @Column(name = "COMPANY_ID")
    private Long companyId;
    @Column(name = "COMPANY_NUMBER")
    private String companyNumber;
    @Column(name = "COMPANY_NAME")
    @Condition(operator = LIKE)
    private String companyName;

    public HapOrgCompany() {
    }

    public Long getCompanyId() {
        return companyId;
    }

    public void setCompanyId(Long companyId) {
        this.companyId = companyId;
    }

    public String getCompanyNumber() {
        return companyNumber;
    }

    public void setCompanyNumber(String companyNumber) {
        this.companyNumber = companyNumber;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    @Override
    public String toString() {
        return "HapOrgCompany{" +
                "companyId=" + companyId +
                ", companyNumber='" + companyNumber + '\'' +
                ", companyName='" + companyName + '\'' +
                '}';
    }
}
